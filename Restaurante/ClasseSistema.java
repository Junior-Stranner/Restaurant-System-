package Restaurante;

import java.util.ArrayList;
import java.util.Scanner;

public class ClasseSistema {

	static ArrayList <Restaurante> restaurante =new ArrayList<Restaurante>(); 
	static ArrayList <Cliente> cliente = new ArrayList<Cliente>();
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {

	}
	public static void avaliacoes(ArrayList <Restaurante> restaurante,ArrayList <Cliente> cliente) {

		String avaP =null;
		String avaR =null;
		String avaS =null;

		System.out.println("===========================================");


		for (Restaurante restaurante2 : restaurante) {
			for (Cliente cliente2 : cliente) {

				System.out.println(" Digite o seu nome ");
				String nome = in.nextLine();

				if(cliente2.getNomeCliente().equalsIgnoreCase(nome)) {

					System.out.println(" OLa ,"+cliente2.getNomeCliente()
					+"\n Poderia por gentileza dar a Sua avaliacao "
					+ "no nosso Sistema , Resturante e Pedido ?"
					+ ""
					+ "\n 1 - Sim "
					+ "\n 2 - Nao ");
					int avaliar = Integer.parseInt(in.nextLine());

					if(avaliar == 1) {

						System.out.print(" Avaliar Pedido :");
						avaP = in.nextLine();

						System.out.print(" Avaliar Restaurante :");
						avaR = in.nextLine();

						System.out.print(" Avaliar Sistema :");
						avaS = in.nextLine();
					}

				}
				restaurante2.setAvaP(avaP);
				restaurante2.setAvaR(avaR);
				restaurante2.setAvaS(avaS);
				System.out.println(" =================================");

				System.out.print("Cliente :" +cliente2.getNomeCliente()
				+"\n Avaliacao do Pedido :"+restaurante2.getAvaP()
				+"\n Avaliacao do Restaurante :"+restaurante2.getAvaR()
				+"\n Avaliacao Sistema : "+restaurante2.getAvaS());

			}
		}
		System.out.println("===========================================");


	}


	public static void visualizaPedidoCliente(ArrayList <Restaurante> restaurante,ArrayList <Cliente> cliente) {

		System.out.println("===========================================");

		for (Restaurante restaurante2 : restaurante) {
			for (Cliente cliente2 : cliente) {

				System.out.println("Cliente :" +cliente2.getNomeCliente()
				+"\n Seus Pedidos : "+restaurante2.getPedido()
				+"\n Valor Total e : "+restaurante2.getPreco());

			}
		}
		System.out.println("===========================================");


	}


	static void realizarPedido(ArrayList <Restaurante> restaurante,ArrayList <Cliente> cliente) {

		int pedido = 0;

		System.out.println("===========================================");


		for (Restaurante restaurante2 : restaurante) {
			for (Cliente cliente2 : cliente) {

				System.out.print(" Nome do Cliente : ");
				String nome = in.nextLine();
				if(cliente2.getNomeCliente().equalsIgnoreCase(nome)) {

					System.out.println(" Confirma Pedido "
							+ "\n 1 - Confirmar "
							+ "\n 2 - cancelar ");
					pedido = Integer.parseInt(in.nextLine());

					if(pedido == 1) {
						System.out.println("Cliente :" +cliente2.getNomeCliente()
						+"\n Peido Confirmado  : "+restaurante2.getPedido()
						+"\n Valor Pago de : "+restaurante2.getPreco());
					} else 
						System.out.println(" Pedido Cancelado !!");
				}
			}
		}
		System.out.println("===========================================");

	}

	static void lerCardapio(ArrayList <Restaurante> restaurante,ArrayList <Cliente> cliente ) {
		Scanner in = new Scanner(System.in);
		System.out.println("===========================================");


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

						if(steakePreco == 2) {
							restaurante2.setPreco(59.90);

							if(steakePreco == 3) {
								restaurante2.setPreco(119.90);
							}
						}

					}
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

						if(hamburgeresPreco == 2) {
							restaurante2.setPreco(40.90);

							if(hamburgeresPreco == 3) {
								restaurante2.setPreco(34.90);

								if(hamburgeresPreco == 4) {
									restaurante2.setPreco(59.90);
								}
							}
						}
					}
				}

				if(opcao ==3 ) {

					System.out.println("\n Porcoes "
							+ "\n 1 - Batatas com Carne "
							+ "\n 2 - Batatas com Frango "
							+ "\n 3 - Batatas com Calabresa");
					porcoesPreco = Integer.parseInt(in.nextLine());

					if(porcoesPreco == 1) {
						restaurante2.setPreco(23.90);

						if(porcoesPreco == 2) {
							restaurante2.setPreco(20.90);

							if(porcoesPreco == 3) {
								restaurante2.setPreco(18.90);

							}

						}
					}
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
					if(escolhaBebidas == 1) {

						System.out.println(" \n Refrigerantes"
								+ "\n 1 - Guarana Antatica 600 ml"
								+ "\n 2 - Coca Cola 600 ml "
								+ "\n 3 - Fanta 600 ml"
								+ "\n 4 - Sprite 600 ml"
								+ "\n 5 - Coca Zero 600 ml"
								+ "\n 6 - Voltar");
						int refrigerantes = Integer.parseInt(in.nextLine());
						if(refrigerantes == 1) {
							restaurante2.setPreco(6.90);

							if(refrigerantes == 2) {
								restaurante2.setPreco(6.90);

								if(refrigerantes == 3) {
									restaurante2.setPreco(6.90);

									if(refrigerantes == 4) {
										restaurante2.setPreco(6.90);

										if(refrigerantes == 5) {
											restaurante2.setPreco(6.90);
										}
									}
								}
							}
						}

						System.out.println("\n Alcool "
								+ "\n 1 - Vinho "
								+ "\n 2 - Heiniken "
								+ "\n 3 - Amstel"
								+ "\n 4 - Scol"
								+ "\n 5 - Proibida ");
						int alcool = Integer.parseInt(in.nextLine());

						if(alcool == 1) {
							restaurante2.setPreco(32.90);

							if(alcool == 2) {
								restaurante2.setPreco(12.90);

								if(alcool == 3) {
									restaurante2.setPreco(11.90);

									if(alcool == 4) {
										restaurante2.setPreco(8.90);

										if(alcool == 5) {
											restaurante2.setPreco(7.90);
										}
									}
								}

							}
						}
					}
					restaurante2.setPedido(steakePreco + hamburgeresPreco + porcoesPreco + bebidasPreco);

					System.out.print("Cliente :" +cliente2.getNomeCliente()
					+"\n Seus Pedidos : "+restaurante2.getPedido());
				}
			}
		}

		System.out.println("\n ===========================================");

	}

	static void visualizarRes(ArrayList <Restaurante> restaurante) {

		System.out.println("===========================================");


		for (Restaurante restaurante2 : restaurante) {

			System.out.print(" Nome : "+restaurante2.getNomeRes()
			+"\n Cidade : "+restaurante2.getCidade()
			+"\n Endereco : "+restaurante2.getEnd());

		}
		System.out.println("\n ===========================================");

	}

	public static void visualizarClientes(ArrayList <Cliente> cliente ) {

		System.out.println("===========================================");


		for (Cliente cliente2 : cliente) {


			System.out.println("Cliente : "+cliente2.getNomeCliente());
			System.out.println("                  ");

		}

		System.out.println("===========================================");

	}

	static int cadastrarCliente(ArrayList <Cliente> cliente ) {

		System.out.println("===========================================");


		Scanner in = new Scanner(System.in);

		System.out.print(" Nome do Cliente :");
		String nomeCliente = in.nextLine();

		System.out.println("===========================================");


		Cliente cli = new Cliente(nomeCliente);

		cliente.add(cli);
		return 0;

	}

	static int cadastrarRes(ArrayList <Restaurante> restaurante) {
		System.out.println("===========================================");


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

		System.out.println("===========================================");

		Restaurante res = new Restaurante(nome,cidade,end,avaS,avaR,avaS,cardapio,preco);

		restaurante.add(res);
		return 0;

	}

}
