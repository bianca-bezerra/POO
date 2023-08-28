function exibir(...letras : string[]){
    for(let i = 0; i < letras.length; i++){
        console.log(letras[i]);
    }
}

exibir("a", "b");
exibir("a", "b", "c");
exibir("a", "b", "c", "d");