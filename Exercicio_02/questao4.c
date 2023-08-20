#include <stdio.h>

int main() {
    int numero_inteiro = 20;
    float numero_decimal = 9.5;
    
    int resultado = numero_inteiro + numero_decimal; 
    
    printf("Resultado: %d\n", resultado); // 29
    
    return 0;
}

/*
A tipagem fraca refere-se a característica da linguagem de realizar conversões 
automaticamente entre tipos diferentes de dados. A linguagem C permite operações 
entre tipos distintos, como no exemplo acima, onde variáveis de tipo inteiro
e decimal são somados por meio de uma conversão implícita.
*/
