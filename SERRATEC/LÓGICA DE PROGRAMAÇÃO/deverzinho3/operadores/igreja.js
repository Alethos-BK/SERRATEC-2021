/*Em tempos de pandemia, só é permitido entrar em templos religiosos pessoas de máscara. Na portaria deve ser medida a temperatura à distância,
 e o valor não deve ultrapassar 37,5º.*/
const prompt = require("prompt-sync")();

 var mascara = prompt("Usa máscara?");
 var temperatura = Number(prompt("Qual a sua temperatura?"))

 var m = mascara == "sim"
 var t = temperatura <= 37.5

 var pode = m && t;

 console.log('Usa máscara? ', mascara, "\n Qual a temperatura? ", temperatura);

 console.log("Pode entrar?", pode)
