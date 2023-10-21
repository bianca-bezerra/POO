package emprego;

public class Funcionario extends Pessoa {
    private String matricula;
    private double salario;

    Funcionario(String nome,String sobrenome,String matricula,double salario){
        super(nome, sobrenome);
        this.matricula = matricula;
        this.salario = salario;
    }

    public String getMatricula(){
        return matricula;
    }

    public double getSalario(){
        return salario;
    }

    public double calcularSalarioPrimeiraParcela(){
        return 0.6 * salario;
    }

    public double calcularSalarioSegundaParcela(){
        return 0.4 * salario;
    }
}
