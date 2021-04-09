const prompt = require("prompt-sync")();

/* ler a quantidade de horas em um mês;
   quanto ele recebe por hora;
   % de desconto do INSS

   CALCULAR
   salário bruto = horas trabalhadas * valor hora
   desconto inss = salario bruto - %
   salário líquido = bruto - descontos

   IMPRIMIR 
   salário bruto
   desconto INSS
   salário líquido

*/
var hora = Number(prompt("Quantos horas você trabalhou em um mês?"));
var valor = Number(prompt("Quanto você recebe por hora?"));
var dINSS = Number(prompt("Qual o % de desconto para o INSS"))

var salarioB = hora * valor;
var inss = salarioB * dINSS/100;
var salarioL = salarioB - inss;
 
console.log("CONTRACHEQUE \n");
console.log("Salário bruto: R$" + salarioB + "\nDesconto INSS: R$" + inss + "\nSalário líquido: R$" + salarioL);