package javaParte_I;
/*Quando n�o sabemos quantas vezes um determinado bloco de instru��es deve 
ser executado, utilizamos o la�o de repeti��o while. Com ele, a execu��o das 
instru��es vai continuar enquanto uma condi��o for verdadeira. Veja a sintaxe 
do la�o de repeti��o while:*/

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("O numero que vc digitar ir� pausar o Loop");
		int n = sc.nextInt();
		int a=0;
		
		//enquanto uma condi��o for verdadeira 
		while(n!=a) {
			System.out.println(a);
			a++;
		}

	}

}
