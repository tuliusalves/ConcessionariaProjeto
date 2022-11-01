package Concessionaria;

import java.util.ArrayList;

public class Loja {
	private Pessoa proprietarioLoja;
	private int quantidade;
	ArrayList<Carro> carro = new ArrayList();
	
	public void cadastrarCarro(Carro carro) {
		this.carro.add(new Carro(carro.getPlaca(), carro.getMarca(),carro.getModelo(), 
				carro.getAno(), carro.getValorAproximado(),carro.getDono()));
	}
	
	public void pesquisarCarros(String placa) {
		for(Carro aux: carro) {
			if(aux.getPlaca().equals(placa)) {
				System.out.println("Placa encontrada: "+aux.toString());
			}else {
				System.out.println("Placa não encontrada!");
			}
		}
		
	}
	
	public void pesquisarMarcaModelo(int marca, String modelo) {
		for(Carro aux: carro) {
			if(aux.getMarca()==aux.selecionarMarca(marca) && aux.getModelo().equals(modelo)) {
				System.out.println("Modelo e marca encontrados:"+ aux.toString());
			}else {
				System.out.println("O carro dessa marca e modelo não foi encontrado!");
			}
		}
		
	}
	
	public void pesquisarAno(int ano) {
		for(Carro aux: carro) {
			if(aux.getAno()==ano) {
				System.out.println("Carro do ano encontrado: "+ aux.toString());
			}else {
				System.out.println("O carro desse ano não foi encontrado!");
			}
		}
	}
	
	public void listarCarros() {
		for(Carro aux:carro) {
			System.out.println(aux.toString());
		}
	}
	public String informacoesLoja() {
		return "Loja [ proprietarioLoja=" + proprietarioLoja + ", quantidade=" + getQuantidade()+"]";
	}

	public Pessoa getProprietarioLoja() {
		return proprietarioLoja;
	}

	public void setProprietarioLoja(Pessoa proprietarioLoja) {
		this.proprietarioLoja = proprietarioLoja;
	}

	public int getQuantidade() {
		quantidade= carro.size();
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		
		this.quantidade = quantidade;
	}

	public ArrayList<Carro> getCarro() {
		return carro;
	}

	public void setCarro(ArrayList<Carro> carro) {
		this.carro = carro;
	}

	
	
	@Override
	public String toString() {
		return "  Proprietário da loja "+ getProprietarioLoja() +" [Quantidade de veículos:"
				+getQuantidade()+"]\n"+getCarro()+"";
	}

}
