package curso_programacao;

import java.util.Scanner;

public class Aula_35 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int Hora;
		
		System.out.println("Quantas horas?");
		Hora = sc.nextInt();
		
		if (Hora < 12) {
			System.out.println("Bom dia!");
		}else if (Hora >= 12 && Hora <= 18){
			System.out.println("Boa tarde!");
		}else {
			System.out.println("Boa noite!");
		}

		sc.close();
	}
}
