package entities;

import java.util.Scanner;

public class AplicaçãoComumVerificarBit {

	public static void main(String[] args) {
		/*
		 * (89)  0101 1001
          (32)   0010 0000
                      &: 0000 0000 (0)

        (113)  0111 0001
        (32)  0010 0000
                       
                       &: 0010 0000 (32)
		 */
		
		Scanner sc = new Scanner(System.in);
		int mask = 0b100000;
		int n = sc.nextInt();
		if ((n & mask) != 0) {
		System.out.println("6th bit is true!");
		}
		else {
		System.out.println("6th bit is false");
		}
		sc.close();

	}

}
