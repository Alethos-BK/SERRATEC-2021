/*Crie o programa “mini calculadora”,
que após ler dois números inteiros apresenta as
operações de soma, subtração, multiplicação e divisão com eles.*/

const prompt = require("prompt-sync")();

var n1 = parseFloat(prompt("Digite um número"));
var n2 = parseInt(prompt("Digite outro número"));

console.log("Soma desses valores", (n1 + n2));
console.log("Subtraindo desses valores", n1 - n2);
console.log("Multiplação", n1 * n2);
console.log("Divisão", n1 / n2);

