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
	public String totalDeRendimento;
	public float totalR;
	public float numeroDeAlunos;
	public float rendimentoDoAluno;

	List<alunos> aluno;

	public alunos(String nomeAluno, String emailAluno, String totalDeRendimentos) {
		this.nomeAluno = nomeAluno;
		this.emailAluno = emailAluno;
		this.totalDeRendimento = totalDeRendimentos;
		this.numeroDeAlunos = 0;
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

	public float getNumeroDeAlunos() {
		return numeroDeAlunos;
	}

	public float getRendimentoDoAluno() {
		return rendimentoDoAluno;
	}
	public float gettoralR() {
		return totalR;
	}

	public void cadastrarAluno() {
		nomeAluno = JOptionPane.showInputDialog("Informe o nome do aluno");
		emailAluno = JOptionPane.showInputDialog("Informe o email do aluno");
		String totalDeRendimento = JOptionPane.showInputDialog("Informe o total de rendimento do aluno");
		float rendimentoDoAluno = Float.parseFloat(totalDeRendimento);
		totalR= rendimentoDoAluno + totalR;
		numeroDeAlunos = numeroDeAlunos + 1;
		
		alunos a = new alunos(nomeAluno, emailAluno, totalDeRendimento);

		aluno.add(a);
		System.out.println(numeroDeAlunos);
		System.out.println(totalR);

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