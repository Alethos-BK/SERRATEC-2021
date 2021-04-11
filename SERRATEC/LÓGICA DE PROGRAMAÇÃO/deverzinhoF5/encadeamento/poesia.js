/*No programa “Poesia” um trecho de uma composição conhecida é apresentado na tela. Após imprimir, o programa pergunta 
se o leitor quer apreciar novamente os versos.*/
const prompt = require("prompt-sync")();
do{
    console.log("Todo mundo é capaz de dominar uma dor, exceto quem a sente. - Willian Shakespeare");
    var escolha = prompt("Deseja apreciar o trecho novamente?")
}
while(escolha == "sim")

console.log("poxa... ok, até a próxima")