package model.pessoa;

public class Cliente extends Pessoa{
    
    public Cliente( 
    int id,
    String nome,
    String email,
    String cpfOuCnpj)
    {
    this.nome = nome;
    this.email = email;
    this.cpfOuCnpj = cpfOuCnpj;
    }
}
