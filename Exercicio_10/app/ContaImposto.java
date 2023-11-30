package app;
public class ContaImposto extends Conta{
    private double taxaDesconto;
    
    public ContaImposto(String numero, double saldo, double taxaDesconto, String nome) throws Exception {
        super(numero, saldo, nome);
        this.taxaDesconto = taxaDesconto;
    }
    
    public void sacar(double valor) throws Exception {
        double valorDesconto = valor * this.taxaDesconto / 100;
        super.sacar(valor + valorDesconto);
    }

    public void depositar(double valor) throws Exception{
        double valorDesconto = valor * this.taxaDesconto/100;
        super.depositar(valor - valorDesconto);
    }
    
    public double taxaDesconto(){
        return this.taxaDesconto;
}
}
