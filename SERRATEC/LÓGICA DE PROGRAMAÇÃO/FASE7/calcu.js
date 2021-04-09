const prompt = require("prompt-sync")();

var n1 = Number(prompt("Digite um número"));
var n2 = Number(prompt("Digite outro numero"));
var operador = prompt("Deseja realizar a operação + - * /?")

var mais = n1 + n2;
var menor = n1 - n2;
var vezes = n1 * n2;
var dividir = n1 / n2
var mensagem;

switch(operador){
    case "+": mensagem = mais; break
    case "-": mensagem = menos; break
    case "*": mensagem = vezes; break
    case "/": mensagem = dividir; break
}
console.log(mensagem);

