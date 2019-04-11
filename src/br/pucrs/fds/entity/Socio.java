package br.pucrs.fds.entity;

import java.io.Serializable;

public class Socio implements Serializable {

	private static final long serialVersionUID = -2634913045746568902L;

	private int codigoSocio;
	private Cliente cliente;

	public Socio() {
	}

	public Socio(int codigoSocio, Cliente cliente) {
		this.codigoSocio = codigoSocio;
		this.cliente = cliente;
	}

	public int getCodigoSocio() {
		return codigoSocio;
	}

	public void setCodigoSocio(int codigoSocio) {
		this.codigoSocio = codigoSocio;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

}
