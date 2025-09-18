package curso_programacao;

import java.util.Scanner;

public class Exercício_37_8 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		double renda;
		
		renda = sc.nextDouble();
		
		if (renda <= 2000.00) {
			System.out.printf("Isento %n");
		}else if (renda <= 3000.00) {
			System.out.printf("R$ %.2f", (renda - 2000) * 0.08);
		}else if (renda <= 4500.00) {
			System.out.printf("R$ %.2f", ((renda - 2000) * 0.08) + ((renda - 3000) * 0.18));
		}else {
			System.out.printf("R$ %.2f", ((renda - 2000) * 0.08) + ((renda - 3000) * 0.18) + ((renda - 4500) * 0.28));
		}
		
		sc.close();
	}
}
