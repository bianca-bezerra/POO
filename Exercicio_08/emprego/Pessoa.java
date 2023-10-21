package emprego;

public class Pessoa {
    private String nome;
    private String sobrenome;

    public Pessoa(String nome,String sobrenome){
        this.nome = nome;
        this.sobrenome = sobrenome;
    }
    
    public String getNome(){
        return nome;
    }

    public String getSobrenome(){
        return sobrenome;
    }

    public String getNomeCompleto(){
        return nome + " " + sobrenome;
    }
}
