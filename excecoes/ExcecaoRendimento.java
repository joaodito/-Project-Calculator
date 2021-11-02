package excecoes;

public class ExcecaoRendimento extends RuntimeException{

	public ExcecaoRendimento () {
		super();
	}
	
	public ExcecaoRendimento (String msg) {
		super(msg);
	}	
	
}
