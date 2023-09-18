import java.util.ArrayList;

public class Microblog {
    
    ArrayList<Postagem> postagens = new ArrayList<>();

    //Incluir post no array de postagens
    void incluir(Postagem postagem){
        this.postagens.add(postagem);
    }

    //Excluir um post passando o ID 
    void excluir(double id) {
        int indiceProcurado = -1;
    
        for (int i = 0; i < this.postagens.size(); i++) {
            if (this.postagens.get(i).id == id) {
                indiceProcurado = i;
                break;
            }
        }
    
        if (indiceProcurado != -1) {
            for (int i = indiceProcurado; i < this.postagens.size() - 1; i++) {
                this.postagens.set(i, this.postagens.get(i + 1));
            }
            this.postagens.remove(this.postagens.size() - 1);
        }
    }
    
    //Consultar quantidade de posts 
    int consultarTamanho(ArrayList<Postagem> postagem){
        return postagem.size();
    }

    //Identificar o post mais curtido
    String maisCurtida() {
        double maiorCurtida = Double.NEGATIVE_INFINITY;
        Postagem postMaisCurtido = null;

        for(Postagem post : postagens){
            if(post.quantidadeCurtidas > maiorCurtida){
                postMaisCurtido = post;
                maiorCurtida = post.quantidadeCurtidas;
            }
        }
    
        return postMaisCurtido.twoString();
    }

    //Curtir post dando o ID dele
    void curtirPost(double id){
        for(Postagem post : postagens){
            if(post.id == id){
                post.curtir();
            }
        }
    }

    //Concatenação de todos os posts do array de postagens
    String twoStringFull(){
        String total = "";
        for(Postagem post : postagens){
            total += "Post " + post.id + "\n" + post.twoString() + "\n\n";
        }
        return total;
    }
    
    public static void main(String[] args) {
        Microblog blog = new Microblog();
        Postagem post1 = new Postagem(2,"oiii", 40);
        Postagem post2 = new Postagem(1,"oiii", 1000);
        Postagem post3 = new Postagem(3,"oiii", 100);

        blog.incluir(post1);
        blog.incluir(post2);
        blog.incluir(post3);
    }
}
