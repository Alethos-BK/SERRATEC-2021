const prompt = require("prompt-sync")();

var idade = prompt("Digite sua idade");
var pode = idade >= 18;

console.log("==ELEIÇÕES 2021==\nDigite sua idade: ", idade, "\nVocê já pode votar? ",pode );