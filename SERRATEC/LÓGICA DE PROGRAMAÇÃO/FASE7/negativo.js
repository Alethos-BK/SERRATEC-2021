/**
 O programa "negativo" irá solicitar a digitação do valor da dívida
 e oferecer um empréstimo do mesmo valor 
 
 */
const prompt = require("prompt-sync")();

var divida = Number(prompt("Digite o valor da dívida"));

console.log("Valor da dívida: ", divida);

divida = Math.abs(divida);

console.log("Valor liberado para empréstimo: R$", divida);
