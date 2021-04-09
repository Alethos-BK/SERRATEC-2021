/*Doar sangue é muito importante. Porém, nem todos podem fazê-lo. Não podem ser doadores os menores, nem portadores de doenças do fígado,
 tampouco quem já doou nos últimos 3 meses. Ajude o “Banco de sangue” a fazer a triagem dos voluntários que responderam ‘sim’
  para as restrições.

Menor de idade:
Portador de doença?
Doação recente?
Pode doar sangue?
*/
const prompt = require("prompt-sync")();

console.log("              ==BANCO DE SANGUE==\n");
console.log("Responda apenas com 'sim' ou 'nao'")

var idade = prompt("É menor de 18 anos?");
var doenca = prompt("É portador de doenças de fígado??");
var doacaoR = prompt("Doou sangue a menos de 3 meses?");

var pode = !(idade == "sim" || 
doenca == "sim" || 
doacaoR == "sim");

console.log("Pode doar sangue?", pode);

