package br.edu.principal;
import java.util.Scanner; 

public class Principal { 

     public static void main(String[] args) {
    	 
    	 System.out.println("********************************************************************");
    	 System.out.println("Salário de um funcionário acrescido de bonificação e auxílio-escola");
    	 System.out.print("********************************************************************\n");


    	 Scanner sc = new Scanner(System.in);
    	 double sal, novosal, boni = 0, aux = 0;

    	 System.out.println("Digite seu salário: ");
    	 sal = sc.nextDouble();

    	 if (sal <= 500) {
    		 boni = sal * 0.05;
    		 System.out.println("Bonificação de 5%: R$ " + boni);
    	 }
    	 else if (sal <= 1200) {
    		 boni = sal * 0.12;
    		 System.out.println("Bonificação de 12%: R$ " + boni);
    	 }

    	 if (sal <= 600) {
    		 aux = 150.0;
    		 System.out.println("Auxílio-escola de R$ 150,00");
    	 }
    	 else {
    		 aux = 100.0;
    		 System.out.println("Auxílio-escola de R$ 100,00");
    	 }

    	 novosal = sal + boni + aux;
    	 System.out.println("O novo salário é: R$ " + novosal);
     }
}

