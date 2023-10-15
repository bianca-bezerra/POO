package calculadora;

public class Calculadora {
    private double operando1;
    private double operando2;

    Calculadora(double operando1,double operando2){
        this.operando1 = operando1;
        this.operando2 = operando2;
    }

    public double getOperando1(){
        return operando1;
    }

    public double getOperando2(){
        return operando2;
    }

    public double soma(){
        return operando1 + operando2;
    }

    public double multiplicacao(){
        return operando1 * operando2;
    }
}
