import java.util.ArrayList;
import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> notas = new ArrayList<>();

        System.out.println("Digite as notas (digite -1 para encerrar):");
        while (true) {
            double nota = sc.nextDouble();
            if (nota == -1)
                break;
            notas.add(nota);
        }

        // Quantidade de valores lidos
        System.out.println("Quantidade de notas: " + notas.size());

        // Valores na ordem informada
        System.out.print("Notas na ordem informada: ");
        for (double n : notas) {
            System.out.print(n + " ");
        }
        System.out.println();

        // Valores na ordem inversa
        System.out.println("Notas na ordem inversa:");
        for (int i = notas.size() - 1; i >= 0; i--) {
            System.out.println(notas.get(i));
        }

        // Soma e média
        double soma = 0;
        for (double n : notas) {
            soma += n;
        }
        double media = (notas.size() > 0) ? soma / notas.size() : 0;

        System.out.println("Soma das notas: " + soma);
        System.out.printf("Média das notas: %.2f\n", media);

        // Quantidade acima da média
        int acimaMedia = 0;
        for (double n : notas) {
            if (n > media) {
                acimaMedia++;
            }
        }
        System.out.println("Quantidade de notas acima da média: " + acimaMedia);

        // Quantidade abaixo de 7
        int abaixoSete = 0;
        for (double n : notas) {
            if (n < 7) {
                abaixoSete++;
            }
        }
        System.out.println("Quantidade de notas abaixo de 7: " + abaixoSete);

        System.out.println("Programa encerrado.");
    }
}
