// O “gerador de tabela verdade” solicita ao aluno de programação qual operador lógico quer visualizar 
// (e, ou), e depois imprime na tela a tabela verdade montada em um laço.
const prompt =require("prompt-sync")();

var operador = prompt("Qual operador lógico deseja ver: e, ou ?")

var verdade = 1 == 1;
var falso = 1 != 1;
var result = "";

if(operador == "e"){
    for(i = 0; i < 4; i++){

        if(i == 0){
            result = verdade && verdade;
            console.log("V | V |", result)
        }
        else if(i == 1){
            result = verdade && falso;
            console.log("V | F |", result)
        }
        else if(i == 2){
            result = falso && verdade;
            console.log("F | V |", result)
        }
        else{
            result = falso && falso;
            console.log("F | F |", result)

        }            
    }
}
else{
    for(i = 0; i < 4; i++){

        if(i == 0){
            result = verdade || verdade;
            console.log("V | V |", result)
        }
        else if(i == 1){
            result = verdade || falso;
            console.log("V | F |", result)
        }
        else if(i == 2){
            result = falso || verdade;
            console.log("F | V |", result)
        }
        else{
            result = falso || falso;
            console.log("F | F |", result)

        }            
    }
}
