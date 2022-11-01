package Concessionaria;

import java.util.Arrays;

public class Carro {
	private String placa;

	private enum MARCA {
		HYUNDAI, FORD, RENAULT, OUTROS
	};

	MARCA marca;
	private String modelo;
	private int ano;
	private double valorAproximado;
	private Pessoa dono;

	public Carro() {
	}

	public Carro(String placa, MARCA marca, String modelo, int ano, double valorAproximado, Pessoa dono) {
		super();
		this.placa = placa;
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		this.valorAproximado = valorAproximado;
		this.dono = dono;
	}

	public MARCA selecionarMarca(int numero) {
		while(numero>0 || numero<5) {
		if (numero == 1) {
			setMarca(this.marca.HYUNDAI);
			return this.marca;
		}
		else if (numero == 2) {
			setMarca(this.marca.FORD);
			return this.marca;
		}
		else if (numero == 3) {
			setMarca(this.marca.RENAULT);
			return this.marca;
		}
		else if( numero==4) {
			setMarca(this.marca.OUTROS);
			return this.marca;
		}
		else System.out.println("Digite outra opção");
		}
		return null;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public MARCA getMarca() {
		return marca;
	}

	public void setMarca(MARCA marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public double getValorAproximado() {
		return valorAproximado;
	}

	public void setValorAproximado(double valorAproximado) {
		this.valorAproximado = valorAproximado;
	}

	public Pessoa getDono() {
		return dono;
	}

	public void setDono(Pessoa dono) {
		this.dono = dono;
	}

	@Override
	public String toString() {
		return "Carro [placa=" + placa + ", marca=" + marca + ", modelo=" + modelo + ", ano=" + ano
				+ ", valorAproximado=" + valorAproximado + ", dono=" + dono + "]";
	}

	
}

