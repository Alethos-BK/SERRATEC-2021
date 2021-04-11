/*Braya sempre tem a mesma rotina nos fins de semana. Pela manhã, tendo sol, vai à praia. Do contrário, aproveita pra estudar.
 À tarde é ainda mais regrado: para o almoço na praia, leva um lanche; em casa, feijoada. Após almoçar, assiste televisão e tira um cochilo.
  Agora ele quer imprimir seus hábitos em papel na sexta, após a previsão do tempo, e colar na porta da geladeira.
  */
 
 const prompt = require("prompt-sync")();

 var tempo = prompt("Nesse final de semana estará sol ou nublado?")

 if(tempo == "sol"){
     console.log("Obaa dia de praia")
     console.log("Vou levar um lanche para comer na praia no final de semana")
 }
 else if(tempo == "nublado"){
     console.log("Poxa o tempo está nublado... mas tudo bem vou estudar e adiantar meus deveres")
     console.log("Vou almoçar feijoada que mamãe irá fazer");
     console.log("eeeee depois do almoço vou assistir televisão e tirar aquele cochilo gostoso")
 }
 