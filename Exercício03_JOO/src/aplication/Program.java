package aplication;

import java.util.Locale;
import java.util.Scanner;

import javax.security.auth.x500.X500Principal;

import entitie.Aluno;

public class Program {

	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler o nome de um aluno e as três notas que ele obteve nos três trimestres do ano
(primeiro trimestre vale 30 e o segundo e terceiro valem 35 cada). Ao final, mostrar qual a nota final do aluno no
ano. Dizer também se o aluno está aprovado (PASS) ou não (FAILED) e, em caso negativo, quantos pontos faltam
para o aluno obter o mínimo para ser aprovado (que é 60% da nota). Você deve criar uma classe Student para
resolver este problema.
		 */
		Locale.setDefault(Locale.US);
		Scanner sc  = new Scanner (System.in);
		
		Aluno aluno = new Aluno();
		System.out.println("Nome: ");
		aluno.aluno = sc.nextLine();
		aluno.n1 = sc.nextDouble();
		aluno.n2 = sc.nextDouble();
		aluno.n3 = sc.nextDouble();
		
		System.out.println("FINAL GRADE =" + aluno.notaFinal());
		
		if (aluno.notaFinal() < 60.00) {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS %n", aluno.potons());
		}
		else {
			System.out.println("Pass");
		}
		
		sc.close();

	}

}
