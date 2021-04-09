const ler = require("prompt-sync")();


var nome = ler ("Olá, qual seu nome?");

    var idade = ler ("Prazer em te conhecer, " + nome +" qual o sua idade?");

    if (idade < 18){
     console.log ("Por falta de testes até o momento, a vacina não é recomendada para menores de 18 anos")

    } else if ( idade >= 18 && idade <=59) {
     var gestante = ler (nome + " você está gravida?");

            if ( gestante === "sim"){
                console.log("Por falta de testes até o momento, a vacina não é recomendada para gestantes!");
            }else {
                console.log("Você será o ultimo da fila de vacinação, aguarde sua vez.");
            }
        }
        else{
            console.log ("Você está no grupo prioritário a ser incluído ao fim da primeira fase de vacinação, verifique calendário da sua cidade.");
        }