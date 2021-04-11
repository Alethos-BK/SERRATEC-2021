// No programa “Conto nos dedos”, a criança diz até qual número quer contar, e os números aparecem 
// na tela em sequência. Ela vai experimentar vários números, até que digite um zero para parar de contar.

const prompt = require("prompt-sync")();

var valor = Number(prompt("Digite um valor que deseja contar ?"));

do {    
    for (i = 0; i < valor; i++) {
        console.log("Numero ->",i + 1)
    }
    valor = Number(prompt("Digite um outro valor ou digite 0 Para Sair do Programa ?"));
} while (valor !== 0);