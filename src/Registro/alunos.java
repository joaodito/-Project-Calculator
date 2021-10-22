package Registro;

public class aluno {
		private String nomeAluno;
		private String emailAluno;
		private String totalDeRendimentoAluno;


		public aluno(String nome, String email, String rendimentos) {
			this.nomeAluno = nome;
			this.emailAluno = email;
			this.totalDeRendimentoAluno = rendimentos;		
			}

		public String getRendimentos() {
			return totalDeRendimentoAluno;
		}
		public String mostrar() {
			String resposta = "Aluno:\n"
	@@ -21,5 +44,25 @@ public String mostrar() {
							+ "Email: " + emailAluno + "\n"
							+ "Rendimentos mensais: " + totalDeRendimentoAluno + "\n";
			return resposta;
		}
}

