package Exercícios_Estrutura_Condicional;

import java.util.Scanner;

public class Exercício04 {

	public static void main(String[] args) {
		/*
		 * Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, 
		 * sabendo que o mesmo pode começar em um dia e terminar em outro, 
		 * tendo uma duração mínima de 1 hora e máxima de 24 horas.
		 */
		Scanner sc = new Scanner (System.in);
		
		int horaIni = sc.nextInt();
		int horafin = sc.nextInt();
		
		int duracao;
		
		if (horaIni < horafin) {
			duracao = horafin - horaIni;
		}
		else {
			duracao = 24 - horaIni + horafin;
		}
		
		System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
		
		sc.close();

	}

}
