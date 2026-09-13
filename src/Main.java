public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        aluno1.setNome("Arthur");
        aluno1.setIdade(21);
        aluno1.adicionarNota(9.0);
        aluno1.adicionarNota(7.5);

        System.out.println("Meu nome é: " + aluno1.getNome() + " e tenho " + aluno1.getIdade() + " anos");
        System.out.println("Notas: " + aluno1.getNotas());
    }
}