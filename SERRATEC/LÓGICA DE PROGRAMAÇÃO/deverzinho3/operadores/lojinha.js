/*O aplicativo na entrada da loja possui internamente um limite de pessoas que podem estar dentro do estabelecimento ao mesmo tempo.
 Toda vez que um cliente quiser entrar, o segurança irá preencher a quantidade de pessoas já na loja, e o programa avisará se o cliente
  pode prosseguir*/
  const prompt = require("prompt-sync")();

  var limite = 30;
  var numero = Number(prompt("Quantas pessoas estão na loja?"));

  var pessoas = numero <= limite;

 
  console.log("Pode prosseguir?", pessoas);