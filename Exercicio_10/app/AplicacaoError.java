package app;

public class AplicacaoError extends Error {
    public AplicacaoError(String mensagem){
        super(mensagem);
    }
}

class ContaInexistenteError extends AplicacaoError{
    public ContaInexistenteError(String mensagem){
        super(mensagem);
    }
}

class SaldoInsuficienteError extends AplicacaoError{
    public SaldoInsuficienteError(String mensagem){
        super(mensagem);
    }
}

