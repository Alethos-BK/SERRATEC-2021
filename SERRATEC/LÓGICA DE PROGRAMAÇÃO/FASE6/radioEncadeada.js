/*O locutor da rádio 90 FM irá fazer uma pergunta ao vivo, 
cuja resposta ele já falou ao longo da programação.
Três ouvintes serão contemplados com uma caneca personalizada, 
ertando a resposta. E cada ouvinte terá duas chances de
 responder.
 
1- pergunta
2- ter 3 vencedores
3- cada pessoa tem 2 chances

 

// var pergunta = prompt("Qual a melhor rádio da serra?")
// var vencedor = 0;
var pessoas = 0;
var chance = 0;
var pergunta;
var acerto;

for(vencedor = 0; vencedor < 3; vencedor++){

    
do{
    pergunta = prompt("Qual a melhor rádio da serra?")
    acerto = 

    if(pergunta == "93") {
     console.log("Resposta certa")
     chance = 2; 
    }
    else{
   pergunta = prompt("Qual a melhor rádio da serra?")
   
    }
   }

    while(chance < 2){
        
       
}

*/
const prompt = require("prompt-sync")();

const RESPOSTA = "93";

for(i = 0; i < 3; i++){
  var chance = 0;
  var acerto;

  do{
      var resposta = prompt("Qual a melhor rádio da serra?")
      acerto = resposta === "93";
      chance++
  }while (chance < 2 && !acerto)

  if(acerto){
      console.log("PARABÉNS ")
  }
  else {console.log("que pena... fica para a próxima")
  }
}
console.log("Parabens aos vencedores!")


    


 
 