class Calculadora{
    private double operando1;
    private double operando2;

    Calculadora(double operando1, double operando2){
        this.operando1 = operando1;
        this.operando2 = operando2;
    }

    public double somar(){
        return operando1 + operando2;
    }

    public double multiplicar(){
        return operando1 * operando2;
    }
}

public class MainCalculadora{
    public static void main(String[] args){
        Calculadora calculadora = new Calculadora(10, 20);
        System.out.println(calculadora.somar());
        System.out.println(calculadora.operando1);  //ERRO
    }
}

