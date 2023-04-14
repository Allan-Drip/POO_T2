package br.edu.principal; 
 import java.util.Scanner; 
  
public class Principal { 

public static void main(String[] args) { 
Scanner sc = new Scanner(System.in);
Double sal,novosal,boni=(double) 0;
int aux= 0;

System.out.print("Digite seu Salário: ");
sal = sc.nextDouble();


    if(sal <= 500){
boni = (sal*0.05)+sal;   
    }
    
  if(sal > 500 && sal <=1200){
boni = (sal*0.12)+sal;

}
    
    if(sal > 1200){
    boni = 0+sal;
   
 }

if (sal <= 600){
aux =  150;

}

if (sal > 600){
aux = 100;

}
novosal = boni + aux;
System.out.println("O novo salário é:"+novosal);
}
}
