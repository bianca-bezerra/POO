package app;
public class Conta {
    private String numero;
    private String nome;
    private double saldo;

    //Construtor
    public Conta(String numero, double saldo, String nome) throws Exception {
        validarValor(saldo);
        
        this.numero = numero;
        this.depositar(saldo);
        this.nome = nome;
    }

    private void validarValor(double valor) throws ValorInvalidoError{
        if(valor < 0){
            throw new ValorInvalidoError("Valor negativo é inválido");
        }
    }

    public void sacar(double valor) throws Exception{
        validarValor(valor);
        if (this.saldo < valor) {
            throw new SaldoInsuficienteError("Saldo insuficiente");
        }
        this.saldo -= valor;
    }

    public void depositar(double valor) throws Exception{
        validarValor(valor);
        this.saldo += valor;
    }

    public double consultarSaldo(){
        return this.saldo;
    }

    public void transferir(Conta contaDestino, double valor) throws Exception{
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    public String twoString(){
        return "> Número da conta: " + numero + "\n> Dono da conta: " + nome;
    }

    public String getNome(){
        return nome;
    }

    public String getNumero(){
        return numero;
    }

    public double getSaldo(){
        return saldo;
    }

    public void setSaldo(double valor){
        this.saldo = valor;
    }
    
}
