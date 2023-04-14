package br.edu.principal; 
import java.util.Scanner; 
  
public class principal { 
  
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
double num1=0;

System.out.print("Digite o número: ");
num1 = sc.nextDouble();

if(num1 % 2 == 0){
System.out.println("É par !");
}

else{
System.out.println("É impar!");}
}
}
