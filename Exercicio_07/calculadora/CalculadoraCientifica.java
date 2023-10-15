package calculadora;

class CalculadoraCientifica extends Calculadora {
    CalculadoraCientifica(double operando1, double operando2){
        super(operando1, operando2);
    }

    public double exponenciar(){
        double res = 1;
        int aux = 1;
        while(aux <= getOperando2()){
            res *= getOperando1();
            aux += 1;
        }
        return res;
    }
    
    public static void main(String[] args){
        CalculadoraCientifica calculadora = new CalculadoraCientifica(4, 2);

        System.out.println(calculadora.exponenciar());

        //3- Foi necessário criar um método get para acessar os atributos da superclasse
    }
}

