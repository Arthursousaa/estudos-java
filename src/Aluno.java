import java.util.ArrayList;

public class Aluno {
    private String nome;
    private int idade;
    private ArrayList<Double> notas = new ArrayList<>();
    double soma = (0);

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

    public ArrayList<Double> getNotas() {
        return notas;
    }

    public void adicionarNota(double nota) {
        notas.add(nota);
    }

    void apresentar() {
        System.out.println("Olá, meu nome é " + nome + " e tenho " + idade + " anos." + " e minha nota é: " + notas);

    }
        public double calcularMedia() {
            double soma = 0;
            for (int i = 0; i < notas.size(); i++) {
                soma = soma + notas.get(i);
            }
            double media = soma / notas.size();
            return media;

    }
}