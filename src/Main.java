import java.util.HashMap;
public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> notas = new HashMap<>();
        notas.put("Arthur", 9);
        notas.put("Fernando", 10);
        notas.put("José", 5);

        for (String chave : notas.keySet()){
            System.out.println(chave + ": " + notas.get(chave));
        }
            System.out.println("A nota é: " + notas.get("Arthur"));

    }
}





