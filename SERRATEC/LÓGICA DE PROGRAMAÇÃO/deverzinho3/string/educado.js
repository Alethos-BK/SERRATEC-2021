const prompt = require("prompt-sync")();

var nome = prompt("Qual seu nome?");
var nick = prompt(`QComo gostaria de ser chamado ${nome}? `);

console.log("Bom dia meu(a) caro(a),", nick);