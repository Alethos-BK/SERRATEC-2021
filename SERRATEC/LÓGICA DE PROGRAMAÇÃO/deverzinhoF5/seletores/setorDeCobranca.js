/*O setor de cobrança irá acertar os pagamentos com os "fornecedores" na próxima sexta-feira. Para valores maiores que mil Reais,
 o pagamento será em cheque. Os valores baixos serão pagos em dinheiro. Ao receber o valor do pagamento, o sistema irá emitir um relatório.

 Valor: xxxx
 Pagamento: valor > 1000
 Valor: xxx < pagamento dinheiro
 */

 const prompt = require("prompt-sync")();

 var valor = parseFloat(prompt("Qual o valor do pagamento"))

 if(valor >= 1000){
     console.log("Valor: R$" + valor.toFixed(2) +"\nPagamento em cheque");
 }
 else {
    console.log("Valor: R$" + valor.toFixed(2) +"\nPagamento em dinheiro");
}