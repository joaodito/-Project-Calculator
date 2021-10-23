package Registro;

import javax.swing.JOptionPane;

public class alunos {

		private String nomeAluno;
		private String emailAluno;
		private String totalDeRendimento;
		private int numeroDeAlunos;
		private float rendimentoDoAluno;


		public alunos (String nomeAluno, String emailAluno, String totalDeRendimentos) {
			this.nomeAluno = nomeAluno;
			this.emailAluno = emailAluno;
			this.totalDeRendimento = totalDeRendimentos;		
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


	}