package main;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido {
		Date momento;
		StatusDoPedido status;
		private Cliente cliente;
		
	private List<ItemPedido> itens = new ArrayList<ItemPedido>();
	SimpleDateFormat sdf = new SimpleDateFormat();	
	public Pedido(Date momento, StatusDoPedido status, Cliente cliente) {
		super();
		this.momento = momento;
		this.status = status;
		this.cliente = cliente;
	}

	public Pedido() {
		
	}

	public Date getMomento() {
		return momento;
	}

	public void setMomento(Date momento) {
		this.momento = momento;
	}

	public StatusDoPedido getStatus() {
		return status;
	}

	public void setStatus(StatusDoPedido status) {
		this.status = status;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public double Total() {
		double soma = 0.0;
		for (ItemPedido it : itens) {
			soma += it.subTotal();
		}
		return soma;
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Momento do pedido ");
		sb.append(sdf.format(momento) + "/n");
		sb.append("Status do pedido ");
		sb.append(status + "/n");
		sb.append("Cliente: ");
		sb.append(cliente + "/n");
		sb.append("Itens solicitados: ");
		for (ItemPedido ip : itens) {
			sb.append(ip + "/n");
		}
		sb.append("Total a pagar: R$");
		sb.append(Total());
		
		return sb.toString();
		
		
	}
	
}

