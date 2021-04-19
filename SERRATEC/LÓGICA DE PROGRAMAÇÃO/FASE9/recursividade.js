const prompt = require("prompt-sync")();

var frases = prompt("Digite uma frase com não");

function otimista(frase){
 var nova = frase.replace("nao", "sim");

var posicao = nova.indexOf("nao");

if (posicao >= 0){
    return otimista(nova);
} 
return nova
}
var otimismo = otimista(frases);

console.log("COPO MEIO VAZIO: ", frases);
console.log("COPO MEIO VAZIO: ", otimismo);
