package javaParte_I;

/*O la�o do/while tem basicamente o mesmo funcionamento de while. A 
diferen�a � que, aqui, as instru��es s�o executadas antes de a express�o ser 
avaliada. Assim, garante-se que o bloco de instru��es seja executado ao menos 
uma �nica vez. Isso acontecer� mesmo se a condi��o n�o for verdadeira.*/

public class DoWhile {

	public static void main(String[] args) {
		
		
		int num =15;
		int a=0;
		
		do {
			System.out.println("O valor do num �: "+a+" Vai parar quando chegar em "+num);
			a++;
		}while(num>=a);

	}

}
