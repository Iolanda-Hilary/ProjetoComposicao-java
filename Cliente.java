package main;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Cliente {
	private String nomeCliente;
	private String email;
	private Date dataNascimento;
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public Cliente(String nomeCliente, String email, Date dataNascimento) {
		super();
		this.nomeCliente = nomeCliente;
		this.email = email;
		this.dataNascimento = dataNascimento;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	@Override
	public String toString() {
		return "Cliente: " + nomeCliente + ", Email:" + email + ", Data De Nascimento:" + dataNascimento;
	}
}
