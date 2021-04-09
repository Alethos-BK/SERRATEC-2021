/*O astrólogo que escreveu o sistema “Zodíaco” acredita que os nascidos sob o signo de Aquário são mais inteligentes
 que os demais.*/

const prompt = require("prompt-sync")();

var mes = prompt("Qual seu mês de nascimento?");
var dia = prompt("E o dia?");

var inicio = mes == 1 && dia >= 21;
var fim = mes ==2 && dia <= 19;
var aquario = inicio || fim;

console.log("Você é inteligente? ", aquario);

