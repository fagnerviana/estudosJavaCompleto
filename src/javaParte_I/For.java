package javaParte_I;
/*Quando sabemos quantas vezes um bloco de instruções deverá ser executado,
 * utilizamos o laço de repetição for. 
 * Ele é composto pelo corpo do laço e pelas seguintes partes principais:
 * */

public class For {

	public static void main(String[] args) {
		
		for(int i=0;i<=9;i++) {
			
			System.out.println("Contando até: "+i);
		}
		
		//Utilizando o break
		for(int i=0;i<=9;i++) {
			
			if(i==6)
				break;
			System.out.println("Vai parar quando chegar no numero: "+i);
		}

	}

}
