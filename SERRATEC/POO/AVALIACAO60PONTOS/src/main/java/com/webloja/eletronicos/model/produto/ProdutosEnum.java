package produto;

public enum ProdutosEnum {
    
    CONTROLEPS5("Controle Sem fio PS5 DualSense"), // valor 499.99
    CONSOLEPS5("Console Sony PlayStation 5 Digital Edition - CFI-1014B"), // valor 4199.90
    CONSOLEPS4("Sony Playstation 4 Slim 1TB"), //VALOR 2564.05
    CAMERASONY("Câmera Sony PlayStation, com Suporte"), // VALOR 599.89
    CONTROLEPS4("Controle Sony Dualshock 4 PS4, Sem Fio, Preto - CUH-ZCT2U"), //299.0
    NITENDOSWITCH("Nintendo Switch 32GB"), //2537.89
    NITENDOWII("Nintendo Wii - Console de jogos - Wii Sports"), //VALOR 1299.99
    XBOXONE("Console Xbox One S 1TB Branco"), // VALOR 2469.05
    XBOXSERIES("Console Xbox Series S 500gb Ssd"), //valor 2899.90
    FONEDEGATINHO("Onikuma K9 Fone De Ouvido de Gatinho Com Fio "); // valor 189.50

    String produtos;

    private ProdutosEnum(String produtos) {
        this.produtos = produtos;
    }

    public String getProdutos(){
        return this.produtos;
    }


}
