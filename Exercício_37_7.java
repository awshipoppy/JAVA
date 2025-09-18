package curso_programacao;

import java.util.Scanner;

public class Exercício_37_7 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		double x, y;
		
		x = sc.nextDouble();
		y = sc.nextDouble();
		
		if (x == 0 && y == 0) {
			System.out.println("Origem");
		}else if (x >= 0 && y >= 0) { 
			System.out.println("Q1");
			if (x == 0) {
				System.out.println("Eixo X");
			}
			if (y == 0) {
				System.out.println("Eixo X");
			}
		}else if (x <= 0 && y >= 0) {
			System.out.println("Q2");
			if (x == 0) {
				System.out.println("Eixo X");
			}
			if (y == 0) {
				System.out.println("Eixo X");
			}
		}else if (x <= 0 && y <= 0) {
			System.out.println("Q3");
			if (x == 0) {
				System.out.println("Eixo X");
			}
			if (y == 0) {
				System.out.println("Eixo X");
			}
		}else if (x >= 0 && y <= 0) {
			System.out.println("Q4");
			if (x == 0) {
				System.out.println("Eixo X");
			}
			if (y == 0) {
				System.out.println("Eixo X");
			}
		}
		
		sc.close();
	}
}
