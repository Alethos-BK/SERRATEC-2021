// No sistema “Todas as tabuadas”, o aluno de matemática não precisa escolher o número: As tabuadas 
// entre 2 e 10 serão impressas de uma vez.

var result = "";
var valor = 1

for(i = 1; i <= 10; i++){
  for(j = 1; j <= 10; j++){

  result = j * i
  console.log(`${i} x ${j} = ${result}`)
  if(j == 10){
		console.log("------------")
	}

  }
}