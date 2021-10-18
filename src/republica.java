import java.util.LinkedList;
import java.util.List;

import javax.swing.JOptionPane;


public class republica {
	private List<alunos> Alunos;
	
	public republica() {
		Alunos = new LinkedList<alunos>();
	}
	public void cadastrarAluno() {
		String nome = JOptionPane.showInputDialog("Informe o nome do aluno");
		String email = JOptionPane.showInputDialog("Informe o email do aluno");
		String rendimentos = JOptionPane.showInputDialog("Informe o total de rendimento do aluno");
		
		alunos a = new alunos(nome, email, rendimentos);
		
		Alunos.add(a);
		
		}
	}

