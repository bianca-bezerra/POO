class equipamento{
    public boolean ligado;
    public void liga(){
        if(this.ligado){
            System.out.println("Já está ligado");
        }else{
            this.ligado = true;
        }
    }
    public void desliga(){
        if(!this.ligado){
            System.out.println("Já está desligado");
        }else{
            this.ligado = false;
        }
    }
    public void inverte(){
        if(this.ligado == true){
            this.ligado = false;
        }else{
            this.ligado = true;
        }
    }
    public void estaLigado(){
        System.out.println(this.ligado);
    }
}

public class questao8 {
    public static void main(String[] args){
        equipamento luz = new equipamento();
        luz.liga();
        luz.desliga();
        luz.inverte();
        luz.estaLigado();
    }
}
