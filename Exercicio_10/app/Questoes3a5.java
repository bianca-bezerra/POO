package app;

public class Questoes3a5 {
    public static void main(String[] args) throws Exception {
        Questao3.main(args);
        Questao4.main(args);
        Questao5.main(args);
    }
}

class Questao3 {
    /*3) Implemente como nos slides o lançamento da exceção no método sacar e realize
um teste para saques que deixariam o saldo negativo.*/
    public static void main(String[] args) throws Exception {
        Conta bianca = new Conta("1", 0, "Bianca");
        bianca.sacar(100);
    }
}

class Questao4{
    /*4) Crie duas contas e teste o método transferir de modo que a conta a ser debitada
não possua saldo suficiente. Explique o que ocorreu.*/
    public static void main(String[] args) throws Exception {
        Conta bianca = new Conta("1", 0, "Bianca");
        Conta ruan = new Conta("2", 0, "Ruan");
        bianca.transferir(ruan, 100);
}
/* O método 'transferir' utiliza o método 'sacar' e a conta de origem não possui saldo suficiente para realizar o saque,
o método sacar lança uma exceção SaldoInsuficienteError. Como essa exceção não está sendo tratada no método transferir,
ela se propaga para o método que chamou transferir, que, no o caso, é o método main. Por não ser tratada na main, o programa
é abortado.
*/
}

class Questao5{
    /*5) Instancie uma classe banco e crie duas contas. Adicione-as à instancia do banco.
Chame o método transferir novamente passando um valor que lance a exceção na
classe conta. Você considera que o lançamento da exceção foi “propagado” para o
método conta.transferir(), banco.transferir() e o método transferir do script app?
Como você avalia a confiabilidade dessa implementação. */
    public static void main(String[] args) throws Exception {
        Banco bradesco = new Banco();
        Conta livia = new Conta("4", 0, "Livia");
        Conta ryan = new Conta("5", 0, "Ryan");
        bradesco.inserir(ryan);
        bradesco.inserir(livia);
        bradesco.transferir("4", "5", 100);
}
/* Ao lançar uma exceção e não tratá-la, ela continuará sendo propagada para métodos superiores na pilha de chamadas.
Sendo assim, a confiabilidade dessa aplicação ainda não está ideal, pois, sem tratamento adequado em nenhuma camada,
o mecanismo padrão utilizado para lidar com o erro é abortar o programa, o que não é uma abordagem adequada.
Em um design robusto, é essencial implementar estratégias de tratamento de exceções em diferentes camadas da aplicação e garantir
que a aplicação continue em funcionamento.
 */
}
