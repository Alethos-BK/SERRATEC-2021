/*O programa “Relacionais” lê os inteiros A e B. Utilizando variáveis booleanas, escreve na tela o resultado de cada operação 
relacional com os números.*/

const prompt = require("prompt-sync")();

var a = parseInt(prompt("Digite um número"))
var b = parseInt(prompt("Digite outro número"))

var igual = a == b;
var diferente = a != b;

var maior = a > b;
var maiorIG = a >= b;

var menor = a < b;
var menorIG = a <= b;

console.log('A = B', igual, "\nA != B", diferente, "\nA > B", maior, "\nA >= B", maiorIG, "\nA < B", menor, "\nA <= B", menorIG);