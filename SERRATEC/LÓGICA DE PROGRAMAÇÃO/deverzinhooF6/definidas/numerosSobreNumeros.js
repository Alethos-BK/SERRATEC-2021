// Em “números sobre números”, o programa solicita uma entrada inteira, mostra a sequência 
// decrescente entre número até 1, e a soma de todos os valores da sequência.
const prompt = require("prompt-sync")();

var n = Number(prompt("Digite um numero inteiro"));
var soma = 0;

for(i = n; i > 0; i--){
    console.log(i);
    soma += i;
}
console.log("Soma da sequência: ", soma)

