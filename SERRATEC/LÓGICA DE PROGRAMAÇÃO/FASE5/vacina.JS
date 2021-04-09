/*VACINA
Pergunta a idade, sendo 67 anos, pode vacinar hoje.
Se for inferior, avisar que volta semana que vem.
Sendo superior, pq não vacinou ainda

*/
const prompt = require("prompt-sync")();

var idade = Number(prompt("Qual a sua idade?"));
const idadeHoje = 67

if(idade == idadeHoje){
    console.log("Pode vacinar hoje :)");
}
else if(idade < idadeHoje){
    console.log("Ainda não é sua vez :( Volte semana que vem ;-;")
}
else{
    var pq = prompt("Pq não vacinou ainda? :(")
    console.log("A tudo bem :( daremos um jeito de lhe ajudar :)")
}