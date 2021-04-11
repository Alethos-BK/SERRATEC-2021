/*O laboratório fabricante de álcool em gel
 precisa saber se o produto está atingindo a concentração 
ideal para desinfecção, que é de 70%. Para a ajudar
 o laboratório, crie um programa onde será preenchida a
  capacidade da garrafa em mililitros, e o resultado serão 
  os volumes de álcool e de gel que precisam ser misturados 
  para preenchimento do vasilhame.*/
  const prompt = require("prompt-sync")();
  var garrafa = prompt("Sua garrafa é de quantos ml?")
  var alcool = garrafa * 70/100
  var gel = garrafa - alcool

  console.log("Para se fazer alcool em gel em uma garrafa de ", garrafa, "ml é necessário ", alcool, "ml de alcool e", gel, "ml de gel");