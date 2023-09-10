package ex04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números vai digitar?: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        for (int i = 0; i < nums.length; i++) {
            System.out.print("Digite um número: ");
            nums[i] = sc.nextInt();
        }

        int pares = 0;

        System.out.println("Números pares: ");
        for (int x : nums) {
            if (x % 2 == 0) {
                System.out.print(x + " ");
                pares++;
            }
        }

        System.out.println("\nQuantidade de pares: " + pares);

        sc.close();
    }
}
