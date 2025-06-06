import java.util.ArrayList;
import java.util.Scanner;

public class Crime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> perguntas = new ArrayList<>();
        perguntas.add("Telefonou para a vítima?");
        perguntas.add("Esteve no local do crime?");
        perguntas.add("Mora perto da vítima?");
        perguntas.add("Devia para a vítima?");
        perguntas.add("Já trabalhou com a vítima?");

        int respostasSim = 0;

        for (String pergunta : perguntas) {
            System.out.print(pergunta + " (sim/não): ");
            String resposta = sc.nextLine().trim().toLowerCase();
            if (resposta.equals("sim")) {
                respostasSim++;
            }
        }

        System.out.println("\nClassificação:");

        if (respostasSim == 2) {
            System.out.println("Suspeita");
        } else if (respostasSim >= 3 && respostasSim <= 4) {
            System.out.println("Cúmplice");
        } else if (respostasSim == 5) {
            System.out.println("Assassino");
        } else {
            System.out.println("Inocente");
        }
    }
}
