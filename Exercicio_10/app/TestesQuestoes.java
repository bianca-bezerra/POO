package app;

public class TestesQuestoes {
    public static void main(String[] args) {

        //3) Realizar um saque que deixa o saldo negativo
        Conta bianca = new Conta("1",0,"Bianca");
        bianca.sacar(100); 
        // Resultado: Exception in thread "main" java.lang.Error: Saldo insuficiente


        //4) Criar duas contas e testar método transferir sem haver saldo suficiente
        Conta paulo = new Conta("2", 0, "Paulo");
        Conta ruan = new Conta("3", 0, "Ruan");
        paulo.transferir(ruan, -1); 
        /* Resultado: Pelo fato do método utilizado empregar o método sacar dentro de sua implementação,
        o lançamento de exceção devido ao saldo insuficiente se propaga para o método transferir.*/


        //5) Instancie uma classe banco e crie duas contas. Chame o método transferir novamente passando um valor que lance a exceção na classe conta.
        Banco bradesco = new Banco();
        Conta livia = new Conta("4", 0, "Livia");
        Conta ryan = new Conta("5", 0, "Ryan");
        bradesco.inserir(ryan);
        bradesco.inserir(livia);
        bradesco.transferir("4", "5", 100);
        //FALTA DIZER OQ EU ACHO
        
    }
}
