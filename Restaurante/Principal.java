package Restaurante;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
	
	ArrayList <Restaurante> restaurante =new ArrayList<Restaurante>(); 
		
		Scanner in = new Scanner(System.in);
		int op;
       
		do {
			  op = CadastroRestauranteCliente.cadastraCliRes();
			
			System.out.println("\n Sistema "
					+ "\n 3 - Visualizar Restaurante"
					+ "\n 4 - Ler Cardapio "
					+ "\n 5 - Fazer Pedidos "
					+ "\n 6 - Visualizar Pedidos do Cliente  "
					+ "\n 7 - Avaliar Pedido "
					+ "\n 8 - Avaliar Restaurante "
					+ "\n 9 - Avaliar Sistema "
					+ "\n 10 - Finalizar Sistema ");
			op = Integer.parseInt(in.nextLine());
			
			switch(op){
			
			case 1:  CadastroRestauranteCliente.cadastrarCliente(restaurante);break;
            case 2:  CadastroRestauranteCliente.cadastrarRes(restaurante);break;
			case 3 :visualizarRes(restaurante);break;
			case 4 :lerCardapio();break;
			}
			
		}while(op != 10);
	}

	private static void lerCardapio() {
		Scanner in = new Scanner(System.in);

		
		System.out.println("\n ===========\n Cardapio da Casa \n =========== \n");

		int opcao = 0;
		int steakePreco = 0;
		int hamburgeresPrco = 0;
			
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
				
				if(opcao == 2) {
					
					System.out.println(" \n Hamburgeres Gourmet \n "
							+ "\n 1 - Smasch Salat "
							+ "\n 2 - Smasch Salat duplo"
							+ "\n 3 - smasch bacon "
							+ "\n 4 - smasch bacon duplo ");
					hamburgeresPrco = Integer.parseInt(in.nextLine());
				}
			}
			
	}

	private static void visualizarRes(ArrayList <Restaurante> restaurante) {
		
		for (Restaurante restaurante2 : restaurante) {
			
			System.out.println(" Nome : "+restaurante2.getNomeRes()
			                +"\n Cidade : "+restaurante2.getCidade()
			                +"\n Endereco : "+restaurante2.getEnd()
			                +"\n AValiacoes : "+restaurante2.getAvaR());
			
		}
	}
	
	
}
