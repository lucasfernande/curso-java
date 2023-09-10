package ex06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números terá em cada vetor?: ");
        int n = sc.nextInt();

        int[] vet1 = new int[n];
        int[] vet2 = new int[n];
        int[] vet3 = new int[n];

        System.out.println("Digite os valores do 1° vetor:");
        for (int i = 0; i < vet1.length; i++) {
            System.out.printf("%d°: ", i + 1);
            vet1[i] = sc.nextInt();
        }

        System.out.println("Digite os valores do 2° vetor: ");
        for (int i = 0; i < vet2.length; i++) {
            System.out.printf("%d°: ", i + 1);
            vet2[i] = sc.nextInt();
        }

        for (int i = 0; i < vet3.length; i++) {
            vet3[i] = vet1[i] + vet2[i];
        }

        System.out.println("Vetor resultante: ");
        for (int x : vet3) {
            System.out.println(x);
        }

        sc.close();
    }
}
