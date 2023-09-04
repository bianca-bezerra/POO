class Jogador{
    public double forca;
    public double nivel;
    public double pontos_atuais;

    public Jogador(double forca, double nivel, double pontos_atuais){
        this.forca = forca;
        this.nivel = nivel;
        this.pontos_atuais = pontos_atuais;
    }

    public double calcularAtaque(){
        return forca * nivel;
    }

    public void atacar(Jogador atacado){
        if(atacado.estaVivo()){
            double dano = calcularAtaque();
            atacado.pontos_atuais -= dano;
        }else{
            System.out.println("Já está morto");
        }
    }

    public boolean estaVivo(){
        return this.pontos_atuais > 0;
    }

    public String twoString(){
        return "Força: " + this.forca + 
               "\nNível: " + this.nivel + 
               "\nPontos: " + this.pontos_atuais + "\n";
    }
}

public class questao10 {
   public static void main(String[] args){
    Jogador jogador1 = new Jogador(10,2,600);
    Jogador jogador2 = new Jogador(10,1,300);

    while(jogador1.estaVivo() && jogador2.estaVivo()){
        jogador1.atacar(jogador2);
        jogador2.atacar(jogador1);
    }

    System.out.println("Jogador 1: \n" + jogador1.twoString());
    System.out.println("Jogador 2: \n"+ jogador2.twoString());

    if(jogador1.pontos_atuais > jogador2.pontos_atuais){
        System.out.println("Jogador 1 foi o vencedor!");
    }else{
        System.out.println("Jogador 2 foi o vencedor!");
    }
   }
    
}
