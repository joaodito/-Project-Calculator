package Registro;
public class Despesas {
	private String nome;
	private String categoria;
	private String totalDeDespesa;
	
	
	public Despesas(String nome, String categoria, String totalDeDespesa) {
		this.nome = nome;
		this.categoria = categoria;
		this.totalDeDespesa = totalDeDespesa;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCategoria() {
		return categoria;
	}


	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}


	public String getTotalDeDespesa() {
		return totalDeDespesa;
	}


	public void setTotalDeDespesa(String totalDeDespesa) {
		this.totalDeDespesa = totalDeDespesa;
	}
	
	
	public String mostrar() {
		String resposta = "Despesa:\n"
						+ "------\n"
						+ "Nome: " + nome + "\n"
						+ "Categoria: " + categoria + "\n"
						+ "Total de despesas: " + totalDeDespesa + "\n";
		return resposta;
	}
	
}
