package br.edu.principal; 
import java.util.Scanner; 
  
public class Principal { 
  
     public static void main(String[] args) {
    	 
    	 System.out.print("*************************************");
    	 System.out.print("Verifique se um número é ímpar ou par");
    	 System.out.print("*************************************\n");


    	 
    	 Scanner sc = new Scanner(System.in);
    	 int num1=0;

    	 System.out.print("Digite o número: ");
    	 num1 = sc.nextInt();

    	 if(num1 % 2 == 0){
    		 System.out.println("É par! \n");
    	 }

    	 else{
    		 System.out.println("É impar! \n");}
}
}
