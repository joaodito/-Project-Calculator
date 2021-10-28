package Registro;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import javax.swing.JOptionPane;

public class Categoria {
	private String descricao;
	private String categoria;
	private String totlDeDespesa;
	List<Categoria> categorias;
	String mes;
	int ano;
	String nomeCategoria = "categorias" + "_" + mes + "_" + ano + ".txt";

	protected String subCategoria;

	public Categoria(String descricao, String categoria, String totalDeDespesa) {
		this.descricao = descricao;
		this.categoria = categoria;
		this.totlDeDespesa = totalDeDespesa;
	}

	public Categoria() {
		categorias = new LinkedList<Categoria>();
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getMes() {
		return mes;
	}

	public void setMes(String mes) {
		this.mes = mes;
	}

	public String getNomeCategoria() {
		return nomeCategoria;
	}

	public void setNomeCategoria(String nomeCategoria) {
		this.nomeCategoria = nomeCategoria;
	}

	public String getSubCategoria() {
		return subCategoria;
	}

	public void setSubCategoria(String subCategoria) {
		this.subCategoria = subCategoria;
	}

	public String getTotlDeDespesa() {
		return totlDeDespesa;
	}

	public void setTotlDeDespesa(String totlDeDespesa) {
		this.totlDeDespesa = totlDeDespesa;
	}

	public String getNomeSubCategoria() {
		return subCategoria;
	}

	public void cadastrarCategoria() {
		Categoria[] categorias = new Categoria[0];
		subCategoria = JOptionPane.showInputDialog("Informe o nome da subcategoria");

		Categoria cc = new Categoria();

		Categoria[] tempC = new Categoria[categorias.length + 1];
		for (int i = 0; i < categorias.length; i++) {
			tempC[i] = categorias[i];
		}
		tempC[categorias.length] = cc;

		categorias = tempC;
	}

	public void gravarCategoria() {
		BufferedWriter buffer = null;
		FileWriter out = null;

		try {
			out = new FileWriter(nomeCategoria);
			buffer = new BufferedWriter(out);

			for (Categoria c : categorias) {
				buffer.write(c.toString());
				buffer.write('\n');
			}

			buffer.close();
		} catch (IOException e) {
			// TODO: handle exception
		}
	}

}
