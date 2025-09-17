package curso_programacao;

import java.util.Scanner;

public class Exercício_37_2 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int Num;
		
		System.out.println("Fale um número: ");
		
		Num = sc.nextInt();
		
		if (Num % 2 == 0) {
			System.out.println("PAR");
		}else {
			System.out.println("IMPAR");
		}
		
		sc.close();
	}
}
