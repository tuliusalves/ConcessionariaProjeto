package Controller;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import Concessionaria.Carro;
import Concessionaria.Loja;
import Concessionaria.Pessoa;

public class AplicacaoConcessionaria {
	/*
	 * Entrada: 
	 * -ArrayList de carro.
	 * -objeto loja.
	 * -Criando var para inserir no arrayList de carro .
	 * 		Strings nome,cpf,telefone, placa, marca, modelo.
	 * 		int ano.
	 * 		double valor estimado.
	 * -Criando int(interacao, operacao) que irão interagir com o loop e menu.
	 * Processamento:
	 * -Atribuir os valores do proprietario da loja que é um objeto de pessoa.
	 * -Setar o proprietario no objeto de loja.
	 * -Criar um método estático do tipo inteiro que dará as opções do menu
	 * -Fazer um loop com "do while" como o "switch" que utilize o método do menu
	 * 		o "switch" e "do while" se baseará no valor de operacao
	 * Saída:
	 * -Será dada nas opções de switch.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Carro> listaCarro = new ArrayList();
		Loja loja= new Loja();
		Carro carro= new Carro();
		
		
		String nome, cpf, telefone, placa, modelo;
		int ano, marca;
		int interacao=0;
		int operacao=0;
		double valorEstimado;
		
		nome = (JOptionPane.showInputDialog("Digite o nome do proprietário da loja:"));
		cpf = (JOptionPane.showInputDialog("Digite o número do cpf"));
		telefone = (JOptionPane.showInputDialog("Digite o número do telefone"));
		Pessoa proprietario = new Pessoa(nome,cpf,telefone);
		loja.setProprietarioLoja(proprietario);
		
		
		do {
			switch (operacao) {
			case 1:
				nome = (JOptionPane.showInputDialog("Digite o nome do proprietário do carro:"));
				cpf = (JOptionPane.showInputDialog("Digite o número do cpf"));
				telefone = (JOptionPane.showInputDialog("Digite o número do telefone"));
				placa = (JOptionPane.showInputDialog("Digite a placa do carro"));
				marca = (Integer.parseInt(JOptionPane.showInputDialog("Digite a marca do carro"
						+ "\n  *1-Hyundai *2-Ford *3-Renault 4-Outros...")));
				modelo = (JOptionPane.showInputDialog("Digite o modelo do carro"));
				ano = (Integer.parseInt(JOptionPane.showInputDialog("Digite o ano do carro")));
				valorEstimado = (Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do carro R$:")));
				Pessoa pessoa = new Pessoa(nome, cpf, telefone);
				listaCarro.add(new Carro(placa, carro.selecionarMarca(marca) , modelo, ano, valorEstimado, pessoa));
			
				operacao=menuInteracao(interacao);
				break;
			case 2:
				loja.setCarro(listaCarro);
				placa=(JOptionPane.showInputDialog("Digite a placa a ser pesquisada"));
				loja.pesquisarCarros(placa);
				
				operacao=menuInteracao(interacao);
				break;
				
			case 3:
				loja.setCarro(listaCarro);
				marca=(Integer.parseInt(JOptionPane.showInputDialog("Qual placa deseja pesquisar? "
						+ "\n  *1-Hyundai *2-Ford *3-Renault 4-Outros...")));
				modelo=(JOptionPane.showInputDialog("Digite o nome do modelo do carro que deseja pesquisar:"));
				loja.pesquisarMarcaModelo(marca, modelo);
				
				operacao=menuInteracao(interacao);
				break;
			case 4:
				loja.setCarro(listaCarro);
				ano=(Integer.parseInt(JOptionPane.showInputDialog("Digite o ano do carro que deseja pesquisar")));
				loja.pesquisarAno(ano);
		
				operacao=menuInteracao(interacao);
				break;
			case 5:
				loja.setCarro(listaCarro);
				loja.listarCarros();
				operacao=menuInteracao(interacao);
				break;
			case 6:
				System.out.println(loja.informacoesLoja());
				operacao=menuInteracao(interacao);
				break;
			default:
				operacao=menuInteracao(interacao);
			}
		} while (operacao != 7);

		

	}
	public static int menuInteracao(int interacao) {
		interacao = (Integer.parseInt(JOptionPane.showInputDialog("1-Cadastrar carro "
				+ "| 2- Pesquisar placa do carro | 3-Pesquisar carro por(Marca/Modelo)\n"
				+ "4-Pesquisar carro por ano | 5-Listar todos os carros "
				+ "| 6-Informações da loja \n7-Finalizar o programa")));
		return interacao;
	}

}
