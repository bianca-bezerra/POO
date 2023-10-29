package emprego;

import java.util.ArrayList;

public class FolhaDePagamento {
    public ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();

    FolhaDePagamento(ArrayList<Pessoa> pessoas){
        this.pessoas = pessoas;
    }

    public double calcularPagamentos(){
        double totalSalarios = 0;
        for (Pessoa pessoa : pessoas) {
            if (pessoa instanceof Funcionario) {
                totalSalarios += ((Funcionario) pessoa).getSalario();
            } else if (pessoa instanceof Professor) {
                totalSalarios += ((Professor) pessoa).getSalario();
            }
        }

        return totalSalarios;
    }
}

