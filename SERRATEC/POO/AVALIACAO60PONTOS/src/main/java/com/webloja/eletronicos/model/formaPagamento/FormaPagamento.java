package formaPagamento;

public enum FormaPagamento {
    CARTAODECREDITO("Cartao de credito"),
	CARTAODEDEBITO("Cartao de debito"),
	PIX("PIX"),
	BOLETO("Boleto"),
	PICPAY("PICPAY");

    String pagamento;

    private FormaPagamento(String pagamento) {
        this.pagamento = pagamento;
    }

    public String getFormaPagamento(){
        return this.pagamento;
    }
}
