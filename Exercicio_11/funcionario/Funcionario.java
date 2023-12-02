package funcionario;

/*Implemente as classes Funcionario, Gerente e Diretor conforme o diagrama
exposto em sala: */

public abstract class Funcionario {

    protected double salario;
    public Funcionario(double salario){
        this.salario = salario;
    }

    abstract double getBonificacao();
}
