package Restaurante;

import java.util.ArrayList;
import java.util.Scanner;

public class CadastroRestauranteCliente {

	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
	}	

	static int cadastraCliRes() {
		Scanner in = new Scanner(System.in);

		ArrayList <Restaurante> restaurante =new ArrayList<Restaurante>(); 

		int op = 0;
		

			System.out.println("\n Cadastro "
					+ "\n 1 - Cadastrar Cliente"
					+ "\n 2 - Cadastrar Restaurante");
			op = Integer.parseInt(in.nextLine());
        switch(op) {
		case 1: cadastrarCliente(restaurante);break;
		case 2: cadastrarRes(restaurante);break;
	
		}
		return op;
	}
static int cadastrarCliente(ArrayList <Restaurante> restaurante) {

	Scanner in = new Scanner(System.in);

	System.out.print(" Nome do Cliente :");
	String nomeCliente = in.nextLine();

	Restaurante res = new Restaurante(nomeCliente);

	restaurante.add(res);
	return 0;



}
static int cadastrarRes(ArrayList <Restaurante> restaurante) {

	Scanner in = new Scanner(System.in);

	String cardapio = null;
	int pedido = 0;
	float preco = 0;
	String avaR = null;
	String avaS = null;
	String avaP = null;

	System.out.println(" Nome do Restaurante : ");
	String nome = in.nextLine();

	System.out.println(" Local do Restaurante : ");
	String cidade = in.nextLine();

	System.out.println(" Endereco do Restaurante : ");
	String end = in.nextLine();


	Restaurante res = new Restaurante(nome,cidade,end,avaS,avaR,avaS,cardapio,preco);

	restaurante.add(res);
	return 0;
}
}
