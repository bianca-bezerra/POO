class Conta {
    private String numero;
    private String nome;
    private double saldo;


    public Conta(String numero, double saldo, String nome){
        this.numero = numero;
        this.saldo = saldo;
        this.nome = nome;
    }

    boolean sacar(double valor){
        if (valor > 0 && this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        } return false;
    }

    void depositar(double valor){
        if (valor > 0) {
            this.saldo += valor;
        }
    }

    double consultarSaldo(){
        return this.saldo;
    }

    boolean transferir(Conta contaDestino, double valor){
        if (this.sacar(valor)) {
            contaDestino.depositar(valor);
            return true;
        }
            return false;
    }

    String twoString(){
        return "> Número da conta: " + numero + "\n> Dono da conta: " + nome;
    }

    String getNome(){
        return nome;
    }

    String getNumero(){
        return numero;
    }

    double getSaldo(){
        return saldo;
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