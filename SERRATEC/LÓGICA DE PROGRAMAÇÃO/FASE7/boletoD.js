/**
 O daniel precisa pagar 2 boletos em atraso diretamente no caixa do banco;
 crie uma função "guinche" que recebe o parâmetro 'numero'
 escreve o texto pagamento numero recebdio
 */
const ler = require("prompt-sync")();

function guiche(numero, valor){
    console.log("Pagamento do boleto ", numero, " recebido de ", valor)
}

var boleto = ler("Digite no pinpad o nro do boleto a pagar: ");
guiche(boleto, 33.49);

var boleto = ler("Digite no pinpad o nro do boleto a pagar: ");
guiche(boleto, 21.99);