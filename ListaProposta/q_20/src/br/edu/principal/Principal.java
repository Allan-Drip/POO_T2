package br.edu.principal;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println("---------------------------------------------------");
		System.out.println("Categoria de um(a) nadador(a) com base em sua idade");
		System.out.println("---------------------------------------------------\n");
		
		int idade = 0;
		String categoria;
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Digite a idade do(a) nadador(a): ");
		idade = sc.nextInt();
		System.out.println(" ");
		
		if ((idade >= 5) & (idade <= 7)) {
			System.out.println("O(a) nadador(a) está encaixado(a) na categoria INFANTIL! ");

		}
		if ((idade >= 8) & (idade <= 10)) {
			System.out.println("O(a) nadador(a) está encaixado(a) na categoria JUVENIL! ");
		}
		if ((idade >= 11) & (idade <= 15)) {
			System.out.println("O(a) nadador(a) está encaixado(a) na categoria ADOLESCENTE! ");
		}
		if ((idade >= 16) & (idade <= 30)) {
			System.out.println("O(a) nadador(a) está encaixado(a) na categoria ADULTO! ");
		}
		if (idade > 30) {
			System.out.println("O(a) nadador(a) está encaixado(a) na categoria SÊNIOR! ");
		}

	}

}
