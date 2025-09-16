package curso_programacao;
import java.util.Scanner;

public class Aula_26 {
	
	public static void main(String[] args) {
		//Isso cria um objeto sc, que é o scanner
		
		Scanner sc = new Scanner(System.in);
		/*
		String x;
		x = sc.next();//Pega a próxima coisa escrita no console
		
		System.out.println("Você digitou: " + x);
		
		int y;
		y = sc.nextInt();
		
		System.out.println("Você digitou o número: " + y);
		
		double z;
		z = sc.nextDouble();
		
		System.out.println("Você digitou o número: " + z);
		
		char a;
		a = sc.next().charAt(0);
		
		System.out.println("Você digitou: " + a);
		*/
		
		String x;
		int y;
		double z;
		x = sc.next();
		y = sc.nextInt();
		z = sc.nextDouble();
		
		System.out.println("Dados Digitados");
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);

		
		sc.close();
	}
}
