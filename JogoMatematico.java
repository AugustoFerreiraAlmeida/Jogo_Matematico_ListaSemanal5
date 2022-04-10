public class JogoMatematico {
	
	private String calculo;
	
	private int resposta;
	
	public String getCalculo() {
		
		return calculo;
		
	}
	
	public int getResposta() {
		
		return resposta;
	}

	public void sortearCalculo(){
		
		String[] operacoes = new String[4];
		operacoes[0] = "soma";
		operacoes[1] = "subt";
		operacoes[2] = "mult";
		operacoes[3] = "divi";
		
		int sortearOperacao = (int) (Math.random()*4);
		
		String operacao = operacoes[sortearOperacao];
		
		int num1 = (int) (Math.random()*101);
		
		int num2 = (int) (Math.random()*101);
		
		String numUmString = String.valueOf(num1);
		String numDoisString = String.valueOf(num2);
		
		if(operacao.equals("soma")) {
			
			calculo = (String) ("Qual é a resposta de: " + numUmString + " + " + numDoisString + " = ");
			resposta = num1 + num2;
		}
		
		else if(operacao.equals("subt")) {
			
			calculo = (String) ("Qual é a resposta de: " + numUmString + " - " + numDoisString + " = ");
			resposta = num1 - num2;
		}
	
		else if(operacao.equals("mult")) {
			
			calculo = (String)("Qual é a resposta de: " + numUmString + " * " + numDoisString + " = ");
			resposta = num1 * num2;
		}
		
		else {
			
			calculo = (String)("Qual é a resposta de: " + numUmString + " / " + numDoisString + " = ");
			resposta = num1 / num2;
		}
	}
	
	public boolean checarResposta(int respostaPassada) {
		
		if (getResposta() == respostaPassada) {
			
			return true;
		}
		
		else {
		
			return false;
			
		}
		
	}
	
}