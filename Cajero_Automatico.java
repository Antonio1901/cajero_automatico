package com.mx.Cajero_Automatico;

public class Cajero_Automatico {

	private int numeroCuenta;
	private String nombreCliente;
	private int saldoCliente;
	
	
public Cajero_Automatico() {
		
	}

	public Cajero_Automatico(int numeroCuenta, String nombreCliente, int saldoCliente) {
		this.numeroCuenta = numeroCuenta;
		this.nombreCliente = nombreCliente;
		this.saldoCliente = saldoCliente;
		
	}
	
	

	@Override
	public String toString() {
		return "Cajero_Automatico [numeroCuenta=" + numeroCuenta + ", nombreCliente=" + nombreCliente
				+ ", saldoCliente=" + saldoCliente + "]\n";
	}



	public int getNumeroCuenta() {
		return numeroCuenta;
	}



	public void setNumeroCuenta(int numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}



	public String getNombreCliente() {
		return nombreCliente;
	}



	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}



	public double getSaldoCliente() {
		return saldoCliente;
	}



	public void setSaldoCliente(int saldoCliente) {
		this.saldoCliente = saldoCliente;
	}
	
	
	}


	