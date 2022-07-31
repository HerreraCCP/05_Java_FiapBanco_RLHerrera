package br.com.fiap.banco;

import java.io.Serializable;

public class Conta implements Serializable {
	private int agencia;
	private int numero;
	private double saldo;
	private static final long serialVersionUID = 1L;


	public int getAgencia() { return agencia; }
	public void setAgencia(int agencia) { this.agencia = agencia; }
	public int getNumero() { return numero; }
	public void setNumero(int numero) { this.numero = numero;}

	/**
	 * Verifica o Saldo da Conta
	 * @return Valor do Saldo da Conta
	 */
	public double getSaldo()
	{
		return this.saldo;
	}

	public  Conta(){

	}

	public Conta(int agencia, int numero, double saldo) {
		this.agencia = agencia;
		this.numero= numero;
		this.saldo = saldo;
	}
	

	/**
	 * Retira um valor do Saldo da Conta
	 * @param valor que sera retirado
	 * @see depositar
	 */
	public void retirar(double valor)
	{
		this.saldo -= valor;
	}

	public void depositar(double valor)
	{
		this.saldo += valor;
	}

}
