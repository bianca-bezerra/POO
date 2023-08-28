function dobrar(numeros : number[]){
    let dobrados : number[] = []
    for(let i = 0; i < numeros.length; i++){
        dobrados.push(numeros[i] * 2)
    }
    return dobrados
}

function somar(numeros: number[]){
    let soma = 0
    for(let i = 0; i < numeros.length; i++){
        soma += numeros[i]
    }
    return soma
}

function printar_lista(label : string,numeros: number[]){
    console.log(label)
    for(let i = 0; i < numeros.length; i++){
        console.log(numeros[i])
    }
}

let numeros = [1,2,3,4,5,6,7,8,9,10]

let numeros_dobrados = dobrar(numeros)
printar_lista("Números dobrados: ", numeros_dobrados)

let soma_dos_numeros = somar(numeros)
console.log(`Soma dos números dobrados: ${soma_dos_numeros}`)

