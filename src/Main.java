import java.awt.desktop.SystemEventListener;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Qual o nome do aluno?");
        String nome = leitor.nextLine();
        System.out.println("Qual a idade:");
        int idade = leitor.nextInt();
        System.out.println("Digite a primeira nota:");
        double nota1 = leitor.nextDouble();
        System.out.println("Digite a segunda nota:");
        double nota2 = leitor.nextDouble();
        leitor.nextLine();

        Aluno aluno1 = new Aluno();
        aluno1.setNome(nome);
        aluno1.setIdade(idade);
        aluno1.adicionarNota(nota1);
        aluno1.adicionarNota(nota2);

        System.out.println("Qual o nome do segundo aluno?");
        String nome2 = leitor.nextLine();
        System.out.println("Qual a idade:");
        int idade2 = leitor.nextInt();
        System.out.println("Qual a primeira nota:");
        double notaaluno2 = leitor.nextDouble();
        System.out.println("Qual a segunda nota:");
        double segundanota = leitor.nextDouble();

        Aluno aluno2 = new Aluno();
        aluno2.setNome(nome2);
        aluno2.setIdade(idade2);
        aluno2.adicionarNota(notaaluno2);
        aluno2.adicionarNota(segundanota);

        ArrayList<Aluno> alunos = new ArrayList<>();
        alunos.add(aluno1);
        alunos.add(aluno2);

        System.out.println("Meu nome é: " + aluno1.getNome() + " e tenho " + aluno1.getIdade() + " anos");
        System.out.println("Notas: " + aluno1.getNotas());

        System.out.println("Meu nome é: " + aluno2.getNome() + " e tenho " + aluno2.getIdade() + " anos");
        System.out.println("Notas: " + aluno2.getNotas());

        System.out.println("Tamanho da lista: " + alunos.size());

        for (int i = 0; i < alunos.size(); i++) {
            alunos.get(i).apresentar();
            System.out.println("Média " + alunos.get(i).calcularMedia());
            if (alunos.get(i).calcularMedia() >= 6) {
                System.out.println("Aprovado");
            } else {
                System.out.println("Reprovado");
            }
        }
    }
}