package tributo;

import java.util.ArrayList;

public class AuditoriaInterna {
    private ArrayList<Tributavel> tributaveis;

    public AuditoriaInterna(){
        this.tributaveis = new ArrayList<Tributavel>();
    }

    public void adicionar(Tributavel t){
        this.tributaveis.add(t);
    }

    public double calculaTributos(){
        double total = 0;
        for(Tributavel t : this.tributaveis){
            total += t.calculaTributo();
        }
        return total;
    }
}
