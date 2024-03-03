package aula170;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            String[] vect = sc.nextLine().split(" "); // pega várias strings na mesma linha, separando pelo espaço
            int pos = sc.nextInt();

            System.out.println(vect[pos]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Posição inválida!");
        } catch (InputMismatchException e) {
            System.out.println("Digite um número!");
        }

        System.out.println("Fim do programa");

        sc.close();
    }
}
