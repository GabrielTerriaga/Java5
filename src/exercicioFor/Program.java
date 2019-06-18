package exercicioFor;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um valor: ");
		int x = sc.nextInt();
		for (int i=1; i <=x; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
		
		
		
		sc.close();
	}

}
