package desafioMatriz;

import java.util.Scanner;

public class Main  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Linhas: ");
        int x = Integer.parseInt(sc.nextLine());
        System.out.print("Colunas: ");
        int y = Integer.parseInt(sc.nextLine());

        int[][] mat = new int[x][y];

        for (int l = 0; l < mat.length; l++) {
            for (int c = 0; c < mat[l].length; c++) {
                mat[l][c] = sc.nextInt();
            }
        }

        System.out.print("Pesquise um valor: ");
        int pesquisa = sc.nextInt();

        for (int l = 0; l < mat.length; l++) {
            for (int c = 0; c < mat[l].length; c++) {
                if (mat[l][c] == pesquisa) {
                    System.out.printf("Posição (%d, %d):%n", l, c);

                    if (c > 0) {
                        System.out.println("Esquerda: " + mat[l][c - 1]);
                    }

                    if (l > 0) {
                        System.out.println("Acima: " + mat[l - 1][c]);
                    }

                    if (c < mat[l].length - 1) {
                        System.out.println("Direita: " + mat[l][c + 1]);
                    }

                    if (l < mat.length - 1) {
                        System.out.println("Abaixo: " + mat[l + 1][c]);
                    }
                }
            }
        }


        sc.close();
    }
}
