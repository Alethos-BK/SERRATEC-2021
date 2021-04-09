/* 
INDEFINIDA: repete para sempre, enquanto a expressão é verdade

promoção da radio 93:
 Os primeiros que ligarem ganham um boné e camiseta de rádio

*/
const prompt = require("prompt-sync")();

const GANHADORES = 5;

var pessoas = 0;
var nome;
var soma;

console.log("                    ==RÁDIO 93==\n")
console.log("AS 5 PRIMERIRAS PESSOAS QUE LIGAREM GANHAM 1 BONÉ E UMA CAMISETA DA NOSSA RÁDIO\n")

while(pessoas < GANHADORES){
    nome = prompt("Olá bom dia, digite seu nome por favor")
    pessoas++
    console.log("PARÁBÉNS ",nome, "VOCÊ ACABA DE GANHAR UM BONÉ E UMA CAMISETA DE NOSSA RÁDIO" )
    
    soma = soma + nome;    
    
}

console.log("Obrigada a todos que participaram esse foi nosso sorteio de hoje! Nossos ganhadores foram: ", nome); 

