package javaParte_I.laboratorios;

import java.util.Scanner;

/* * A � Verificando quantos dias tem cada m�s
Vamos criar um programa que imprime na tela a quantidade de dias existentes 
no m�s, dada uma vari�vel que contenha o nome do m�s em quest�o.
1. Crie uma classe e insira a estrutura b�sica de um programa Java;
2. Declare uma vari�vel do tipo String e armazene o nome de um m�s de sua 
prefer�ncia, conforme o exemplo a seguir:
3. Utilize uma estrutura de decis�o m�ltipla switch, tendo a vari�vel mes como 
refer�ncia, e imprima, para o m�s escolhido, a frase: �O m�s escolhido tem 
XX dias�. Utilize strings iniciadas com mai�sculo ou min�sculo (padronize 
para evitar problemas!);
4. Acrescente um item default � estrutura switch com uma mensagem de erro 
que ser� impressa no console, caso algum m�s inexistente seja atribu�do � 
vari�vel mes;
5. Altere os nomes atribu�dos � vari�vel mes, compile e execute seu programa 
algumas vezes:
*/

public class Laboratorio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Favor digitar o nome do m�s");
		String mes = sc.nextLine().toLowerCase();
		String op="s";
		
		
		
			switch(mes) {
			case "janeiro" : System.out.println("O m�s escolhido de "+mes+" tem 31 dias");break;
			case "fevereiro" : System.out.println("O m�s escolhido de "+mes+" tem 28 dias");break;
			case "mar�o" : System.out.println("O m�s escolhido de "+mes+" tem 31 dias");break;
			case "abril" : System.out.println("O m�s escolhido de "+mes+" tem 30 dias");break;
			case "maio" : System.out.println("O m�s escolhido de "+mes+" tem 31 dias");break;
			case "junho" : System.out.println("O m�s escolhido de "+mes+" tem 30 dias");break;
			case "julho" : System.out.println("O m�s escolhido de "+mes+" tem 31 dias");break;
			case "agosto" : System.out.println("O m�s escolhido de "+mes+" tem 31 dias");break;
			case "setembro" : System.out.println("O m�s escolhido de "+mes+" tem 30 dias");break;
			case "outubro" : System.out.println("O m�s escolhido de "+mes+" tem 31 dias");break;
			case "novembro" : System.out.println("O m�s escolhido de "+mes+" tem 30 dias");break;
			case "dezembro" : System.out.println("O m�s escolhido de "+mes+" tem 31 dias");break;
			
			default: System.out.println("Favor digitar o m�s correto");
			
			
			}
		}
}
