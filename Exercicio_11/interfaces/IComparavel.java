package interfaces;

/* 8. Crie uma interface chamada IComparavel com um método chamado comparar que
receba uma forma geométrica como parâmetro e retorna um inteiro como
resultado. Implemente em cada uma das classes do exemplo anterior a interface
retornando -1, 0 e 1 caso a área da forma seja menor, igual ou maior que a
passada via parâmetro. */

public interface IComparavel {
    public int comparar(FiguraGeometrica figura);
}
