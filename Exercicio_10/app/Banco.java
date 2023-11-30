package app;
import java.util.ArrayList;

public class Banco {

    private ArrayList<Conta> contas;
    

    public Banco(){
        this.contas = new ArrayList<>();
    }

    public ArrayList<Conta> getContas(){
        return contas;
    }
   
    public void inserir(Conta conta) throws ContaInexistenteError {
        try {
            consultar(conta.getNumero());
        } catch (ContaInexistenteError e) {
            contas.add(conta);
        }
    }

    public Conta consultar(String numero) throws ContaInexistenteError{
        Conta contaProcurada = null;
        for(Conta conta : contas){
            if(conta.getNumero().equals(numero)){
                contaProcurada = conta;
                break;
            }
        }
        if(contaProcurada == null){
            throw new ContaInexistenteError("Conta buscada não existe");
        }
        return contaProcurada;
    }

    private int consultarPorIndice(String numero) throws ContaInexistenteError{
        int indiceProcurado = -1;

        for(int i = 0; i < this.contas.size(); i++){
            if(this.contas.get(i).getNumero().equals(numero)){
                indiceProcurado = i;
                break;
            }
        }
        if(indiceProcurado == -1){
            throw new ContaInexistenteError("Conta buscada não existe");
        }
        return indiceProcurado;
    }

    public void alterar(Conta conta) throws ContaInexistenteError{
        int indiceProcurado = this.consultarPorIndice(conta.getNumero());
        contas.set(indiceProcurado, conta);
    }

    public void excluir(String numero) throws ContaInexistenteError{
        int indiceProcurado = this.consultarPorIndice(numero);
        this.contas.remove(indiceProcurado);
        
    }

    public void sacar(String numero, int valor) throws Exception{
        int indiceProcurado = this.consultarPorIndice(numero);
        Conta conta = this.contas.get(indiceProcurado);
        conta.sacar(valor);
        
    }

    public void transferir(String numeroCredito, String numeroDebito, double valor) throws Exception{
        Conta contaCredito = consultar(numeroCredito);
        Conta contaDebito = consultar(numeroDebito);

        contaCredito.transferir(contaDebito, valor);
    }

    public int consultarTamanho(ArrayList<Conta> contas){
        return contas.size();
    }

    public double obterTotal(ArrayList<Conta> contas){
        double soma = 0;
        for(Conta c : contas){
            soma += c.getSaldo();
        }

        return soma;
    }

    public double obterMedia(ArrayList<Conta> contas){
        return obterTotal(contas)/consultarTamanho(contas);
    }

    public void renderJuros(String numero) throws Exception{
        Conta conta = this.consultar(numero);
        if(!(conta instanceof Poupanca)){
            throw new PoupancaInvalidaError("A conta não é uma poupança");
        }
        ((Poupanca)conta).renderJuros();
    }

}