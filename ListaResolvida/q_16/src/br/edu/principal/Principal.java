package br.edu.principal; 
 import java.util.Scanner; 
  
public class Principal { 

public static void main(String[] args) { 
Scanner sc = new Scanner(System.in);
double pre=0,venda,newpre=0;

System.out.print("Digite o pre�o atual do produto :  ");
pre = sc.nextDouble();

System.out.print("Digite a quantidade de venda mensal do produto:  ");
venda = sc.nextDouble();

if(venda < 500 || pre<30) {
newpre = pre+(pre*0.10);   
System.out.println("O valor do pre�o sofreu aumento de 10%, e ficou de: "+newpre);
  }
    
if((venda >= 500 && venda < 1200 || pre >=30 && pre < 80)) {
newpre = pre+(pre*0.15);
System.out.println("O valor do pre�o sofreu aumento de 15%, e ficou de: "+newpre);
}
    
if(venda > 1200 || pre>=80){
newpre = pre-(pre*0.15);
System.out.println("O valor do pre�o sofreu uma diminui��o de 20%, e ficou de: "+newpre);
   
 }
}
}
