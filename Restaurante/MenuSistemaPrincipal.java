package Restaurante;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuSistemaPrincipal {
	public static void main(String[]args) {
			
		ArrayList <Restaurante> restaurante =new ArrayList<Restaurante>(); 
		ArrayList <Cliente> cliente = new ArrayList<Cliente>();
	   Scanner in = new Scanner(System.in);
		int op;
		 do {
			// op = ClassePrincipal.main(args);
			 System.out.println("\n Cadastro "
			 		 + "\n 0 - Restaurante "
					 + "\n 1 - Cadastrar Cliente"
					 + ""
					 + ""
					 +" \n ========= \n Sistema \n ========="
					 + "\n 2 - Visualizar Restaurante"
					 + "\n 3 - Ler Cardapio "
					 + "\n 4 - Realizar Pedido "
					 + "\n 5 - Visualizar Pedidos do Cliente  "
					 + "\n 6 - Avaliacoes "
					 + "\n 9 - Finalizar Sistema ");
			 op = Integer.parseInt(in.nextLine());
			 switch(op) {

			 case 0 : ClasseSistema.cadastrarRes(restaurante);break;
			 case 1 : ClasseSistema.cadastrarCliente(cliente);break;
			 case 2 : ClasseSistema.visualizarRes(restaurante);break;
			 case 3 : ClasseSistema.lerCardapio(restaurante,cliente);break;
			 case 4 : ClasseSistema.realizarPedido(restaurante,cliente);break;
			 case 5 : ClasseSistema.visualizaPedidoCliente();break;
			 case 6 : ClasseSistema.avaliacoes();break;
			 case 9 :
			 }
          
		 }while(op != 9);
		
	}
}