
var numero = 10;
var string = "20"

var resultado = numero + string

console.log(resultado) // 1020
console.log(typeof(resultado)) // string

/* Devido à tipagem dinâmica do JavaScript, ao somar valores de tipos diferentes, o número 5 é 
convertido em uma string para que possa ser concatenado com a string "10". O resultado impresso
será a concatenação das duas strings, ou seja, "510". Essa conversão implícita pode levar a 
resultados inesperados, como no exemplo, onde esperávamos uma soma aritmética.
*/
