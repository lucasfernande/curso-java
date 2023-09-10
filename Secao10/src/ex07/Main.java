package ex07;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números serão digitados?: ");
        int n = sc.nextInt();

        double[] nums = new double[n];

        for (int i = 0; i < nums.length; i++) {
            System.out.printf("%d°: ", i + 1);
            nums[i] = sc.nextDouble();
        }

        double soma = 0;
        double media = 0;
        for (double x : nums) {
            soma += x;
        }

        media = soma / nums.length;
        System.out.println("Média do vetor: " + media);

        System.out.println("Elementos abaixo da média: ");
        for (double x : nums) {
            if (x < media) {
                System.out.println(x);
            }
        }
    }
}
