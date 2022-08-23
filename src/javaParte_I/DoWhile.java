package javaParte_I;

/*O laço do/while tem basicamente o mesmo funcionamento de while. A 
diferença é que, aqui, as instruções são executadas antes de a expressão ser 
avaliada. Assim, garante-se que o bloco de instruções seja executado ao menos 
uma única vez. Isso acontecerá mesmo se a condição não for verdadeira.*/

public class DoWhile {

	public static void main(String[] args) {
		
		
		int num =15;
		int a=0;
		
		do {
			System.out.println("O valor do num é: "+a+" Vai parar quando chegar em "+num);
			a++;
		}while(num>=a);

	}

}
