package Restaurante;

import java.util.ArrayList;
import java.util.Scanner;

public class ClasseSistema {
	
	static ArrayList <Restaurante> restaurante =new ArrayList<Restaurante>(); 
	static ArrayList <Cliente> cliente = new ArrayList<Cliente>();
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		
	}
	public static void avaliacoes() {
		// TODO Auto-generated method stub
		
	}

	
	
	public static void visualizaPedidoCliente() {
		// TODO Auto-generated method stub
		
	}


	static void realizarPedido(ArrayList <Restaurante> restaurante,ArrayList <Cliente> cliente) {

		for (Restaurante restaurante2 : restaurante) {
			for (Cliente cliente2 : cliente) {



				System.out.println("Cliente :" +cliente2.getNomeCliente()
				+"\n Seus Pedidos : "+restaurante2.getPedido()
				+"\n Valor Total e : "+restaurante2.getPreco());
			}
		}
	}

	static void lerCardapio(ArrayList <Restaurante> restaurante,ArrayList <Cliente> cliente ) {
		Scanner in = new Scanner(System.in);

		for (Restaurante restaurante2 : restaurante) {
			for (Cliente cliente2 : cliente) {


				System.out.println("\n ===========\n Cardapio da Casa \n =========== \n");

				int opcao = 0;
				int steakePreco = 0;
				int hamburgeresPreco = 0;
				int porcoesPreco = 0;
				int escolhaBebidas = 0;
				int bebidasPreco = 0 ;

				System.out.println("\n  MENU \n "
						+ "\n 1 - Steak +(Acompanhantes)"
						+ "\n 2 - Haburgeres Gourmet "
						+ "\n 3 - Porcoes "
						+ "\n 4 - Bebidas ");
				opcao = Integer.parseInt(in.nextLine());

				if(opcao == 1) {

					System.out.println(" \n Steaks \n "
							+ "\n 1 - Steak 1 Pessoa "
							+ "\n 2 - Steak 2 pessoas "
							+ "\n 3 - Steak Familia 4 Pessoas");
					steakePreco = Integer.parseInt(in.nextLine());
					if(steakePreco == 1) {
						restaurante2.setPreco(31.90);

					}else if(steakePreco == 2) {
						restaurante2.setPreco(59.90);

					}	else if(steakePreco == 3) {
					}		restaurante2.setPreco(119.90);
				}
				if(opcao == 2) {

					System.out.println(" \n Hamburgeres Gourmet \n "
							+ "\n 1 - Smasch Salat "
							+ "\n 2 - Smasch Salat duplo"
							+ "\n 3 - smasch bacon "
							+ "\n 4 - smasch bacon duplo ");
					hamburgeresPreco =Integer.parseInt(in.nextLine());
					if(hamburgeresPreco == 1) {
						restaurante2.setPreco(22.90);

					}else if(hamburgeresPreco == 2) {
						restaurante2.setPreco(40.90);

					}else if(hamburgeresPreco == 3) {
						restaurante2.setPreco(34.90);

					}else if(hamburgeresPreco == 4) {
						restaurante2.setPreco(59.90);
					}
				}

				if(opcao ==3 ) {

					System.out.println("\n Porcoes "
							+ "\n 1 - Batatas com Carne "
							+ "\n 2 - Batatas com Frango "
							+ "\n 3 - Batatas com Calabresa");
					porcoesPreco = Integer.parseInt(in.nextLine());
				}
				if(opcao == 4) {

					System.out.println("\n Bebidas "
							+ "\n 1 - Refrigerantes "
							+ "\n 2 - Alcool "
							+ "\n 3 - Sucos "
							+ "\n 4 - Agua "
							+ "\n 5 - Bebidas uentes"
							+ "\n 6 - voltar");
					escolhaBebidas =Integer.parseInt(in.nextLine());
				}
				if(escolhaBebidas == 1) {
					
					System.out.println(" \n Refrigerantes"
							+ "\n 1 - Guarana Antatica 600 ml"
							+ "\n 2 - Coca Cola 600 ml "
							+ "\n 3 - Fanta 600 ml"
							+ "\n 4 - Sprite 600 ml"
							+ "\n 5 - Coca Zero 600 ml"
							+ "\n 6 - Voltar");
					bebidasPreco = Integer.parseInt(in.nextLine());
					if(bebidasPreco == 1) {
						restaurante2.setPreco(6.90);
					}
				}

				restaurante2.setPedido(steakePreco + hamburgeresPreco + porcoesPreco + bebidasPreco);

				System.out.println("Cliente :" +cliente2.getNomeCliente()
				+"\n Seus Pedidos : "+restaurante2.getPedido()
				+"\n Valor Total e : "+restaurante2.getPreco());
			}
		}

	}

	static void visualizarRes(ArrayList <Restaurante> restaurante) {

		for (Restaurante restaurante2 : restaurante) {

			System.out.println(" Nome : "+restaurante2.getNomeRes()
			+"\n Cidade : "+restaurante2.getCidade()
			+"\n Endereco : "+restaurante2.getEnd());

		}
	}

	static int cadastrarCliente(ArrayList <Cliente> cliente ) {

		Scanner in = new Scanner(System.in);

		System.out.print(" Nome do Cliente :");
		String nomeCliente = in.nextLine();

		Cliente cli = new Cliente(nomeCliente);

		cliente.add(cli);
		return 0;

	}

	static int cadastrarRes(ArrayList <Restaurante> restaurante) {

		System.out.println("\n ================= \n  Bem Vindos ! \n"
				+ "\n  Ao Restaurante\n  "
				+ "\n Andreia Gourmet \n ================= \n ");

		Scanner in = new Scanner(System.in);

		String nome = "Andreia Gourmet";
		String cidade = "Balneario Camborio";
		String end = "Av Brasil";
		String cardapio = null;
		int pedido = 0;
		float preco = 0;
		String avaR = null;
		String avaS = null;
		String avaP = null;


		System.out.println(" Nome do Restaurante : "+nome); 

		System.out.println(" Cidade do Restaurante : "+cidade);

		System.out.println(" Endereco do Restaurante : "+end);

		Restaurante res = new Restaurante(nome,cidade,end,avaS,avaR,avaS,cardapio,preco);

		restaurante.add(res);
		return 0;

	}
}
