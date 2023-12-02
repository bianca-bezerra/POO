package funcionario;

public class Gerente extends Funcionario{

    public Gerente(double salario){
        super(salario);
    }

    @Override
    double getBonificacao() {
        return this.salario * 0.4;
    }
  
}
