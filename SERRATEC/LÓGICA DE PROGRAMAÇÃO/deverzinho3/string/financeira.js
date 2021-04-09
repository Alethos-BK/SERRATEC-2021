const prompt = require("prompt-sync")();

var cliente = {
    nome: prompt("Digite seu nome por favor"),
    empresa: prompt("Em qual empresa o senhor(a) trabalha?"),
    funcao: prompt("E qual sua função nela?"),
    emprestimo: prompt("Ok, deseja um emprestimo de quanto?")
}

var credito = cliente.emprestimo * 86/100;

var linha0 = "Senhor(a) " + cliente.nome + ", você está com sorte! Pela sua função de " + cliente.funcao + ", e sua \n";
var linha1 = " excelente relação com a empresa" + cliente.empresa + ", foi aprovado um crédito em\n";
var linha2 = " sua conta corrente de R$" + credito.toFixed(2);

console.log(linha0 + linha1 + linha2);