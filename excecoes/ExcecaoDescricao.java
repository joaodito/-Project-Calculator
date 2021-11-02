package excecoes;

public class ExcecaoDescricao extends RuntimeException{

	public ExcecaoDescricao () {
		super();
	}
	
	public ExcecaoDescricao (String msg) {
		super(msg);
	}	
	
}
