package interfaces;

public class Quadrado implements FiguraGeometrica, IComparavel {
    private double lado;
    
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
