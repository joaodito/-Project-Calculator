package UI;

import javax.swing.JOptionPane;

import Registro.republica;
import Registro.alunos;
import Registro.Categoria;
import Registro.Despesas;

public class Main_App{
	
	static republica republica = new republica();
	static Despesas despesa = new Despesas();
	static Categoria categoria = new Categoria();
	static alunos alunos = new alunos();
	
	public static void main(String[] args) {
		int opcao;
		do {
			String menu = "Informe a op��o desejada: \n"
						+ "1 - Cadastrar aluno \n"
						+ "2 - Cadastrar despesa \n"
						+ "3 - Cadastrar categoria \n"
						+ "4 - C�lculo proporcional \n"
						+ "5 - C�lculo igualit�rio \n"
					
						+ "0 - Sair do programa \n";
		String strOpcao = JOptionPane.showInputDialog(menu);
		opcao = Integer.parseInt(strOpcao);
		
		switch (opcao) {
		case 1:
			alunos.cadastrarAluno();
			alunos.salvarAlunos();
			break;

		case 2:
			republica.cadastrarDespesa();
			break;
		
		case 3:
			categoria.cadastrarCategoria();
			break;
			
		case 4:
			
			break;
			
		case 5:
			
			break;
			
		case 0:
			
			break;
		
		default:
				
			JOptionPane.showMessageDialog(null, "Opc�o Inv�lida!");
			break;	
		}
		}while (opcao != 0);
	}
}
