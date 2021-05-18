package cliente;

import endereco.Endereco;

public class Cliente {

    private String nome;
	private String email;
	private String celular;
	private String cpfOuCnpj;
	private Endereco endereco;

    public Cliente(	
        String nome,
        String email,
        String celular,
        String cpfOuCnpj,
        Endereco endereco
    ){
        this.nome = nome;
        this.email = email;
        this.celular = celular;
        this.cpfOuCnpj = cpfOuCnpj;
        this.endereco = endereco;
    }

    //#region Getters e Setters

    public String getNome() {
        return nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getCpfOuCnpj() {
        return cpfOuCnpj;
    }

    public void setCpfOuCnpj(String cpfOuCnpj) {
        this.cpfOuCnpj = cpfOuCnpj;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    //#endregion

    public String toString(){
        
        return String.format("Nome: %s \n Cep: %s \n Rua: %s Nº %s Bairro: %s",
                             this.nome, this.endereco.getCep(), this.endereco.getRua(), this.endereco.getNumero(), this.endereco.getBairro());
    }

}
