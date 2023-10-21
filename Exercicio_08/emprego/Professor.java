package emprego;

public class Professor extends Funcionario {

    private String titulacao;
    
    Professor(String nome,String sobrenome,String matricula,double salario){
        super(nome, sobrenome, matricula, salario);
    }

    public String getTitulacao(){
        return titulacao;
    }

    @Override
    public double calcularSalarioPrimeiraParcela(){
        return getSalario();
    }

    @Override
    public double calcularSalarioSegundaParcela(){
        return 0;
    }

    
}
