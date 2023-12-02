package geometria;

public class Quadrado extends FiguraGeometrica {
    public double lado;

    public Quadrado(double lado){
        this.lado = lado;
    }

    @Override
    public double calculaArea(){
        return lado*lado;
    }

    @Override
    public double calculaPerimetro(){
        return 4*lado;
    }
}
