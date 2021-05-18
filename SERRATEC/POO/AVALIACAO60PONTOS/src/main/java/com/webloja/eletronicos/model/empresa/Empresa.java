package empresa;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;

import endereco.Endereco;
import exception.MinhaException;
import formaPagamento.FormaPagamento;
import pedido.Pedido;

public class Empresa {

    private String nome;
    private Endereco endereco;
    private HashMap<Integer, Pedido> listaPedidos;
    private Date dataRelatorio;
    private Double valorFaturado;
    
    Scanner ler = new Scanner(System.in);
    

    public Empresa(String nome){
        this.nome = nome;
        this.endereco = new Endereco("15958000", "Rua principal", 0, "Centro", "Terra do Nunca", "Andar 78", "A melhor empresa de eletrônicos da cidade!");
        this.listaPedidos = new HashMap<Integer, Pedido>();
        this.valorFaturado = 0.0;
        this.dataRelatorio = new Date();
    }
    //#region Métodos

    public void cabecalho(){
        System.out.println("********************************");
        System.out.println("*********** Loja Web ***********");
        System.out.println("********************************");

    }

    public void adicionarPedido(Integer codigo, Pedido pedido){
        listaPedidos.put(codigo, pedido);
    }

    public Double valorFaturado(){

        for(Pedido pedido : listaPedidos.values()){

            this.valorFaturado += pedido.getValorTotal();
        }
        return this.valorFaturado;
        }

    public void menu() throws ParseException{
       
        String escolha;
        
        var formatador = new SimpleDateFormat("dd/MM/yyyy");
        var linha = "-____________________________________";
        do{
        System.out.println("\nOlá senhor Weberson o que deseja?");
        System.out.println("01 - Ver o total faturado na empresa \n02 - Valor faturado por periodo");
        System.out.println("03 - Forma de pagamento mais utilizada \n04 - Valor faturado por forma de pagamento");
        System.out.println("05 - Imprimir relatorio de vendas \n00 - Sair");
        
        escolha = ler.nextLine();
        
        switch (escolha) {

            case "01":
                System.out.println("Nós ja faturamos: " + new DecimalFormat("#, ##0.00").format(this.valorFaturado));

                break;

            case "02":
               
                System.out.println("A partir de qual data você deseja visualizar? Bote no formato dd/MM/yyyy");
                
                var dataInicial = ler.nextLine();
                // DateFormat transformarEmData = DateFormat.getInstance();

                System.out.println("Até qual? (Formato dd/MM/yyyy)");
                var dataFinal = ler.nextLine();

                    Date dI = formatador.parse(dataInicial);
                    Date dF = formatador.parse(dataFinal);
                    Double valorLucrado = 0.0;

                    for(Pedido pedido : listaPedidos.values()){
                        
                        if(formatador.parse(pedido.getDataAbertura()).after(dI) && formatador.parse(pedido.getDataAbertura()).before(dF)){

                            valorLucrado += pedido.getValorTotal();
                            }
                    }
                    System.out.println("Valor total faturado: R$" + new DecimalFormat("#, ##0.00").format(valorLucrado));

                break;

            case "03":
                    var boleto = 0;
                    var cartaoC = 0;
                    var cartaoD = 0;
                    var picPay = 0;
                    var pix = 0;

                for (Pedido pedido : listaPedidos.values()) {
                   switch (pedido.getFormasDePagamentos()) {
                       case BOLETO:
                           boleto++;
                           break;
                        case CARTAODECREDITO:
                            cartaoC++;
                            break;
                        case CARTAODEDEBITO:
                            cartaoD++;
                            break;
                        case PICPAY:
                            picPay++;
                            break;
                        case PIX:
                            pix++;
                            break;                       
                   }
                }
               if(boleto > cartaoC && boleto > cartaoD && boleto > picPay && boleto > pix){
                   System.out.println("A forma de pagamento mais utilizada é: Boleto");
               }
               else if(cartaoC > cartaoD && cartaoC > picPay && cartaoC > pix){
                    System.out.println("A forma de pagamento mais utilizada é: Cartão de credito");
               }
               else if(cartaoD > picPay && cartaoD > pix){
                    System.out.println("A forma de pagamento mais utilizada é: Cartão de debito");
               }
               else if(picPay > pix){
                    System.out.println("A forma de pagamento mais utilizada é: PICPAY");
               }
               else{
                System.out.println("A forma de pagamento mais utilizada é: PIX");

               }
                break;

            case "04":
                System.out.println("Qual forma de pagamento você deseja visualizar?");
                System.out.println("1 - Cartão de credito | 2 - Cartão de debito");
                System.out.println("3 - Pix | 4 - Boleto | 5 - PICPAY");
                var escolha2 = ler.nextLine();

                    if(escolha2 == "1"){
                        for(Pedido pedido : listaPedidos.values())
                        if(pedido.getFormasDePagamentos() == FormaPagamento.CARTAODECREDITO){
                        System.out.println("Valor lucrado por cartão de crétido: R$" + pedido.getValorTotal());
                        
                        }
                    }
                    else if(escolha2 == "2"){
                        for(Pedido pedido : listaPedidos.values())
                        if(pedido.getFormasDePagamentos() == FormaPagamento.CARTAODEDEBITO){
                        System.out.println("Valor lucrado por cartão de debito: R$" + pedido.getValorTotal());
                        
                        }
                    }
                    else if(escolha2 == "3"){
                        for(Pedido pedido : listaPedidos.values())
                        if(pedido.getFormasDePagamentos() == FormaPagamento.PIX){
                        System.out.println("Valor lucrado por pix: R$" + pedido.getValorTotal());
                        }
                    }
                    else if(escolha2 == "4"){
                        for(Pedido pedido : listaPedidos.values())
                        if(pedido.getFormasDePagamentos() == FormaPagamento.BOLETO){
                        System.out.println("Valor lucrado por boleto: R$" + pedido.getValorTotal());
                        }
                    }
                    else{
                        for(Pedido pedido : listaPedidos.values())
                        if(pedido.getFormasDePagamentos() == FormaPagamento.PICPAY){
                        System.out.println("Valor lucrado por PICPAY: R$" + pedido.getValorTotal());
                        }
                    }
                    break;
                
            case "05":
                    System.out.println("***************************");
                    System.out.println("*****" + this.nome + "*****");
                    System.out.println("***************************");
                    System.out.println("");
                    System.out.println(formatador.format(dataRelatorio));
                    System.out.println("");
                    System.out.println("Cliente:");
                    System.out.println(linha);
                    for (Pedido pedido : listaPedidos.values()){

                        System.out.println(pedido.getCliente());
                        System.out.println(linha);
                        pedido.mostrarPedidos();
                        System.out.println(linha);
                        pedido.mostarValores();
                    }

                    break;
                    default: throw new MinhaException();
                }
        } while(escolha != "00");

    }
}
