/*É considerado “Emancipado” qualquer pessoa a partir de 21 anos, ou o indivíduo do sexo masculino a partir dos 18 anos.
 Crie um programa para atestar a emancipação do cidadão segundo o ano do seu nascimento.*/
const prompt = require("prompt-sync")();
 
var idade = Number(prompt("Quando você nasceu?"));
var sexo = prompt("Qual o seu sexo?");

var i21 = idade <= 2000
var i18 = idade <= 2003

var menino = sexo == "masculino"
var menina = sexo == "feminino"; 

var pode = (i18 && menino) || (i21);

console.log("Sexo: ",sexo, "\nAno de nascimento: ", idade, "Cidadão emancipado? ", pode);