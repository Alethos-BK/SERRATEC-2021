// Para ajudar a criança que ainda não sabe contar “ímpar par”, o programa pergunta 
// até qual número ela quer contar, e quais ela quer ver (pares ou ímpares).

const prompt = require("prompt-sync")();

var nome = prompt("Digite seu nome ?");
console.log("==== Bem vindo", nome, "====")

var numero = Number(prompt("Digite até que numero você deseja contar ?"));
var vizualizar = prompt("Digite PAR ou IMPAR para vizualizar somente uma dessas opções ")
var cont = 0;

while (cont < numero) {

    cont++;

    if (vizualizar.toLowerCase() == "par") {
        
        if (cont % 2 == 0) {
            console.log("NUMERO PAR =>", cont);
        }
    } else if (vizualizar.toLowerCase() == "impar"){
        if (cont % 2 !== 0) {
            console.log("NUMERO IMPAR =>", cont);
        }
    } 
}