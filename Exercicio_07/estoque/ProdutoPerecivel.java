package estoque;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ProdutoPerecivel extends Produto {
    private Date validade;
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public ProdutoPerecivel(String dataValidade, String identificador, String descricao, int estoque, double valor) throws ParseException {
        super(identificador, descricao, estoque, valor);
        this.validade = sdf.parse(dataValidade);
    }

    public boolean isValido() {
        Date dataAtual = new Date();
        if (dataAtual.after(validade)) {
            return false; 
        }
        return true;
    }

    public String twoString(){
        return "> Id do produto: " + getID() + "\nQuantidade: " + getQuantidade();
    }

    @Override
    public void repor(int quantidade){
        if(isValido()){
            super.repor(quantidade);
        }
    }

    @Override
    public void darBaixa(int quantidade) {
        if (isValido()) {
            super.darBaixa(quantidade);
    }
}

}

