package geometria;

/*Imagine que você deve modelar várias figuras geométricas em TypeScript e que
cada uma tem sua forma específica de calcular área e perímetro. Proponha e
implemente uma hierarquia de classes usando uma classe abstrata chamada
FiguraGeometrica e outras concretas: Quadrado, Triangulo, etc. */

public abstract class FiguraGeometrica{

    public abstract double calculaArea();
    public abstract double calculaPerimetro();

}