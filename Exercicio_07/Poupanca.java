public class Poupanca extends Conta {
    private double taxaJuros;

    public Poupanca(double taxaJuros,String numero, double saldo, String nome){
        super(numero, saldo, nome);
        this.taxaJuros = taxaJuros;
    }

    public void renderJuros(){
        this.depositar(this.getSaldo() * this.taxaJuros/100);
    }

    public double getTaxa(){
        return taxaJuros;
}
}
