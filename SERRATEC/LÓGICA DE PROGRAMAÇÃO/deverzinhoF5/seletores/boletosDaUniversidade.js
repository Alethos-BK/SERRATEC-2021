/**
 Os boletos da "Universidade" são emitidos com vencimento no dia 15 do mês. Para os pagamentos recebidos entre os dias 10 a 13,
  será concedido um desconto na próxima mensalidade. O programa irá receber o número do boleto e o dia do pagamento, e emitir o extrato.

  DIA DO BOLETO: 10
  Nº BOLETO: 1234
  DIA DE PAGAMENTO: 11
  DESCONSTOS NA PROX? true
 */
const prompt = require("prompt-sync")();

var now = new Date();

var n = prompt("Digite o número do boleto por favor ");
var diaP = Number(prompt("Quando foi efetuado o pagamento?"));
var desconto = diaP >= 10 && diaP <=13;

console.log("        ==BOLETO DA UNIVERSIDADE==");
console.log("DIA DO BOLETO: ", now.getDate() );
console.log("Nº boleto: ",n);
console.log("Dia pagamento: ", diaP);
 
if(desconto){
    console.log("Desconto na próxima mensalidade? ",desconto);
 } 
 
