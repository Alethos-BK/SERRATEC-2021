const prompt = require("prompt-sync")();

 var player1 = parseInt(prompt("Digite um número, player 1"));
 var player2 = parseInt(prompt("Digite um número, player 2"));

 var maior1 = player1 > player2;
 var maior2 = player2 > player1;
 var igual = player1 == player2;

 console.log("==MAIORAL==\nPlayer 1 venceu?", maior1, "\nPlayer 2 venceu?", maior2);
 console.log("\nHouve empate? ", igual);