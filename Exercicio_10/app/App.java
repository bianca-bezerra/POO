package app;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

class App {

    Banco banco;
    String opcao;
    Scanner input;;

    public App(){
        banco = new Banco();
        input = new Scanner(System.in);
        opcao = "";
    }

    String menu(){
        String opcoes = "\n========== Bem-vindo ao APP do Banco ==========\n";
        opcoes += "\n1 - Cadastrar      2 - Consultar    3 - Sacar\n";
        opcoes += "\n4 - Depositar      5 - Excluir      6 - Transferir\n";
        opcoes += "\n7 - Totalizações\n";
        opcoes += "\n0 - Sair\n\n";
        opcoes += "> Escolha uma das operações acima: ";
        return opcoes;
    }
    

    void inserir(){
        System.out.println("\n>> Cadastrar conta\n");

        System.out.print("Informe o número da conta: ");
        String numero = input.nextLine();

        System.out.print("Informe o nome da conta: ");
        String nome = input.nextLine();

        Conta conta = new Conta(numero,0,nome);
        banco.inserir(conta);
    }

    Conta consulta(){
        System.out.print("Informe o numero da conta: ");
        String numero = input.nextLine();

        Conta contaProcurada = banco.consultar(numero);
        
        return contaProcurada;
    }

    void sacar(){
        Conta contaProcurada = consulta();

        System.out.print("Informe o valor que deseja sacar: ");
        Double valor = input.nextDouble();
        contaProcurada.sacar(valor);
    }

    void depositar(){
        Conta contaProcurada = consulta();

        System.out.print("Informe o valor que deseja depositar: ");
        Double valor = input.nextDouble();
        contaProcurada.depositar(valor);
    }

    void excluir(){
        Conta contaProcurada = consulta();
        banco.excluir(contaProcurada.getNumero());
    }

    void transferir(){
        System.out.print("Informe numero da conta a receber: ");
        String contaDebito = input.nextLine();

        System.out.print("Informe numero da conta a mandar: ");
        String contaCredito = input.nextLine();

        System.out.print("Informe o valor da transferência: ");
        Double valor = input.nextDouble();

        banco.transferir(contaCredito, contaDebito, valor);
        
    }

    void limparTela() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
        }
    }

    void pausar() {
        System.out.println("\n\nPressione <Enter> para continuar...");
        input.nextLine();
    }

    void escreverContasEmArquivo(String nomeArquivo) {
        try (BufferedWriter buffWrite = new BufferedWriter(new FileWriter(nomeArquivo))) {
            List<Conta> contas = banco.getContas();
            for (Conta conta : contas) {
                buffWrite.write(conta.getNumero() + "; " + conta.getSaldo() + "; " + conta.getNome() + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    void lerContasDoArquivo(String nomeArquivo) {
        try (BufferedReader buffRead = new BufferedReader(new FileReader(nomeArquivo))) {
            String linha;
            while ((linha = buffRead.readLine()) != null) {
                String[] partes = linha.split("; ");
                String numero = partes[0];
                double saldo = Double.parseDouble(partes[1]);
                String nome = partes[2];
                Conta conta = new Conta(numero, saldo, nome);
                banco.inserir(conta);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    void executar(){
        do{
            limparTela();
            System.out.print(menu());
            opcao = input.nextLine();
            
            switch(opcao){

                case "1":
                    inserir();
                    break;

                case "2":
                    Conta conta = consulta();
                    if(conta == null){
                        System.out.println("Conta não existente");
                        System.out.println();
                    }else{
                    System.out.println("Conta existente\n");
                    System.out.println(conta.twoString());

                    }
                    break;
                
                case "3":
                    sacar();
                    break;

                case "4":
                    depositar();
                    break;
                
                case "5":
                    excluir();
                    break;
                
                case "6":
                    transferir();
                    break;
                
                case "7":
                    Conta cont = consulta();
                    if (cont == null) {
                        System.out.println("Conta não existente");
                    } else {
                     System.out.println("Saldo: " + cont.getSaldo());
                    }
                break;
            }
            escreverContasEmArquivo("app/contas.txt");
            pausar();

        }while(!opcao.equals("0"));
        System.out.println("Operação encerrada");
    }

    public static void main(String[] args) {
        App app = new App();
        app.lerContasDoArquivo("app/contas.txt");
        app.executar();
    }
}