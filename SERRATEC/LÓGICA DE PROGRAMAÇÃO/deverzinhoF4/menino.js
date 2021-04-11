/*Observe as quatro equações abaixo, a partir das quais você pode identificar que cada figura (menino, tênis e apitos) 
possui um valor diferente. Seu desafio é descobrir qual é o resultado da última equação. Preste muita atenção, pois os detalhes 
fazem a diferença!*/ 

var parSapato = 10;
var meninoA = 5;
var apitos = 4;
var sapato = parSapato/2;
var apito = apitos/2;
var menino = meninoA - apito;

console.log("par sapoto + par sapato + par sapato = ", parSapato + parSapato + parSapato);
console.log("par sapato + menino com apito + menino com apito = ", parSapato + meninoA + meninoA);
console.log("menino apito + 2 apitos + 2 apitos = ",meninoA + apitos + apitos)
console.log("sapato + menino x 1 apito = ",sapato + menino * apito )

