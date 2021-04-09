const ler = require("prompt-sync")();

console.log("====BANCO DE SANGUE====");
console.log("Digite 'sim' ou 'não' nas restrições a seguir");

var idade= ler("Você está abaixo de 16 ou acima de 69 anos: ");
var peso=ler("Pesa menos de 50kg:");
var hepatite= ler("Portador de Hepatite:");
var malaria=ler("Já teve Malária: ");
var recente=ler("fez doação recente: ");


var resultado = !(
idade == "sim" ||
peso == "sim" ||
hepatite == "sim" ||
malaria == "sim" ||
recente == "sim"
);


console.log("==resultado==");
console.log("pode doar sangue?", resultado)