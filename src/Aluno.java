import java.util.ArrayList;

public class Aluno {
    private String nome;
    private int idade;
    private ArrayList<Double> notas = new ArrayList<>();

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
}