/*O programa “Triangular” lê as medidas do triângulo, e informa se ele é equilátero, isósceles ou escaleno*/

const prompt = require("prompt-sync")();

var l1 = Number(prompt("Digite um lado do triangulo"))
var l2 = Number(prompt("Digite outro lado do triangulo"))
var l3 = Number(prompt("Digite outro lado do triangulo"))

var existencia = (l1 <l2 + l3) && (l2 < l1 + l3) && (l3 < l1 + l2);

if(existencia){

  if(l1 == l2 && l2 == l3){
    console.log("Triângulo equilatero")
}
  else if(l1 != l2 && l1 != l3 && l2 != l3){
    console.log("Triângulo escaleno")
  }
  else{
    console.log("Triângulo isósceles")
  }
}
else{
  console.log("não é triângulo")
}

