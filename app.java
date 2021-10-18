
public class App {
    public abstract class Alunos {

        private String nomeAluno;
        private String emailAluno;
        private int totalDeRendimentoAluno;
        private int quantidadeDePessoas;

        public int getQuantidadeDePessoas() {
            return quantidadeDePessoas;
        }

        public int getTotalDeRendimentoAluno() {
            return totalDeRendimentoAluno;
        }

        public String getEmailAluno() {
            return emailAluno;
        }

        public String getNomeAluno() {
            return nomeAluno;
        }

        public int setQuantidadeDePessoas(int quantidadeDePessoas) {
            return this.quantidadeDePessoas = quantidadeDePessoas;
        }

        public int setTotalDeRendimentoAluno(int totalDeRendimentoAluno) {
            return this.totalDeRendimentoAluno = totalDeRendimentoAluno;
        }

        public String setEmailAluno() {
            return this.emailAluno = emailAluno;
        }

        public String setNomeAluno() {
            return this.nomeAluno = nomeAluno;
        }

    }

    public static void main(String[] args){
        Alunos alunos = new alunos();
        alunos.setEmailAluno();
        alunos.setNomeAluno();
        alunos.setQuantidadeDePessoas(quantidadeDePessoas);
        alunos.setTotalDeRendimentoAluno(totalDeRendimentoAluno);

    }

}
