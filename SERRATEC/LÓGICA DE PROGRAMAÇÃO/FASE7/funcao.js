const prompt = require("prompt-sync")();

var texto = "123";

//GLOBAIS

var numero = parseInt(texto);
var numero = parseFloat(texto);
var numero = Number(texto);

// BIBLIOTECA

var nro = Math.trunc(12.54856);

//MÉTODOS- SÃO ACIONADAS EM OBJETOS

texto = "lalalalalalalalalalal"

texto.length
//length - tamanho do texto
console.log(texto.length);

//FUNÇÃO

function facilitar(){
    var aluno = prompt("Qual seu nome?")
    console.log("Bem-vindo aluno, ",aluno)
}
facilitar()

//---------------------

// PARÂMETRO
function mensagem (nome){
    console.log("Bom dia, ", nome);
}
mensagem("Karine");
mensagem("Jéssica");
