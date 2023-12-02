package funcionario;

public class Diretor extends Funcionario{
    
    public Diretor(double salario){
        super(salario);
    }

    @Override
    double getBonificacao() {
        return this.salario * 0.6;
    }
}
