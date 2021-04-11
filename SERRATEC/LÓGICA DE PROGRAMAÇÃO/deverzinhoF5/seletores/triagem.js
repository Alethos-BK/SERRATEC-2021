/*
 8.	A finalidade do sistema "Triagem" é ajudar o hospital a identificar os pacientes vulneráveis a infecções. 
 O enfermeiro irá digitar o nome do paciente, e “marcar” se o “paciente foi vacinado”. Após as entradas, receberá a avaliação na tela.

    paciente: moises
    ja vacinado: ok
        [triagem]
    sujeito a infecção: false

 */
const prompt = require("prompt-sync")();

var nome = prompt("Qual o seu nome? ");
var vacina = prompt("Você já foi vacinado? Responda com 'sim' ou 'nao'");
var infec = !(vacina == "sim")


if(infec) {
    console.log("Sujeito a infecção: ", infec);
}
else {
    console.log("Sujeito a infecção: ", infec);
}
