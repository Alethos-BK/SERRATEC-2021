//  	Alice foi até uma loja de eletrônicos e comprou alguns
//  jogos e um videogame novo, pagando R$ 345,00 por todos os
//   jogos e R$ 1.545,00 pelo videogame. Para o pagamento, o 
//   sistema irá apresentar 3 opções de parcelamento e o valor 
//   de cada parcela: 3 vezes sem juros, 5 vezes sem juros e em
//    10 vezes com 1,5% de juros sobre o total da compra.

const prompt = require("prompt-sync")();
var jogos = 345.00;
var videoGame = 1545.00;
var total = jogos + videoGame;
var par3 = total/3;
var par5 = total/5;
var par10 = ((total * 1.5/100) + total)/10


var parcela = prompt(`Em quantas vezes você deseja parcelar?
1 - nenhuma R$${total.toFixed(2)}
2 - 3 vezes de R$${par3.toFixed(2)}
3 - 5 vezes sem juros R$${par5.toFixed(2)}
4 - 10 vezes com juros de 1,5% R$${par10.toFixed(2)}`);

if(parcela == 1){
    console.log("O total de sua compra é de R$", total.toFixed(2));
}
else if(parcela == 2){
    
    console.log("O total de sua compra é de 3 parcelas de R$", par3.toFixed(2));
}
else if(parcela == 3){
   
    console.log("O total de sua compra é de 5 parcelas de R$", par5.toFixed(2));
}
else if(parcela == 4){
    console.log("O total de sua compra é de 10 parcelas de R$", par10.toFixed(2));
}
else{
        console.log("Número inválido, por favor recarregue e digite uma opção válida");
    }





