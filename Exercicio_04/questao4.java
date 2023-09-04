class Radio {
    public int volume;
    public Radio(int volume){
        this.volume = volume;
    }
}

public class questao4 {
    public static void main(String[] args){
        Radio r = new Radio(0);
        r.volume = 100;
    }
}

/*  
Houve erro de compilação porque não foram dados parâmetros aos construtor na instância do
objeto "r".
*/
