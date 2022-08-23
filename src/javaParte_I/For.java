package javaParte_I;
/*Quando sabemos quantas vezes um bloco de instru��es dever� ser executado,
 * utilizamos o la�o de repeti��o for. 
 * Ele � composto pelo corpo do la�o e pelas seguintes partes principais:
 * */

public class For {

	public static void main(String[] args) {
		
		for(int i=0;i<=9;i++) {
			
			System.out.println("Contando at�: "+i);
		}
		
		//Utilizando o break
		for(int i=0;i<=9;i++) {
			
			if(i==6)
				break;
			System.out.println("Vai parar quando chegar no numero: "+i);
		}

	}

}
