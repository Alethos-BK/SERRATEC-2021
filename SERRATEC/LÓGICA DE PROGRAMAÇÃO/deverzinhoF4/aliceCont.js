/*	É muito comum vermos promoções em mercados e shoppings
relacionadas ao valor das compras. Se a Alice fez suas 
compras em um shopping cuja promoção era que a cada R$ 190,00
em compras ela ganhava um cupom, quantos cupons ela ganhou?*/

const prompt = require("prompt-sync")();
var jogos = 345;
var videoGame = 1545;
var total = jogos + videoGame;

var cupom = parseInt(total/190)
console.log("Parabéns você acaba de ganhar ", cupom, "cupons");