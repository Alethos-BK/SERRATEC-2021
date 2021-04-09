/*O “Programa de fidelidade” solicitou a criação do sistema
 “Ver os seus pontos”, onde o cliente poderá consultar seu 
saldo de pontos. O cliente irá digitar um número inteiro
correspondente aos seus cupons. Cada cupom corresponde a 1
ponto.*/
const prompt = require("prompt-sync")();

var cupons = prompt("Digite quantos cupons você possui");
var pontos = cupons * 1;

console.log("De acordo com seus cupons você tem ", pontos," pontos no programa de fidelidade");

console.log("Agora se prepare pois na nossa nova promoção triplicaremos seus pontos"
)
var cupons = prompt("Digite quantos cupons você possui");
var pontos = cupons * 3;

console.log("Sua pontuação é deeeee", pontos);
