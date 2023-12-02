package funcionario;

public class Presidente extends Funcionario{

    public Presidente(double salario) {
        super(salario);
    }

    @Override
    double getBonificacao() {
        return this.salario + 1000;
    }
}
