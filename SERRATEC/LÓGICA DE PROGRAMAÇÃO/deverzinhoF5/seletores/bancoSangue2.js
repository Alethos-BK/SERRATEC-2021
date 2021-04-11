const prompt = require("prompt-sync")();

console.log("              ==BANCO DE SANGUE==\n");
console.log("Responda apenas com 'sim' ou 'nao'")


var idade = prompt("É menor de 18 anos?");

if(idade == "sim")
    console.log("Pode doar sangue? ", false);

else{
    var doenca = prompt("É portador de doenças de fígado??");
    
    if(doenca == "sim")
      console.log("Pode doar sangue? ", false);

    else {
      var doacaoR = prompt("Doou sangue a menos de 3 meses?");
      console.log("Pode doar sangue? ", false);
    }
}
// var resultado = !(idade == "sim" || 
// doenca == "sim" || 
// doacaoR == "sim");

// console.log("Pode doar sangue?", pode);


