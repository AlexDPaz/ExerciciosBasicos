package application;

import java.text.SimpleDateFormat;
import java.util.Scanner;

import entities.Comment;
import entities.Post;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		for(int i=0; i<=2; i++) {
		Comment coment = new Comment("Commentite");
		String text1 = sc.nextLine();
		Post post = new Post(mo, text1, text1, null)
		}
		
		sc.close();
	}

}
