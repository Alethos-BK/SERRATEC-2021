package model.pessoa;

public abstract class Pessoa {

    //#region Atributos
    protected int id;
    protected String nome;
    protected String email;
    protected String cpfOuCnpj;

    //#endregion

    //#region Getters e Setters
    
    public int getId(){
        return this.id;
    }

    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getEmail(){
        return this.email;
    }
    public void setEmail(String email){
        this.email = email;
    }

    public String getCpfOuCnpj(){
        return this.cpfOuCnpj;
    }
    public void setCpfOuCnpj(String cpfOuCnpj){
        this.cpfOuCnpj = cpfOuCnpj;
    }

    //#endregion

}
