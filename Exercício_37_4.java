package curso_programacao;

import java.util.Scanner;

public class Exercício_37_4 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int A, B;
		
		System.out.println("Começou em: ");
		A = sc.nextInt();
		
		System.out.println("Terminou em: ");
		B = sc.nextInt();
		
		if (A >= B) {
			System.out.printf("O JOGO DUROU %d HORA(S)", (24-A)+B);
		}else {
			System.out.printf("O JOGO DUROU %d HORA(S)", B-A);
		}
		
		sc.close();
	}
}
