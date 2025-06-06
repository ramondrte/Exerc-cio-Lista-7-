import java.util.ArrayList;
import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> temperaturas = new ArrayList<>();
        String[] meses = { "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
                "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro" };

        // Recebe temperaturas
        for (int i = 0; i < 12; i++) {
            System.out.print("Informe a temperatura média de " + meses[i] + ": ");
            temperaturas.add(sc.nextDouble());
        }

        // Calcula média anual
        double soma = 0;
        for (double temp : temperaturas) {
            soma += temp;
        }
        double mediaAnual = soma / temperaturas.size();

        System.out.printf("Média anual das temperaturas: %.2f\n", mediaAnual);

        // Mostra temperaturas acima da média e o mês
        System.out.println("Temperaturas acima da média anual:");
        for (int i = 0; i < temperaturas.size(); i++) {
            if (temperaturas.get(i) > mediaAnual) {
                System.out.println(meses[i] + ": " + temperaturas.get(i));
            }
        }
    }
}
