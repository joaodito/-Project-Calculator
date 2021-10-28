package Registro;

import javax.swing.JOptionPane;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class alunos {

	private String nomeAluno;
	private String emailAluno;
	private String totalDeRendimento;
	private int numeroDeAlunos;
	private float rendimentoDoAluno;
	List<alunos> aluno;

	public alunos(String nomeAluno, String emailAluno, String totalDeRendimentos) {
		this.nomeAluno = nomeAluno;
		this.emailAluno = emailAluno;
		this.totalDeRendimento = totalDeRendimentos;
	}

	public alunos() {
		aluno = new LinkedList<alunos>();
	}

	public String getNomeAluno() {
		return nomeAluno;
	}

	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}

	public String getEmailAluno() {
		return emailAluno;
	}

	public void setEmailAluno(String emailAluno) {
		this.emailAluno = emailAluno;
	}

	public String getTotalDeRendimento() {
		return totalDeRendimento;
	}

	public void setTotalDeRendimento(String totalDeRendimento) {
		this.totalDeRendimento = totalDeRendimento;
	}

	public int getNumeroDeAlunos() {
		return numeroDeAlunos;
	}

	public void setNumeroDeAlunos(int numeroDeAlunos) {
		this.numeroDeAlunos = numeroDeAlunos;
	}

	public float getRendimentoDoAluno() {
		return rendimentoDoAluno;
	}

	public void setRendimentoDoAluno(float rendimentoDoAluno) {
		this.rendimentoDoAluno = rendimentoDoAluno;
	}

	public void cadastrarAluno() {
		nomeAluno = JOptionPane.showInputDialog("Informe o nome do aluno");
		emailAluno = JOptionPane.showInputDialog("Informe o email do aluno");
		totalDeRendimento = JOptionPane.showInputDialog("Informe o total de rendimento do aluno");

		alunos a = new alunos(nomeAluno, emailAluno, totalDeRendimento);

		aluno.add(a);

	}

	public String toString() {
		return "" + nomeAluno + "," + emailAluno + "," + totalDeRendimento;
	}

	public void salvarAlunos() {
		BufferedWriter buffer = null;
		FileWriter out = null;

		try {
			out = new FileWriter("alunos.txt");
			buffer = new BufferedWriter(out);

			for (alunos a : aluno) {
				buffer.write(a.toString());
				buffer.write('\n');
			}
			buffer.close();
		} catch (IOException e) {

		}
	}

}