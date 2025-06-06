import java.util.ArrayList;
import java.util.Scanner;

public class SalariosVendedores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Double> vendas = new ArrayList<>();
        ArrayList<Double> salarios = new ArrayList<>();

        System.out.println("Informe o valor das vendas brutas dos vendedores (digite -1 para encerrar):");
        while (true) {
            double venda = sc.nextDouble();
            if (venda == -1)
                break;
            vendas.add(venda);
            double salario = 200 + (venda * 0.09);
            salarios.add(salario);
        }

        int[] faixas = new int[9];
        /*
         * Índices das faixas:
         * 0: 200 - 299
         * 1: 300 - 399
         * 2: 400 - 499
         * 3: 500 - 599
         * 4: 600 - 699
         * 5: 700 - 799
         * 6: 800 - 899
         * 7: 900 - 999
         * 8: 1000 em diante
         */

        for (double sal : salarios) {
            if (sal >= 200 && sal <= 299)
                faixas[0]++;
            else if (sal >= 300 && sal <= 399)
                faixas[1]++;
            else if (sal >= 400 && sal <= 499)
                faixas[2]++;
            else if (sal >= 500 && sal <= 599)
                faixas[3]++;
            else if (sal >= 600 && sal <= 699)
                faixas[4]++;
            else if (sal >= 700 && sal <= 799)
                faixas[5]++;
            else if (sal >= 800 && sal <= 899)
                faixas[6]++;
            else if (sal >= 900 && sal <= 999)
                faixas[7]++;
            else if (sal >= 1000)
                faixas[8]++;
        }

        System.out.println("Faixas salariais:");
        System.out.println("$200 - $299: " + faixas[0]);
        System.out.println("$300 - $399: " + faixas[1]);
        System.out.println("$400 - $499: " + faixas[2]);
        System.out.println("$500 - $599: " + faixas[3]);
        System.out.println("$600 - $699: " + faixas[4]);
        System.out.println("$700 - $799: " + faixas[5]);
        System.out.println("$800 - $899: " + faixas[6]);
        System.out.println("$900 - $999: " + faixas[7]);
        System.out.println("$1000 em diante: " + faixas[8]);
    }
}
