class Conta {
    public String numero;
    public double saldo;

    public Conta(String numero, double saldo){
        this.numero = numero;
        this.saldo = saldo;
    }

    public boolean sacar(double valor){
        if (valor > 0 && this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        } else {
            System.out.println("Saldo insuficiente");
            return false;
        }
    }

    public void depositar(double valor){
        if (valor > 0) {
            this.saldo += valor;
        }
    }

    public void consultarSaldo(){
        System.out.println("Saldo da conta: " + this.saldo);
    }

    public boolean transferir(Conta contaDestino, double valor){
        if (this.sacar(valor)) {
            contaDestino.depositar(valor);
            return true;
        } else {
            System.out.println("Transferência inválida");
            return false;
        }
    }
}

public class questao9 {
    public static void main(String[] args){
        Conta c1 = new Conta("1", 10);
        Conta c2 = new Conta("2", 200);
        
        // Operação de saque
        System.out.println("Operação de saque");
        c1.sacar(100); // Erro
        c2.sacar(100);
        c1.consultarSaldo();
        c2.consultarSaldo();
        System.out.println("");

        // Operação de depósito
        System.out.println("Operação de depósito");
        c1.depositar(100);
        c2.depositar(100);
        c1.consultarSaldo();
        c2.consultarSaldo();
        System.out.println("");

        // Operação de transferência
        System.out.println("Operação de transferência");
        c1.transferir(c2, 200); // Erro
        c2.transferir(c1, 100);
        c1.consultarSaldo();
        c2.consultarSaldo();
    }
}
