class Triangulo{
    public double a;
    public double b;
    public double c;

    public Triangulo(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public boolean eh_triangulo(){
        return (a > Math.abs(b - c)) && (a < b + c);
        }

    public boolean eh_equilatero(){
        if(!eh_triangulo()){
            return false;
        }
        return a == b & b == c;
    }

    public boolean eh_isoceles(){
        if(!eh_triangulo()){
            return false;
        }
        return a == b || b == c || a == c;
    }

    public boolean eh_escaleno(){
        if(!eh_triangulo()){
            return false;
        }

        return a != b && a != c && b != c;
    }
}
public class questao7 {
    public static void main(String[] args){
        Triangulo triangulo = new Triangulo(10,2,5);
        System.out.println("É triângulo? "+ triangulo.eh_triangulo());
        System.out.println("É equilátero? " + triangulo.eh_equilatero());
        System.out.println("É isósceles? " + triangulo.eh_isoceles());
        System.out.println("É escaleno? " + triangulo.eh_escaleno());
    }
}
