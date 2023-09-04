class Hotel {
    public int quantReservas;

    public Hotel(int quantReservas) {
        this.quantReservas = quantReservas;
    }
    
    public void adicionarReserva() {
        this.quantReservas++;
    }
}

public class questao3 {
    public static void main(String[] args){
        Hotel hotel = new Hotel(10);
        System.out.println("Quantidade de reservas: " + hotel.quantReservas);
    }
}