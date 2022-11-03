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
	
	public void pesquisarCarrosPlaca(String placa) {
		ArrayList <Carro> carroResult = new ArrayList();
		for(Carro aux: carro) {
			if(aux.getPlaca().equals(placa)) {
				System.out.println("Placa encontrada: "+aux.toString());
			}else {
				carroResult.add(aux);
			}
			if(carroResult.size()== carro.size()) {
				System.out.println("Placa não encontrada!");
			}
		}
		
	}
	
	public void pesquisarMarcaModelo(int marca, String modelo) {
		ArrayList <Carro> carroResult = new ArrayList();
		for(Carro aux: carro) {
			if(aux.getMarca()==aux.selecionarMarca(marca) && aux.getModelo().equals(modelo)) {
				System.out.println("Modelo e marca encontrados:"+ aux.toString());
			}else {
				carroResult.add(aux);
			}
			if(carroResult.size()== carro.size()) {
				System.out.println("O carro dessa marca e modelo não foi encontrado!");
			}
		}
		
	}
	
	public void pesquisarAno(int ano) {
		ArrayList <Carro> carroResult = new ArrayList();
		for(Carro aux: carro) {
			if(aux.getAno()==ano) {
				System.out.println("Carro do ano encontrado: "+ aux.toString());
			}else {
				carroResult.add(aux);
			}
			if(carroResult.size()== carro.size()) {
				System.out.println("O carro desse ano não foi encontrado!");
			}
		}
	}
	
	public void listarCarros() {
		for(Carro aux:carro) {
			System.out.println(aux.toString());
		}
	}
	public String informacoesLoja(int quantidade) {
		setQuantidade(quantidade);
		return "Loja [ proprietarioLoja=" + proprietarioLoja + ", quantidade=" + getQuantidade()+"]";
	}

	public Pessoa getProprietarioLoja() {
		return proprietarioLoja;
	}

	public void setProprietarioLoja(Pessoa proprietarioLoja) {
		this.proprietarioLoja = proprietarioLoja;
	}

	public int getQuantidade() {
		//quantidade+= carro.size();
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
