package br.edu.principal;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println("=====================");
		System.out.println("Verificador de senhas");
		System.out.println("=====================\n");

		int senha = 0;
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Digite a sua senha, que deve conter uma sequência numérica inteira: ");
		senha = sc.nextInt();
		
		if (senha == 4531) {
			System.out.println("A senha está CORRETA! Passagem autorizada!");
		}else {
			  System.out.println("A senha está INCORRETA! Passagem não autorizada!");
			  System.out.println(" ");
		
			}
			
		}
		
		
	}


