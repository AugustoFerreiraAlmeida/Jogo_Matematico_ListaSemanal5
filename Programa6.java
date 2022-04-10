import java.util.Scanner;

public class Programa6 {

	public static void main(String[] args) {
	
		Scanner ler = new Scanner(System.in);
		
		int respostasCertas = 0;
		
		int respostasErradas = 0;
		
		System.out.println("VAMOS INICIAR O JOGO!!!");
		
		for(;respostasErradas < 3;) {
		
			JogoMatematico jogar = new JogoMatematico();
			
			jogar.sortearCalculo();
			
			System.out.println(jogar.getCalculo());
			
			int resposta = ler.nextInt();
			
			if(jogar.checarResposta(resposta)== true) {
			
				respostasCertas += 1;
			}
			
			else {
			
				respostasErradas += 1;	
			}	
			
		}
		
		System.out.println("FIM DE JOGO!!!");
		
		System.out.println("Você acertou: "+ respostasCertas);
		
	}
	
}