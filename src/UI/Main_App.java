package UI;

import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

import Registro.republica;
import Registro.alunos;
import Registro.CalculoIgualitario;
import Registro.CalculoProporcional;
import Registro.Categoria;
import Registro.Despesas;

public class Main_App {
	public UIManager ui ;
	static republica republica = new republica();
	static Despesas despesa = new Despesas();
	static Categoria categoria = new Categoria();
	static alunos alunos = new alunos();

	public static void main(String[] args) throws IOException {
		
		
		int opcao;
		JOptionPane.showMessageDialog(null,"BEM VINDO!! AO ADMINISTRADOR DE GASTOS\n"
		+"Como Utilizar:\n1-Cadastre os Alunos\n"
		+"2-Cadastre a Categoria ou Subcategoria \n3-Cadastre As Despesas\n4-Escolha o Metodo a ser Ultilizado para a Divisão de Gastos");
		do {
			
			String menu = "Informe a opcao desejada: \n" + "1 - Cadastrar aluno \n" + "2 - Cadastrar despesa \n"
					+ "3 - Cadastrar categoria \n" + "4 - Calculo proporcional \n" + "5 - Calculo igualitario \n"

					+ "0 - Sair do programa \n";
			String strOpcao = JOptionPane.showInputDialog(menu);
			opcao = Integer.parseInt(strOpcao);
			

			switch (opcao) {
			case 1:
				alunos.cadastrarAluno();
				alunos.salvarAlunos();
				break;

			case 2:
				despesa.cadastrarDespesa();
				despesa.gravarDespesas();
				break;

			case 3:
				Categoria.cadastrarCategoria();
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
