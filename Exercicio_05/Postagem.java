public class Postagem {
    double id;
    String texto;
    double quantidadeCurtidas;

    public Postagem(double id, String texto, double quantidadeCurtidas){
        this.id = id;
        this.texto = texto;
        this.quantidadeCurtidas = quantidadeCurtidas;
    }

    void curtir(){
        this.quantidadeCurtidas++;
    }

    String twoString(){
        return "Postagem: " + this.texto + "\n" + "Curtidas: " + this.quantidadeCurtidas;
    }


    public static void main(String[] args) {
        Postagem postagem = new Postagem(1,"oii",100);
        System.out.println(postagem.twoString());
    }
    
}
