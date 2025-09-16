package curso_programacao;
import java.util.Scanner;

public class Exercícios_30 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//Exercício 1
		int a, b, soma;
		a = sc.nextInt();
		b = sc.nextInt();
		soma = a + b;
		
		System.out.println("SOMA = " + soma);
		
		//Exercício 2
		double area, raio;
		raio = sc.nextDouble();
		area = 3.14159 * Math.pow(raio, 2.0);
		
		System.out.printf("Área = %.4f", area);
		
		sc.close();
	}
}
