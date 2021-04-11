/*A “SuperCalc” é a calculadora que, além dos números, lê o operador que será aplicado, e depois realiza a operação.
 Considere as entradas na ordem: primeiro número, sinal (+, -, * ou /) e segundo número.
 
 */
const prompt = require("prompt-sync")();

var n1 = Number(prompt("Digite um numero"))
var n2 = Number(prompt("Agora digite outro número"))
var op = prompt("Digite o operador que desja fazer a expressão (+ - * /)");

if(op == "+"){
    console.log(n1,"+", n2, "=" ,n1 + n2);
}
else if(op == "-"){
    console.log(n1,"-", n2,"=" ,n1 - n2);
}
else if(op == "*"){
    console.log(n1,"*", n2, "=" ,n1 * n2)
}
else if(op == "/"){
    console.log(n1,"/", n2,"=" ,n1/n2)
}


