const prompt = require("prompt-sync");

var idade = Number(prompt("Qual a sua idade?"));

if(idade = 67){
    console.log("Pode vacinar hoje :)");
}
else if(idade < 67){
    console.log("Volte semana que vem ;-;")
}
else{
    console.log("Pq não vacinou ainda? :(")
}