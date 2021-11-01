package Registro;


import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Categoria {
	static ArrayList<String> ListaCategoria = new ArrayList<>();
	static ArrayList<String> ListaSubCategoria = new ArrayList<>();
	private String categorias;
	
public Categoria(String categorias){
	this.categorias = categorias;
}
	public Categoria() {
}
	public static void cadastrarCategoria(){
		int confirm;
		String teste = JOptionPane.showInputDialog("Cadastro: \n1 para categoria ou 2 para subcategoria");
		confirm= Integer.parseInt(teste);
		if(confirm == 1){
		String categorias = JOptionPane.showInputDialog("Informe a categoria");
		ListaCategoria.add(categorias);
		}
		else {
		String subcategorias = JOptionPane.showInputDialog("Informe a subcategoria");
		ListaSubCategoria.add(subcategorias);
		}
	}
}
