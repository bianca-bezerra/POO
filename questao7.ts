class TestaRetangulo {
    lado1: number = 0;
    lado2: number = 0;   
        
    CalcularArea() : number {
        return this.lado1 * this.lado2;
    }

    CalcularPerimetro() : number{
        return (this.lado1 * 2) + (this.lado2 * 2);
    }
}

let retangulo : TestaRetangulo;
retangulo = new TestaRetangulo();
retangulo.lado1 = 10
retangulo.lado2 = 15
console.log(retangulo.CalcularArea())
