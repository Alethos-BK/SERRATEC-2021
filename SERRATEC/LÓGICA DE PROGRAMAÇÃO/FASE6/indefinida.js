/*
repetição indefinida

-enqunato -- while
    while(true){
    }

- repita -- do

*/
const prompt = require("prompt-sync")();


// var x = 1;
// var y = 2;

// while ( x <= 10){
//     var mult = 2 * x;
//     console.log("2 x", x, "=", mult);
//     x++;
// }

// do {
//     y++
//     console.log(y)
// } while (y < 6);

// //----------------

const LIMITE = 100;
var total = 0;
var cliente;

do {
cliente = prompt("Qual o final do seu CPF?");

    total ++
    // cliente = prompt("Qual o final do seu CPF?");

    console.log("Clientes na loja agora", total);
}
while(total < LIMITE) 
console.log("Lotou");

