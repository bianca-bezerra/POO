package geometria;

public class Triangulo extends FiguraGeometrica{
    public double lado;
    public double altura;

    public Triangulo(double lado, double altura){
        this.lado = lado;
        this.altura = altura;
    }
    @Override
    public double calculaArea(){
        return (lado*altura)/2;
    }
    
    @Override
    public double calculaPerimetro(){
        return lado*3;
    }
}
