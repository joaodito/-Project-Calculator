package UI;

import javax.swing.JOptionPane;

import Registro.republica;

public class main {
	
	static republica repub = new republica();
	
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
			
			break;

		case 2:
			
			break;
		
		case 3:
			
			break;
			
		case 4:
			
			break;
			
		case 5:
			
			break;
			
		case 0:
			
			break;
		}
		}while (opcao != 0);
	}
}
