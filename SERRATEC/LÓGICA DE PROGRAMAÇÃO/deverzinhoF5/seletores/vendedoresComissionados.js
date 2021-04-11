/* 
Os "vendedores comissionados" recebem 5% do valor de cada produto vendido. Aqueles que batem a meta de 5 mil em vendas, 
recebem um adicional de 9% sobre o excedente. Seu programa irá receber o valor total de vendas e emitir o recibo de comissão.
    VENDAS TOTAL: 
    SUA COMISSÃO: 
    VALOR ADICIONAL:
*/
const prompt = require("prompt-sync")();

console.log("   ==VENDEDORES COMISSIONADOS==")


var total = Number(prompt("Qual o valor total de vendas?"));
// var produtos = Number(prompt("Quantos produtos foram vendidos?"))
// var valorP = total/produtos;
var porcentagem = total * 5/100;

if(total > 5000){
    var noveP = total - 5000;
    var adicional = noveP*9/100
//     porcentagem += (porcentagem * 9/100)

}

console.log("VENDAS TOTAL: ", total);
console.log("SUA COMISSÃO: ", porcentagem.toFixed(2) );
console.log("VALOR ADICIONAL: ", adicional.toFixed(2));
