import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        aluno1.setNome("Arthur");
        aluno1.setIdade(21);
        aluno1.adicionarNota(9.0);
        aluno1.adicionarNota(7.5);

        Aluno aluno2 = new Aluno();
        aluno2.setNome("João");
        aluno2.setIdade(20);
        aluno2.adicionarNota(4.0);
        aluno2.adicionarNota(7.5);

        ArrayList<Aluno> alunos = new ArrayList<>();
        alunos.add(aluno1);
        alunos.add(aluno2);

        System.out.println("Meu nome é: " + aluno1.getNome() + " e tenho " + aluno1.getIdade() + " anos");
        System.out.println("Notas: " + aluno1.getNotas());

        System.out.println("Meu nome é: " + aluno2.getNome() + " e tenho " + aluno2.getIdade() + " anos");
        System.out.println("Notas: " + aluno2.getNotas());

        System.out.println("Tamanho da lista: " + alunos.size());

    }
}