package interfaces;

public class Trapezio implements FiguraGeometrica, IComparavel{
    private double base_menor;
    private double base_maior;
    private double altura;
    private double lado;
    
    public Trapezio(double base_menor, double base_maior, double altura, double lado){
        this.base_menor = base_menor;
        this.base_maior = base_maior;
        this.altura = altura;
        this.lado = lado;
    }

    @Override
    public double calculaArea(){
        return ((this.base_maior + this.base_menor) * this.altura)/2;
    }

    @Override
    public double calculaPerimetro(){
        return lado * 2 + base_maior + base_menor;
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


