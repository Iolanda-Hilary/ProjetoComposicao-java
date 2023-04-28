package main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Scanner sc = new Scanner(System.in);
		Cliente cli = new Cliente(null, null, null);
		ItemPedido item = new ItemPedido();
		Produto prod = new Produto();

		System.out.println("Digite os dados do cliente: ");
		System.out.print("Nome: ");
		cli.setNomeCliente(sc.next());
		System.out.print("Email: ");
		cli.setEmail(sc.next());
		System.out.println("Data de Nascimento (dd/MM/yyyy): ");
		cli.setDataNascimento(sdf.parse(sc.next()));
		System.out.println("Status do Pedido: ");
		StatusDoPedido sdp = StatusDoPedido.valueOf(sc.next());
		System.out.println("Quantos itens no carrinho?");

		int itensCarrinho = sc.nextInt();
		for (int i = 0; i < itensCarrinho; i++) {
			System.out.println("Digite o numero do #" + i + " item");

			System.out.println("Nome o item:");
			prod.setNomeProduto(sc.next());
			System.out.print("Preço do item: ");
			item.setPreco(sc.nextDouble());
			System.out.println("Quantidade do item");
			item.setQuantidade(sc.nextInt());

		}
		System.out.println("-----------------------------------------");
		System.out.println("--RESUMO DO PEDIDO--");
		System.out.println(prod.getNomeProduto());
		System.out.println(item.getPreco());
		System.out.println(item.getQuantidade());
	}

}
