package estoque;

public class Produto {
    private String identificador;
    private String descricao;
    private int estoque;
    private double valorUnidade;

    public Produto(String identificador,String descricao, int estoque, double valor){
        this.identificador = identificador;
        this.descricao = descricao;
        this.estoque = estoque;
        this.valorUnidade = valor;

    }

    public String getID(){
        return identificador;
    }

    public int getQuantidade(){
        return estoque;
    }

    public void repor(int quantidade){
        this.estoque += quantidade;
    }

    public void darBaixa(int quantidade){
        this.estoque -= quantidade;
    }
}
