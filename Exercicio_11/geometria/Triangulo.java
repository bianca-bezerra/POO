package geometria;

public class Triangulo extends FiguraGeometrica{
    public double lado;
    public double altura;

    public Triangulo(double lado, double altura){
        this.lado = lado;
        this.altura = altura;
    }
    public double calculaArea(){
        return (lado*altura)/2;
    }
    public double calculaPerimetro(){
        return lado*3;
    }
}
