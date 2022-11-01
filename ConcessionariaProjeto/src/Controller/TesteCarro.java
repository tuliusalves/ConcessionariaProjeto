package Controller;

import Concessionaria.Carro;
import Concessionaria.Pessoa;

public class TesteCarro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Carro carro= new Carro();
		carro.setAno(1);
		Pessoa pessoa = new Pessoa("orlando","89898","98989");
		Carro carro2= new Carro("a",carro.selecionarMarca(1),"5",9,99.5,pessoa);
		System.out.println(carro.toString());
	}

}
