// Vou tomar a tabuada! O aluno de matemática escolhe o número, e o sistema lhe ensina a contar.
const prompt = require("prompt-sync")();

console.log("==TABUADA==");

var n = prompt("Escolha um número para fazer a tabuada!");

for(i = 1; i <= 10; i++){
    var result = n * i;
    console.log(`${n} x ${i} = ${result}`);
}