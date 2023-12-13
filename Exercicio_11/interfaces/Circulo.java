package interfaces;

public class Circulo implements IFiguraGeometrica, IComparavel{
    private double raio;
    private double pi = 3.14;

    public Circulo(double raio){
        this.raio = raio;
    }

    @Override
    public double calculaArea(){
        return pi * (this.raio * this.raio);
    }

    @Override
    public double calculaPerimetro(){
        return 2 * pi * raio;
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
