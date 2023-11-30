package app;

public class AplicacaoError extends Exception {
    public AplicacaoError(String string){
        super(string);
    }
}

class ContaInexistenteError extends AplicacaoError{
    public ContaInexistenteError(String string){
        super(string);
    }
}

class SaldoInsuficienteError extends AplicacaoError{
    public SaldoInsuficienteError(String string){
        super(string);
    }
}

class ValorInvalidoError extends AplicacaoError{
    public ValorInvalidoError(String string){
        super(string);
    }
}

class PoupancaInvalidaError extends AplicacaoError{
    public PoupancaInvalidaError(String string){
        super(string);
    }
}

class EntradaInvalidaError extends AplicacaoError{

    public EntradaInvalidaError(String string) {
        super(string);
    }
}

 class ValorVazioError extends EntradaInvalidaError {
    public ValorVazioError(String string){
        super(string);
    }
}

class NumeroDeOpcaoInvalidoError extends EntradaInvalidaError {
    public NumeroDeOpcaoInvalidoError(String string) {
        super(string);
    }
}

