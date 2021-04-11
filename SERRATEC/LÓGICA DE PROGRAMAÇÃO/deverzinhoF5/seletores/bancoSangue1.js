const prompt = require("prompt-sync")();

console.log("              ==BANCO DE SANGUE==\n");
console.log("Responda apenas com 'sim' ou 'nao'")

var idade = prompt("É menor de 18 anos?");
var doenca = prompt("É portador de doenças de fígado??");
var doacaoR = prompt("Doou sangue a menos de 3 meses?");

var pode = !(idade == "sim" || 
doenca == "sim" || 
doacaoR == "sim");

if(pode)
    console.log("Pode doar sangue?", pode);
else{
    console.log("Pode doar sangue?", pode);
    
    if(idade == "sim")  console.log("Pois você é menor de 18 anos")
    if(doenca == "sim") console.log("Pois você é portador de doenças de fígado")
    if(doacaoR == "sim") console.log("Pois você doou sangue a menos de 3 meses") 
}
