package exMatriz;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o tamanho da matriz: ");
        int n = Integer.parseInt(sc.nextLine());

        int[][] mat = new int[n][n];

        for (int l = 0; l < mat.length; l++) {
            for (int c = 0; c < mat[l].length; c++) {
                mat[l][c] = sc.nextInt();
            }
        }

        System.out.println("Diagonal: ");
        for (int i = 0; i < mat.length; i++) {
            System.out.print(mat[i][i] + " ");
        }

        int qtdNegativo = 0;
        for (int l = 0; l < mat.length; l++) {
            for (int c = 0; c < mat[l].length; c++) {
                if (mat[l][c] < 0) {
                    qtdNegativo++;
                }
            }
        }

        System.out.print("\nNúmeros negativos: " + qtdNegativo);

        sc.close();
    }
}
