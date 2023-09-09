package ex01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números vai digitar: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        for (int i = 0; i < nums.length; i++) {
            System.out.print("Digite um número: ");
            int x = sc.nextInt();

            nums[i] = x;
        }

        System.out.println("Valores negativos: ");
        for (int v : nums) {
            if (v < 0) {
                System.out.println(v);
            }
        }

        sc.close();
    }
}
