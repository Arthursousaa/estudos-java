public class Aluno {
        public String nome;
        private int idade;
        double valor;

        // "Getter" - pra LER o valor
        public String getNome() {
                return nome;
        }

        public void setNome(String nome) {
                this.nome = nome;
        }

        public int getIdade() {
                return idade;
        }

        public void setIdade(int idade) {
                this.idade = idade;
        }

        void apresentar() {
                System.out.println("Olá meu nome é " + nome + " e tenho " + idade  + " anos.");
        }


}

