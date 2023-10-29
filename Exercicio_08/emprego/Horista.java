package emprego;

public class Horista extends Diarista {
    Horista(double salario){
        super(salario);
    }

    @Override
    public double calcularSalario(){
        return super.calcularSalario()/24;
    }
}
