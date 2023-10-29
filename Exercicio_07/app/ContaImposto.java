package app;
public class ContaImposto extends Conta{
    private double taxaDesconto;
    
    public ContaImposto(String numero, double saldo, double taxaDesconto, String nome) {
        super(numero, saldo, nome);
        this.taxaDesconto = taxaDesconto;
    }
    
    public boolean sacar(double valor) {
        double valorDesconto = valor * this.taxaDesconto / 100;
        return super.sacar(valor + valorDesconto);
    }

    public void depositar(double valor){
        double valorDesconto = valor * this.taxaDesconto/100;
        super.depositar(valor - valorDesconto);
    }
    
    public double taxaDesconto(){
        return this.taxaDesconto;
}
}
