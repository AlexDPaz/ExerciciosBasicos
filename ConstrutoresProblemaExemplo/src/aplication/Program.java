package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		// criado varieavel temporaria pra receber os dados que serão digitados.
		String name = sc.nextLine();
		System.out.print("Price: ");
		double price = sc.nextDouble();
		System.out.print("Quantity in stock: ");
		int quantity = sc.nextInt();
		//só depois de digital os dado ai vem a varial product obrigando a informar dos dados   
		Product product = new Product(name, price, quantity);

		System.out.println();
		System.out.println("Product data: " + product);

		System.out.println();
		System.out.println("Enter the number of products to be added in stock: ");
		quantity = sc.nextInt();
		product.addProducts(quantity);

		System.out.println();
		System.out.println("Updated data: " + product);

		System.out.println();
		System.out.println("Enter the number of products to be removed in stock: ");
		quantity = sc.nextInt();
		product.removedProduct(quantity);

		System.out.println();
		System.out.println("Updated data: " + product);

		sc.close();

	}

}
