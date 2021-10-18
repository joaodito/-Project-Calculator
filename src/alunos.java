
public class alunos {
		private String nomeAluno;
		private String emailAluno;
		private String totalDeRendimentoAluno;
		
			
		public alunos(String nome, String email, String rendimentos) {
			this.nomeAluno = nome;
			this.emailAluno = email;
			this.totalDeRendimentoAluno = rendimentos;		
			}

		public String getRendimentos() {
			return totalDeRendimentoAluno;
		}
		public String mostrar() {
			String resposta = "Aluno:\n"
							+ "------\n"
							+ "Nome: " + nomeAluno + "\n"
							+ "Email: " + emailAluno + "\n"
							+ "Rendimentos mensais: " + totalDeRendimentoAluno + "\n";
			return resposta;
		}
}
