/*A Jéssica tem uma sapateira no fim do corredor. Nela cabem 5 sapatos,
 e cada espaço é numerado. Ela quer criar um aplicativo para guardar 
 o número do espaço e o sapato depositado nele. 
 Depois, ao digitar o número da gaveta, o programa irá imprimir o nome do calçado 
 armazenado.*/
 const prompt = require("prompt-sync")();
 
 console.log("SAPATERIA DA JÉSSICA")

//  var sapato = new Array(7);
var sapato = [];

 sapato[0] = "All star"
 sapato[1] = "Sapatilha"
 sapato[2] = "Salto alto"
 sapato[3] = "Bota marrom"
 sapato[4] = "Sandália de dedo"
 sapato[5] = "Sapatênis"
 sapato[6] = "quichute"

 var gaveta = prompt("Qual gaveta?")
gaveta = Number(gaveta);

encontrado = sapato[gaveta];
// if (gaveta == "1") encontrado = sapato[1];
// else if (gaveta == "2") encontrado = sapato[2];
// else if (gaveta == "3") encontrado = sapato[3];
// else if (gaveta == "4") encontrado = sapato[4];
// else if (gaveta == "5") encontrado = sapato[5];
// else if (gaveta == "6") encontrado = sapato[6];



console.log("Na gaveta " + gaveta + " temos um " + encontrado)

var gaveta = prompt("Qual gaveta você quer guardar?")
gaveta = Number(gaveta);

var troca ="n"
if(sapato[gaveta] != ""){
    console.log("Na gaveta ", gaveta, " existe", sapato[gaveta])
    troca = prompt("s ou n")

}
if(troca = "s"){
var nome = prompt("Nome? ")
sapato[gaveta] = nome;
}


console.log("Na gaveta ", gaveta, "temos um(a) ", sapato[gaveta])