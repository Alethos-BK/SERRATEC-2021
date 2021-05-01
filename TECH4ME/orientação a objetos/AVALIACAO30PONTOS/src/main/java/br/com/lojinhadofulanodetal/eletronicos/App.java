import model.pedido.Pedido;
import model.pessoa.Cliente;
import model.pessoa.Vendedor;
import model.produto.Produto;

public class App{

    public static void main(String[] args){

        var cliente1 = new Cliente(1, "Joana", "joana@gmail.com", "11122277710");
        var vendedor1 = new Vendedor(1, "Giovanna", "gigi@gmail.com", "44488866611");        
        var pedido1 = new Pedido(1, "Compras da Joana ", cliente1, vendedor1, 10);
        var produto1 = new Produto(1, "Playstation 5 Versao Disco", "CONSOLE", 1, 6567.47, 0, 0);
        var produto2 = new Produto(2, "Caixa De Som Speaker", "INFORMÁTICA", 3, 64.99, 0, 0);
        
        pedido1.adicionarProdutos(produto1.getNome());

        pedido1.adicionarProdutos(produto2.getNome());

        pedido1.pegarValorProduto(produto1.getValorTotal());

        pedido1.pegarValorProduto(produto2.getValorTotal());

        pedido1.calcularValorTotal();
        
        vendedor1.calcularComissao(pedido1.getValorTotal());


        var cliente2 = new Cliente(2, "Joao", "joao@gmail.com", "55588899900");
        var vendedor2 = new Vendedor(2, "José Pedro", "foquinha@gmail.com", "22233355566677");
        var pedido2 = new Pedido(2, "Compras do José ", cliente2, vendedor2, 0);
        var produto3 = new Produto(3, "Headphone Orelha De Gato", "ACESSORIO", 1, 104.31, 0, 0.0);
        var produto4 = new Produto(4, "Monitor Led LG", "INFORMATICA", 1, 748.99, 0, 0);
        var produto5 = new Produto(5, "Fone De Ouvido Esportivo", "INFORMATICA", 4, 25.0, 0, 0);

        pedido2.adicionarProdutos(produto3.getNome());

        pedido2.adicionarProdutos(produto4.getNome());

        pedido2.adicionarProdutos(produto5.getNome());

        pedido2.pegarValorProduto(produto3.getValorTotal());

        pedido2.pegarValorProduto(produto4.getValorTotal());

        pedido2.pegarValorProduto(produto5.getValorTotal());

        pedido2.calcularValorTotal();

        vendedor2.calcularComissao(pedido2.getValorTotal());

        var nomeProdutosPedido1 = pedido1.getNomeProduto();

        var nomeProdutosPedido2 = pedido2.getNomeProduto();

        pedido1.mostrarPedidos();

        pedido2.mostrarPedidos();


    }
   
}