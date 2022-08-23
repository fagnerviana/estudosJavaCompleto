package javaParte_I;

import java.util.Scanner;

/*A – Somando dois valores e mostrando o resultado
1. Crie uma classe e insira a estrutura básica de um programa Java;
2. Declare três variáveis do tipo int com os nomes valor1, valor2 e resultado;
3. Atribua valores para as variáveis valor1 e valor2;
4. Atribua o resultado da soma das variáveis valor1 e valor2 na variável 
resultado;
5. Imprima o resultado na tela;
6. Compile e execute o programa.
O resultado deve ser como o exibido a seguir*/
public class Laboratorio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int valor;
		System.out.println("Favor digitar um numero");
		valor = sc.nextInt();
		
		System.out.println(valor%2 == 0? "Par" : "Impar");
	}

}
