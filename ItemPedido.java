package main;

public class ItemPedido {
	Integer quantidade;
	Double preco;

	
	public ItemPedido() {
		
	}


	@Override
	public String toString() {
		return "Item do Pedido" + quantidade + " Preco-- " + preco;
	}


	public ItemPedido(Integer quantidade, Double preco) {
	
		this.quantidade = quantidade;
		this.preco = preco;
	}


	public Integer getQuantidade() {
		return quantidade;
	}


	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}


	public Double getPreco() {
		return preco;
	}


	public void setPreco(Double preco) {
		this.preco = preco;
	}


	public Double subTotal() {
		return preco;
		
	}


	public void addItem(ItemPedido item) {
		
		
	}

}
