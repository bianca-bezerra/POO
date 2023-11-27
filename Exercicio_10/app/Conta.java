package app;
public class Conta {
    private String numero;
    private String nome;
    private double saldo;


    public Conta(String numero, double saldo, String nome){
        if(saldo < 0){
            throw new Error("Saldo inválido");
        }
        this.numero = numero;
        this.saldo = saldo;
        this.nome = nome;
    }

    public void sacar(double valor){
        if (this.saldo < valor) {
            throw new Error("Saldo insuficiente");
        }
        this.saldo -= valor;
    }

    public void depositar(double valor){
        if (valor < 0) {
            throw new Error("Valor inválido");
        }
        this.saldo += valor;
    }

    public double consultarSaldo(){
        return this.saldo;
    }

    public void transferir(Conta contaDestino, double valor){
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    public String twoString(){
        return "> Número da conta: " + numero + "\n> Dono da conta: " + nome;
    }

    public String getNome(){
        return nome;
    }

    public String getNumero(){
        return numero;
    }

    public double getSaldo(){
        return saldo;
    }

    public void setSaldo(double valor){
        this.saldo = valor;
    }
    public static void main(String[] args){
        Conta c1 = new Conta("1", 100, "Bianca");
        Conta c2 = new Conta("2", 200, "Ruan");
    

        // Operação de transferência
        System.out.println("Operação de transferência");
        c1.transferir(c2, 200); // Erro
        c2.transferir(c1, 100);
        System.out.println(c1.consultarSaldo());
        System.out.println(c2.consultarSaldo());

}
}
