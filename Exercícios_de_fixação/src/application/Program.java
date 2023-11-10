package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enun.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {

		/*
		 * Ler os dados de um pedido com N itens (N fornecido pelo usuário). Depois,
		 * mostrar um sumário do pedido conforme exemplo (próxima página). Nota: o
		 * instante do pedido deve ser o instante do sistema: new Date()
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("Enter cliente data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date birthdate = sdf.parse(sc.next());
		Client client = new entities.Client(name, email, birthdate);

		System.out.println("Enter order data: ");
		System.out.print("Status: ");
		OrderStatus status = OrderStatus.valueOf(sc.next());
		
		// instanciando o pedido antes do laço de repetição;
		Order order = new Order(new Date(), status, client);
		//Usado o new Date() para pegar o hoario do sistema(maquina)

		System.out.print("How many items to this order? ");
		int numberOrder = sc.nextInt();

		for (int i = 0; i < numberOrder; i++) {
			System.out.println("Enter #" + (i + 1) + " item data: ");
			System.out.print("Product name: ");
			sc.nextLine();
			String productName = sc.nextLine();
			System.out.print("Product price: ");
			double productPrice = sc.nextDouble();
			/*
			 * primeiro instaciar o produto e o preço obs : não usar o mesmo nome da que
			 * usou em outra classe quando for instaciar
			 */
			Product product = new Product(productName, productPrice);

			System.out.print("Quantity: ");
			int quantity = sc.nextInt();

			/* Segundo instaciar o item de pedido associado a este produto */
			OrderItem it = new OrderItem(quantity, productPrice, product);
			
			// para adicionar um item no meu pedido que instaciei;
			order.addOrderIntem(it);
		}
		
		System.out.println();
		System.out.println(order);
		
		sc.close();
	}

}
