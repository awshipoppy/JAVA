package curso_programacao;

import java.util.Scanner;

public class Exercício_37_5 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int C, Q;
		
		double P;
		
		C = sc.nextInt();
		Q = sc.nextInt();
		
		if (C == 1) {
			System.out.printf("Total: R$ %.2f", 4.00 * Q);
		}else if (C == 2) {
			System.out.printf("Total: R$ %.2f", 4.50 * Q);
		}else if (C == 3) {
			System.out.printf("Total: R$ %.2f", 5.00 * Q);
		}else if (C == 4) {
			System.out.printf("Total: R$ %.2f", 2.00 * Q);
		}else if (C == 5) {
			System.out.printf("Total: R$ %.2f", 1.50 * Q);
		}else {
			System.out.println("Não existe esse código!");
		}
		
		sc.close();
	}
}
