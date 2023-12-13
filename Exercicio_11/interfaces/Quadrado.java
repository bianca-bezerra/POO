package interfaces;

public class Quadrado implements IFiguraGeometrica, IComparavel {
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
    public int comparar(IFiguraGeometrica figura) {

        if(this.calculaArea() > figura.calculaArea()){
            return 1;

        }else if(this.calculaArea() < figura.calculaArea()){
            return -1;

        }else{
            return 0;
        }
    }    
}
