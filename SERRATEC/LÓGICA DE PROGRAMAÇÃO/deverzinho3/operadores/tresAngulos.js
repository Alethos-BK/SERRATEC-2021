/* O programa “Três ângulos” lê os valores dos ângulos de uma forma, e escreve se as medidas formam um triângulo
 válido.*/

 const  prompt = require("prompt-sync")();

 var angulo1 = Number(prompt("Qual o valor de um dos angulos interno do triângulo?"));
 var angulo2 = Number(prompt("Qual o valor do outro angulo interno do triângulo?"));
 var angulo3 = Number(prompt("Qual o valor do ultimo angulo interno do triângulo?"));

 var medidas = (angulo1 + angulo2 + angulo3);
 var triangulo =  medidas == 180;

 console.log("As medidas formam um triângulo?", triangulo);