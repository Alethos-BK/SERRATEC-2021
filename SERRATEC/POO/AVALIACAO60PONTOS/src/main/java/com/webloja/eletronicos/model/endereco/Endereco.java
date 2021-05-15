package endereco;

public class Endereco {
    
    private String cep;
    private String rua;
    private Integer numero;
    private String bairro;
    private String cidade;
    private String complemento;
    private String referencia;
    
    public Endereco(
        String cep,
        String rua,
        Integer numero,
        String bairro,
        String cidade,
        String complemento,
        String referencia){

        this.cep = cep;
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.complemento = complemento;
        this.referencia = referencia;
    }

    //#region Getters e Setters
    public String getCep() {
        return cep;
    }

    public String getReferecia() {
        return referencia;
    }

    public void setReferecia(String referecia) {
        this.referencia = referecia;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
    //#endregion

}
