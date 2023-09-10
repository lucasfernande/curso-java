package ex08;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números serão digitados?: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        for (int i = 0; i < nums.length; i++) {
            System.out.printf("%d°: ", i + 1);
            nums[i] = sc.nextInt();
        }

        int somaPares = 0;
        int qtdPares = 0;
        double mediaPares = 0;

        for (int x : nums) {
            if (x % 2 == 0) {
                somaPares += x;
                qtdPares++;
            }
        }

        if (qtdPares > 0) {
            mediaPares = (double) somaPares / qtdPares;
            System.out.println("Média dos pares: " + mediaPares);
        } else {
            System.out.println("Nenhum número par");
        }

        sc.close();
    }
}
