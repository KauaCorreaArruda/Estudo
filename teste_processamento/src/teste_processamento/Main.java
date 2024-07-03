package teste_processamento;

public class Main {

	public static void main(String[] args) {
			
			int a, b;
			double result;
			
			a = 5;
			b = 2;
			
			result =(double)  a / b;
			
			/*Declarando as variáveis a e b como int, o resultado virá como o de uma divisão entre números inteiros, para que isso não ocorra, existe a prática do casting,
			que faz justamente a conversão dessas variáveis de int para double.*/
			
			System.out.println(result);
		
	}

}
