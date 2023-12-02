package interfaces;

/* 9. Crie uma classe para testar os exemplos anteriores. Instancie várias formas
diferentes. Pegue duas formas chame em uma delas o método comparar
passando a outra como parâmetro e exiba o resultado. Repita para outras formas. */

public class Exemplo {
    public static void main(String[] args) {
            
            Quadrado quadrado = new Quadrado(10);
            Triangulo triangulo = new Triangulo(5,10);
            Circulo circulo = new Circulo(5);
            Trapezio trapezio = new Trapezio(5,10,15,10);
    
            System.err.println("Comparando quadrado com triangulo: "+quadrado.comparar(triangulo));
            System.err.println("Comparando quadrado com circulo: "+quadrado.comparar(circulo));
            System.err.println("Comparando quadrado com trapezio: "+quadrado.comparar(trapezio));
            System.err.println("Comparando triangulo com circulo: "+triangulo.comparar(circulo));
            System.err.println("Comparando triangulo com trapezio: "+triangulo.comparar(trapezio));
            System.err.println("Comparando circulo com trapezio: "+circulo.comparar(trapezio));
    }
}

/* 7. Refaça a questão 04 do exercício usando interfaces com os métodos propostos
em vez de herança. Crie também um script que instancie e teste diferentes formas
geométricas. */

class ExQuadrado{
    public static void main(String[] args) {

        Quadrado quadrado = new Quadrado(10);

        double area_quadrado = quadrado.calculaArea();
        double perimetro_quadrado = quadrado.calculaPerimetro();

        System.err.printf("Area do quadrado: %.2f\n",area_quadrado);
        System.err.printf("Perímetro do quadrado: %.2f\n\n",perimetro_quadrado);

    }
}

class ExTriangulo{
    public static void main(String[] args) {

        Triangulo triangulo = new Triangulo(5,10);

        double area_triangulo = triangulo.calculaArea();
        double perimetro_triangulo = triangulo.calculaPerimetro();

        System.err.printf("Area do triângulo: %.2f\n",area_triangulo);
        System.err.printf("Perímetro do triângulo: %.2f\n\n",perimetro_triangulo);
    }
}

class ExCirculo{
    public static void main(String[] args) {

        Circulo circulo = new Circulo(5);

        double area_circulo = circulo.calculaArea();
        double perimetro_circulo = circulo.calculaPerimetro();

        System.err.printf("Area do circulo: %.2f\n",area_circulo);
        System.err.printf("Perimetro do circulo: %.2f\n\n",perimetro_circulo);
    }
}

class ExTrapezio{
    public static void main(String[] args) {

        Trapezio trapezio = new Trapezio(5,10,15,10);

        double area_trapezio = trapezio.calculaArea();
        double perimetro_trapezio = trapezio.calculaPerimetro();

        System.err.printf("Area do trapezio: %.2f\n",area_trapezio);
        System.err.printf("Perimetro do trapezio: %.2f\n\n",perimetro_trapezio);
    }
}
