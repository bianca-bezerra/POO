package interfaces;

public class Circulo implements FiguraGeometrica, IComparavel{
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
