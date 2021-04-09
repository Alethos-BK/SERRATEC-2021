const prompt = require("prompt-sync")();

var m = 0;
var f = 0;

for(i =0; i < 35; i++){
    var aluno = prompt("Aluno digite M ou F: ")

    if (aluno == "F") f++;
    if (aluno == "M") m++
}

console.log("Total homens: ", m);
console.log("Total mulheres: ", f);
