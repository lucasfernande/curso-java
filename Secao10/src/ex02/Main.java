package ex02;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números vai digitar?: ");
        int n = sc.nextInt();

        double[] nums = new double[n];

        for (int i = 0; i < nums.length; i++) {
            System.out.print("Digite um número: ");
            double x = sc.nextDouble();

            nums[i] = x;
        }

        double soma = 0;
        double media = 0;

        System.out.print("Valores digitados: ");
        for (double v : nums) {
            System.out.print(v + " ");
            soma += v;
        }

        media = soma / nums.length;
        System.out.println("\nSoma dos valores: " + soma);
        System.out.println("Média dos valores: " + media);

        sc.close();
    }
}
