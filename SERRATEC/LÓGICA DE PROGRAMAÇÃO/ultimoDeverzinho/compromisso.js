//   O programa “Compromissos” gerencia a sua agenda do mês. Você pode digitar um compromisso, informando o dia e a descrição do evento, 
// e consultar se existe algum apontamento para determinado dia.
const prompt = require("prompt-sync")();

var compromissos = []
// var descricao = [];



var dia = Number(prompt("Digite o dia que você deseja marcar um compromisso "));
var texto = compromissos[dia];


while (dia > 0){

if(texto){
    console.log("Ai já tem um compromisso, quer ver? ");
    var ver = prompt("S ou N"); 

    if(ver == "S"){
        console.log(`Anotações do dia ${dia}`);
        console.log(texto);
    }
} else {
    console.log(`Esse dia não tem compromissos.
Digite seu compromisso: `);
    var descricao = prompt();
    compromissos[dia] = descricao;
}
dia = prompt("Qual dia quer consultar? ");
texto = compromissos[dia];
  
}
console.log("Até a próxima!")



// function fazerCompromisso(compromisso){
//     for(i = 0; i == compromisso; i++){
//         compromissos[i]

//     }

// }

