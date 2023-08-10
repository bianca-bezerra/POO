class Circulo {
    raio : number = 0;

    calculaArea() {
        return (this.raio ** 2) * Math.PI;
    }

    calculaPerimetro(){
        return 2 * Math.PI * this.raio;
    }
}

let meuCirculo : Circulo;
meuCirculo = new Circulo()
meuCirculo.raio = 10;
console.log(meuCirculo.calculaArea())
console.log(meuCirculo.calculaPerimetro())
