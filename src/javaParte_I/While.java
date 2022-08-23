package javaParte_I;
/*Quando não sabemos quantas vezes um determinado bloco de instruções deve 
ser executado, utilizamos o laço de repetição while. Com ele, a execução das 
instruções vai continuar enquanto uma condição for verdadeira. Veja a sintaxe 
do laço de repetição while:*/

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("O numero que vc digitar irá pausar o Loop");
		int n = sc.nextInt();
		int a=0;
		
		//enquanto uma condição for verdadeira 
		while(n!=a) {
			System.out.println(a);
			a++;
		}

	}

}
