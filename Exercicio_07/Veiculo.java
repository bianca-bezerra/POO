public class Veiculo{
    private String placa;
    private int ano;

    Veiculo(String placa,int ano){
        this.placa = placa;
        this.ano = ano;
    }
}

public class Carro extends Veiculo{
    private String modelo;

    Carro(String placa, int ano, String modelo){
        super(placa, ano);
        this.modelo = modelo;
    }
}

public class CarroEletrico extends Carro{
    private double autonomiaBateria;

    CarroEletrico(String placa, int ano,String modelo, double autonomiaBateria){
        super(placa, ano, modelo);
        this.autonomiaBateria = autonomiaBateria;        
    }
}