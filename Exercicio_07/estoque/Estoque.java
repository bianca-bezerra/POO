package estoque;
import java.text.ParseException;
import java.util.ArrayList;

public class Estoque {
    private ArrayList<ProdutoPerecivel> produtos = new ArrayList<>();

    public void inserir(ProdutoPerecivel produto){
        boolean prodExiste = false;

        for(Produto p : produtos){
            if(p.getID().equals(produto.getID())){
                prodExiste = true;
                break;
            }
        }
        if(!prodExiste) {
            produtos.add(produto);
        }
    }

    public Produto consultar(String Id){
        Produto prodProcurado = null;
        for(int i = 0; i < this.produtos.size(); i++){
            if(this.produtos.get(i).getID().equals(Id)){
                prodProcurado = this.produtos.get(i);
                break;
            }
        }
        return prodProcurado;
    }

    public void excluir(String Id){
        int indiceProcurado = -1;

        for(int i = 0; i < this.produtos.size(); i++){
            if(this.produtos.get(i).getID().equals(Id)){
                indiceProcurado = i;
                break;
            }
        }
        if(indiceProcurado != -1){
            this.produtos.remove(indiceProcurado);
        }
    }

    public void repor(String Id,int quantidade){
        Produto prodProcurado = consultar(Id);
        if(prodProcurado != null){
            prodProcurado.repor(quantidade);
        }

    }

    public void darBaixa(String Id,int quantidade){
        Produto prodProcurado = consultar(Id);
        if(prodProcurado != null){
            prodProcurado.darBaixa(quantidade);
        }
    }

    public void listarVencidos(){
        for(ProdutoPerecivel c : produtos){
            if(!c.isValido()){
                System.out.println(c.twoString());
            }
        }
    }

    public static void main(String[] args) throws ParseException {
        ProdutoPerecivel prod = new ProdutoPerecivel("15/10/2053", "1", "1", 0, 0);
        Estoque estoque = new Estoque();
        estoque.inserir(prod);
        estoque.repor("1", 2);
        estoque.darBaixa("1", 1);
        System.out.println(prod.twoString());
        System.out.println(estoque.consultar("1"));
        estoque.excluir("1");
        System.out.println(estoque.consultar("1"));
    }
}
