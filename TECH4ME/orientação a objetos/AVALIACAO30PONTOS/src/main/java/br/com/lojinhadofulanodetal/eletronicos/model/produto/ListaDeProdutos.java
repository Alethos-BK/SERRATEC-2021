package model.produto;

//POR FAVOR IGNORAR ESTÁ CLASSE ESTOU COM PENA DE APAGAR ESSE ENUM QUE ME DEU DOR DE CABEÇA

public enum ListaDeProdutos {
    
    PLAYSTATION5("Playstation 5 Versao Disco"),
    CAIXADESOM("Caixa De Som Speaker"),
    HEADPHONE("Headphone Orelha De Gato"),
    MONITOR("Monitor Led LG"),
    FONEDEOUVIDO("Fone De Ouvido Esportivo"),
    PLAYSTATION4("Playstation 4 1T"),
    XBOXONE("XBOX ONE"),
    NINTENTEDOSWITCH("Nintendo Switch");

    private String listaDeProdutos;

    private ListaDeProdutos(String listaDeProdutos) {
        this.listaDeProdutos = listaDeProdutos;

    }

    public String getListaDeProdutos(){
        return this.listaDeProdutos;
    }

}