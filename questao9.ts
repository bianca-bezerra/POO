class SituacaoFinanceira {
    valorCreditos : number = 0;
    valorDebitos : number = 0;

    saldo(){
        return this.valorCreditos - this.valorDebitos
    }
}

let minhaSituacaoFinanceira : SituacaoFinanceira;
minhaSituacaoFinanceira = new SituacaoFinanceira();

minhaSituacaoFinanceira.valorCreditos = 360
minhaSituacaoFinanceira.valorDebitos = 200

console.log(minhaSituacaoFinanceira.saldo())
