import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashMap;

import cliente.Cliente;
import empresa.Empresa;
import endereco.Endereco;
import exception.MinhaException;
import formaPagamento.FormaPagamento;
import pedido.Pedido;
import produto.CategoriaProduto;
import produto.Produto;
import produto.ProdutosEnum;

public class App {
    public static void main(String[] args){
                
        var webLoja = new Empresa("Web Loja");

        //#region produtos
        var produto1 = new Produto(ProdutosEnum.CONTROLEPS5);
        var produto2 = new Produto(ProdutosEnum.CONSOLEPS5);
        var produto3 = new Produto(ProdutosEnum.CONSOLEPS4);
        var produto4 = new Produto(ProdutosEnum.CAMERASONY);
        var produto5 = new Produto(ProdutosEnum.CONTROLEPS4);
        var produto6 = new Produto(ProdutosEnum.NITENDOSWITCH);
        var produto7 = new Produto(ProdutosEnum.NITENDOWII);
        var produto8 = new Produto(ProdutosEnum.XBOXONE);
        var produto9 = new Produto(ProdutosEnum.XBOXSERIES);
        var produto10 = new Produto(ProdutosEnum.FONEDEGATINHO);

        //#endregion
    
        //cliente 1
        var enderecoFred = new Endereco("11888-777", "Rua numero 1", 1, "Bairro das fadas", "Terra do Nunca", "Bl 10", "Na ponta da ilha");
        var fred = new Cliente("Frederico ", "colega@gmail.com", "24 99999-9999", "123.456.789-10", enderecoFred);
      
        var pedidoFred = new Pedido(01, "13/04/2021", fred, FormaPagamento.PIX);
        
        pedidoFred.adicionarProdutos(produto10);
        pedidoFred.adicionarProdutos(produto10);
        pedidoFred.adicionarProdutos(produto6);
        pedidoFred.calcularValorTotal();
        pedidoFred.estoque();
        
        webLoja.adicionarPedido(111, pedidoFred);
        //cliente 2
        var enderecoGigi = new Endereco("22111-999", "Rua numero 2", 2, "Bairro dos Goblins", "Terra do Nunca", "Bl 1 apto 12", "Ao lado da Alize");
        var gigi = new Cliente("Giovanna ", "gigi@gmail.com", "21 98888-8888", "987.654.321-10", enderecoGigi);

        var pedidoGigi = new Pedido(02, "16/04/2021", gigi, FormaPagamento.BOLETO);
        pedidoGigi.adicionarProdutos(produto1);
        pedidoGigi.adicionarProdutos(produto1);
        pedidoGigi.adicionarProdutos(produto2);

        pedidoGigi.calcularValorTotal();
        pedidoGigi.estoque();


        webLoja.adicionarPedido(222, pedidoGigi);

        //cliente 3
        var enderecoDaniel = new Endereco("30333-333", "Rua numero 3", 3, "Bairro dos elfos", "Terra do Nunca", "Ultimo andar da torre", "Perto do merlim");
        var daniel = new Cliente("Daniel", "salazar@gmail.com", "21 97777-1111", "456.965.125-12", enderecoDaniel);

        var pedidoDaniel = new Pedido(03, "14/05/2021", daniel, FormaPagamento.PIX);
        pedidoDaniel.adicionarProdutos(produto1);
        pedidoDaniel.adicionarProdutos(produto2);
        pedidoDaniel.adicionarProdutos(produto3);
        pedidoDaniel.adicionarProdutos(produto4);
        pedidoDaniel.adicionarProdutos(produto5);

        pedidoDaniel.calcularValorTotal();
        pedidoDaniel.estoque();

        webLoja.adicionarPedido(333, pedidoDaniel);

        //cliente 4
        var enderecoLaura = new Endereco("40444-789", "Rua numero 4", 4, "Bairro dos gigantes", "Terra do Nunca", "Buraco 4", "Facil de enxergar");
        var laura = new Cliente("Laura", "satlefes@gmail.com", "21 96666-6666", "124.576.632-01", enderecoLaura);

        var pedidoLaura = new Pedido(04, "01/05/2021", laura, FormaPagamento.PICPAY);
        pedidoLaura.adicionarProdutos(produto10);
        pedidoLaura.adicionarProdutos(produto10);
        pedidoLaura.adicionarProdutos(produto10);
        pedidoLaura.adicionarProdutos(produto10);
        pedidoLaura.adicionarProdutos(produto10);
        pedidoLaura.adicionarProdutos(produto10);
        pedidoLaura.adicionarProdutos(produto10);
        pedidoLaura.adicionarProdutos(produto10);
        pedidoLaura.adicionarProdutos(produto10);
        pedidoLaura.adicionarProdutos(produto10);
        pedidoLaura.adicionarProdutos(produto9);

        pedidoLaura.calcularValorTotal();
        pedidoLaura.estoque();


        webLoja.adicionarPedido(444, pedidoLaura);

        //cliente 5
        var enderecoJose = new Endereco("50555.486", "Rua numero 5", 5, "Rua dos anoes", "Terra do Nunca", "Caverna 154, 787º quarto", "Depois da mina");
        var jose = new Cliente("Jose", "foquinha@gmail.com", "21 95555-5555", "256.854.789-82", enderecoJose);

        var pedidoJose = new Pedido(05, "20/04/2021", jose, FormaPagamento.CARTAODECREDITO);
        pedidoJose.adicionarProdutos(produto10);

        pedidoJose.calcularValorTotal();
        pedidoJose.estoque();


        webLoja.adicionarPedido(555, pedidoJose);

        //cliente 6
        var enderecoErick = new Endereco("66.666-123", "Rua numero 6", 6, "Rua dos Dragonatos", "Terra do Nunca", "No pico  da maior montanha", "Minhas asas são cor de bronze e da para enxerga-las de longe");
        var erick = new Cliente("Erick", "guapi@gmail.com", "21 9666-6666", "958.357.968-80", enderecoErick);
      
        var pedidoErick = new Pedido(05, "24/05/2021", erick, FormaPagamento.CARTAODECREDITO);
        pedidoErick.adicionarProdutos(produto7);

        pedidoErick.calcularValorTotal();
        pedidoErick.estoque();



        webLoja.adicionarPedido(666, pedidoErick);

        webLoja.valorFaturado();
        webLoja.cabecalho();
        webLoja.valorFaturado();

        try {
            webLoja.menu();
        } catch (ParseException e) {
            e.getMessage();
        } catch (MinhaException e){
            e.getMessage();
        }
    }
}
