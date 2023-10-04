class Hora{
    private int hora;
    private int minuto;
    private int segundo;

    Hora(int hora, int minuto, int segundo){
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    public int getHora(){
        return hora;
    }
    public int getMin(){
        return minuto;
    }
    public int getSeg(){
        return segundo;
    }

    public String getHorario(){
        return "%02d:%02d:%02d".formatted(getHora(),getMin(),getSeg());
    }
}

public class MainHora {
    public static void main(String[] args) {
        Hora horario = new Hora(15, 30, 10);
        System.out.println(horario.getHorario());
    }
}
