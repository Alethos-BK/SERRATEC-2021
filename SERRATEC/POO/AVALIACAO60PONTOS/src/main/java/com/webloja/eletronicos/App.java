import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashMap;

import cliente.Cliente;
import endereco.Endereco;
import formaPagamento.FormaPagamento;
import pedido.Pedido;
import produto.CategoriaProduto;
import produto.Produto;
import produto.ProdutosEnum;

public class App {
    public static void main(String[] args){
        
        var formatador = new SimpleDateFormat("dd/MM/yyy hh:mm:ss");


        //#region produtos
        
    
        //#endregion
    
        //#region Clientes
        try {
            
            //cliente 1
            var enderecoFred = new Endereco("11888-777", "Rua numero 1", 1, "Bairro das fadas", "Terra do Nunca", "Bl 10", "Na ponta da ilha");
            var fred = new Cliente("Frederico ", "colega@gmail.com", "24 99999-9999", "123.456.789-10", enderecoFred);
        
            var pedidoFred = new Pedido(01, formatador.parse("13/04/2021 13:21:55"), fred, FormaPagamento.PIX);
            pedidoFred.adicionarProdutos(new Produto(ProdutosEnum.FONEDEGATINHO, 2));
            pedidoFred.adicionarProdutos(new Produto(ProdutosEnum.NITENDOSWITCH, 1));
            //cliente 2
            var enderecoGigi = new Endereco("22111-999", "Rua numero 2", 2, "Bairro dos Goblins", "Terra do Nunca", "Bl 1 apto 12", "Ao lado da Alize");
            var gigi = new Cliente("Giovanna ", "gigi@gmail.com", "21 98888-8888", "987.654.321-10", enderecoGigi);

            var pedidoGigi = new Pedido(02, formatador.parse("16/04/2021 09:45:01"), gigi, FormaPagamento.BOLETO);
            //cliente 3
            var enderecoDaniel = new Endereco("30333-333", "Rua numero 3", 3, "Bairro dos elfos", "Terra do Nunca", "Ultimo andar da torre", "Perto do merlim");
            var daniel = new Cliente("Daniel", "salazar@gmail.com", "21 97777-1111", "456.965.125-12", enderecoDaniel);

            var pedidoDaniel = new Pedido(03, formatador.parse("14/05/2020 05:00:00"), daniel, FormaPagamento.PIX);
            //cliente 4
            var enderecoLaura = new Endereco("40444-789", "Rua numero 4", 4, "Bairro dos gigantes", "Terra do Nunca", "Buraco 4", "Facil de enxergar");
            var laura = new Cliente("Laura", "satlefes@gmail.com", "21 96666-6666", "124.576.632-01", enderecoLaura);

            var pedidoLaura = new Pedido(04, formatador.parse("01/05/2021 00:05:12"), laura, FormaPagamento.PICPAY);
            //cliente 5
            var enderecoJose = new Endereco("50555.486", "Rua numero 5", 5, "Rua dos anoes", "Terra do Nunca", "Caverna 154, 787º quarto", "Depois da mina");
            var jose = new Cliente("Jose", "foquinha@gmail.com", "21 95555-5555", "256.854.789-82", enderecoJose);
            //cliente 6
            var enderecoErick = new Endereco("66.666-123", "Rua numero 6", 6, "Rua dos Dragonatos", "Terra do Nunca", "No pico  da maior montanha", "Minhas asas são cor de bronze e da para enxerga-las de longe");
            var erick = new Cliente("Erick", "guapi@gmail.com", "21 9666-6666", "958.357.968-80", enderecoErick);
        
            var pedidoErick = new Pedido(05, formatador.parse("24/05/2021 16:21:12"), erick, FormaPagamento.CARTAODECREDITO);
            


        } catch (ParseException e) {
            e.printStackTrace();
        }

        

        

        // var enderecoLaura = new Endereco("12", rua, numero, bairro, cidade, complemento, referencia)
        // var  laura = new Cliente("Laura", "satlefes@gmail.com", "21 45615-6554", "489.621.258-12", endereco)
        //#endregion
    }
}
