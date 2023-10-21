package emprego;

public class Empregado{
    private double salario = 500;

    public Empregado(double salario){
        this.salario = salario;
    }

    public double calcularSalario(){
        return salario;
    }
}
