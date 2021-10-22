package Registro;

import javax.swing.JOptionPane;

public class Aluno {

public class alunos {
		private String nomeAluno;
		private String emailAluno;
		private String totalDeRendimentoAluno;
		private float totalDeRendimento;
		private int numeroDeAlunos;
		private float rendimentoDoAluno;


		public alunos(String nome, String email, String rendimentos) {
			this.nomeAluno = nome;
			this.emailAluno = email;
			this.totalDeRendimentoAluno = rendimentos;		
		public Aluno(String nomeAluno, String emailAluno, float totalDeRendimentos) {
			this.nomeAluno = nomeAluno;
			this.emailAluno = emailAluno;
			this.totalDeRendimento = totalDeRendimentos;		
			}

		public String getRendimentos() {
			return totalDeRendimentoAluno;

		public String getNomeAluno() {
			return nomeAluno;
		}

		public String getEmailAluno() {
			return emailAluno;
		}

		public float getTotalDeRendimentoAluno() {
			return getTotalDeRendimentoAluno();
		}
		public String mostrar() {
			String resposta = "Aluno:\n"
							+ "------\n"
							+ "Nome: " + nomeAluno + "\n"
							+ "Email: " + emailAluno + "\n"
							+ "Rendimentos mensais: " + totalDeRendimentoAluno + "\n";
			return resposta;

		public int getNumeroDeAlunos() {
			return numeroDeAlunos;
		}

		public void CadastrarAluno() {
			Aluno [] alunos = new Aluno [0];
			nomeAluno = JOptionPane.showInputDialog("Informe o nome do aluno");
			emailAluno = JOptionPane.showInputDialog("Informe o e-mail do aluno");
			rendimentoDoAluno = Float.parseFloat(JOptionPane.showInputDialog("Informe o rendimento do aluno"));
			totalDeRendimento = rendimentoDoAluno + totalDeRendimento;
			numeroDeAlunos = numeroDeAlunos+1;
			Aluno a = new Aluno(nomeAluno,emailAluno, totalDeRendimento);

			Aluno [] tempP = new Aluno [alunos.length+1];
			for (int i=0; i<alunos.length; i++) {
				tempP [i] = alunos[i];
			}

			tempP[alunos.length] = a;

			alunos = tempP
