package tributo;

public class ContaCorrente extends Conta implements Tributavel{
    
    public ContaCorrente(String nome, double saldo) {
        super(nome, saldo);
    }

    @Override
    public double calculaTributo() {
        return this.getSaldo() * 0.1;
    }
}
