package javaParte_I.laboratorios;

import java.util.Scanner;

/*
 * A � Verificando se um n�mero � primo
Vamos criar um programa que verifica se um n�mero � primo. 
Lembre-se de que um n�mero primo s� � divis�vel por 1 e por ele mesmo.
1. Crie uma classe e insira a estrutura b�sica de um programa Java;
2. Declare uma vari�vel chamada numero, que receber� o valor a ser verificado 
se � primo ou n�o;
3. Implemente uma l�gica onde ser� contado o n�mero de divisores do n�mero 
informado;
4. Ao final da contagem, se o n�mero de divisores encontrados for superior a 
dois, o n�mero informado n�o � primo. Caso contr�rio, � primo;
*/

public class Laboratorio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		System.out.println("Favor digitar um numero");
		int numero = sc.nextInt();
		int contador=1;
		for(int i=2;i<=numero;i++) {
			
			if(numero%i==0) {
				contador++;	
			}
			
		}
		
		if(contador<=2) {
			System.out.println(" "+numero+"� numero primo");
		}
		
	}

}
