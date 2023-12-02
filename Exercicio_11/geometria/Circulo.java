package geometria;

public class Circulo extends FiguraGeometrica{
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
}
