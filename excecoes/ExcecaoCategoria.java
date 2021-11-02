package excecoes;

public class ExcecaoCategoria extends RuntimeException{

	public ExcecaoCategoria () {
		super();
	}
	
	public ExcecaoCategoria (String msg) {
		super(msg);
	}	
	
}
