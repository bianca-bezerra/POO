package app;
public class Poupanca extends Conta {
    private double taxaJuros;

    public Poupanca(double taxaJuros,String numero, double saldo, String nome) throws Exception{
        super(numero, saldo, nome);
        this.taxaJuros = taxaJuros;
    }

    public void renderJuros() throws Exception{
        this.depositar(this.getSaldo() * this.taxaJuros/100);
    }

    public double getTaxa(){
        return taxaJuros;
}
}
