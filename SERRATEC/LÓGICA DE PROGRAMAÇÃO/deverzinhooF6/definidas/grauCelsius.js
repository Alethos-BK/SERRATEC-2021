// Para exibir a tabela de “temperaturas”, o programa irá exibir os graus Celsius entre 0º e 40ºC, 
// além da equivalência com os graus Fahrenheit.

for (let i = 0; i <= 40; i++) {
    
    var conversao = ((i * 9) / 5) + 32;
    console.log(i,"° Celsius. >>", conversao, "° Fahrenheit.")
}