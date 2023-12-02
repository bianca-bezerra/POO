package interfaces;

public class Triangulo implements FiguraGeometrica, IComparavel{
    private double lado;
    private double altura;

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

    @Override
    public int comparar(FiguraGeometrica figura) {
        if(figura.calculaArea() > this.calculaArea()){
            return 1;
        }else if(figura.calculaArea() < this.calculaArea()){
            return -1;
        }else{
            return 0;
        }
    }  
}
