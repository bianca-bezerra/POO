function eh_primo(numero : number) : boolean {

    let count = 0;
    for(let i = 1; i <= numero; i++){
        if(numero % i == 0){
            count++;
        }
    }
    if(count == 2){
        return true;
    }else{
        return false;
    }
}