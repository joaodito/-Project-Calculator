package excecoes;

public class ExcecaoValor extends RuntimeException{

	public ExcecaoValor () {
		super();
	}
	
	public ExcecaoValor (String msg) {
		super(msg);
	}	
	
}
