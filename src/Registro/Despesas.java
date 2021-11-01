package Registro;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.YearMonth;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JOptionPane;

public class Despesas extends Categoria{
	int ano = YearMonth.now().getYear();
	int mes = YearMonth.now().getMonthValue();
	private String descricao;
	private String categoria;
	private String totalDeDespesa;
	public float despesafinal;
	String nomeArquivo = "despesas" + "_" + mes + "_" + ano + ".txt";
	List<Despesas> despesas;

	public Despesas(String descricao, String categoria, String totalDeDespesa) {
		this.descricao = descricao;
		this.categoria = categoria;
		this.totalDeDespesa = totalDeDespesa;

	}

	public Despesas() {
		despesas = new LinkedList<Despesas>();
	}
	public float getDespesafinal() {
		return despesafinal;
	}
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
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

	public void cadastrarDespesa() {

		String descricao = JOptionPane.showInputDialog("Informe a descrição da despesa");
		String categoria = JOptionPane.showInputDialog("Informe uma categoria"+"\n"+"CATEGORIAS: "+ListaCategoria+"\n"+"SUBCATEGORIAS: "+ListaSubCategoria);
		String totalDeDespesa = JOptionPane.showInputDialog("Informe o total da despesa");
		float despesaF = Float.parseFloat(totalDeDespesa);
		despesafinal = despesafinal + despesaF;
		Despesas b = new Despesas(descricao, categoria, totalDeDespesa);
		despesas.add(b);
	}

	public String toString() {
		return descricao + "," + categoria + "," + totalDeDespesa;

	}

	public void gravarDespesas() {
		BufferedWriter buffer = null;
		FileWriter out = null;

		try {
			out = new FileWriter(nomeArquivo);
			buffer = new BufferedWriter(out);

			for (Despesas d : despesas) {
				buffer.write(d.toString());
				buffer.write('\n');
			}

			buffer.close();
		} catch (IOException e) {
			// TODO: handle exception
		}
	}

	public String mostrar() {
		String resposta = "Despesa:\n" + "------\n" + "Descrição: " + descricao + "\n" + "Categoria: " + categoria
				+ "\n" + "Total de despesas: " + totalDeDespesa + "\n";
		return resposta;
	}

}
