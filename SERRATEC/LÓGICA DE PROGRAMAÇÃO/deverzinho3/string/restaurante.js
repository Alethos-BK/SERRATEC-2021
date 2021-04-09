const prompt = require("prompt-sync")();

/* preço kilo;
   total em gramas da REFEIÇÃO
   PRATO VAZIO = 465G
   MOSTRAR:
    nome restaurante
    prato vazio
    preço de 100gramas
    o peso consumido
    valor total
*/
var preco = Number(prompt("Quanto vale o quilo da refeição?"));
var refeicao = Number(prompt("Qual o valor em gramas da refeição?"));
var prato = 465;
var restaurante = "SELF-SERVICE";
var gramapreco = preco/10;
var total = (prato + refeicao) * gramapreco;

console.log(restaurante + "\n TARA DO PRATO: " + prato + "g\nPREÇO 100G: R$" + gramapreco);
console.log("PESO REFEIÇÃO: " + refeicao + "g\n VALOR TOTAL: R$" + total)
