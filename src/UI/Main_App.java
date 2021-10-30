package UI;

import java.io.FileNotFoundException;
import java.io.IOException;

import javax.naming.spi.DirStateFactory.Result;
import javax.swing.JOptionPane;

import Registro.republica;
import Registro.alunos;
import Registro.CalculoIgualitario;
import Registro.CalculoProporcional;
import Registro.Categoria;
import Registro.Despesas;

public class Main_App {

	static republica republica = new republica();
	static Despesas despesa = new Despesas();
	static Categoria categoria = new Categoria();
	static alunos alunos = new alunos();
	public static float jaRodou = 0 ;

	public static void main(String[] args) throws IOException {
		int opcao;
		
		do {
			
			String menu = "Informe a op��o desejada: \n" + "1 - Cadastrar aluno \n" + "2 - Cadastrar despesa \n"
					+ "3 - Cadastrar categoria \n" + "4 - C�lculo proporcional \n" + "5 - C�lculo igualit�rio \n"

					+ "0 - Sair do programa \n";
			String strOpcao = JOptionPane.showInputDialog(menu);
			opcao = Integer.parseInt(strOpcao);
			

			switch (opcao) {
			case 1:
				alunos.cadastrarAluno();
				alunos.salvarAlunos();
				//CalculoProporcional.buscarAlunos();
				break;

			case 2:
				despesa.cadastrarDespesa();
				despesa.gravarDespesas();
				break;

			case 3:
				categoria.cadastrarCategoria();
				break;

			case 4:
				CalculoProporcional calculoProporcional =new CalculoProporcional(alunos.gettoralR(),despesa.despesafinal);
				CalculoProporcional.buscarAlunos();
				CalculoProporcional.calculoProporcionalfinal();
			break;

			case 5:
			CalculoIgualitario CalculoIgualitario = new CalculoIgualitario(alunos.getNumeroDeAlunos(),despesa.getDespesafinal());
			JOptionPane.showMessageDialog(null,"O Valor a ser pago de cada aluno é: " + CalculoIgualitario.CalculoIgualitarioFinal());
				break;

			case 0:

				break;

			default:

				JOptionPane.showMessageDialog(null, "Opcao Invalida!");
				break;
			}
		} while (opcao != 0);
	}
}
