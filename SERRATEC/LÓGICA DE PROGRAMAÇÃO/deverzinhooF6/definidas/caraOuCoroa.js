// O “cara ou coroa estatístico” vai jogar a moeda mil vezes, e depois demonstrar percentualmente 
// as aparições de caras ou coroas.Pesquise sobre a função de números aleatórios, para sortear um 
// número e usá-lo como sendo a resposta da moeda.

for(i = 0; i < 1000; i++){
    console.log("CARA OU COROA DE MIL", i)

    if(i == 999){
        var result = Math.floor(Math.random() * 2) + 1;
        if(result == 1){
            console.log("O resultado é CARA!")
        }
        else{
            console.log("O resultado é COROA!")
        }
    }
}