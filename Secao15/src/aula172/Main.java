package aula172;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        File file = new File("C:\\Users\\Lucas\\Documents\\java-udemy\\Secao15\\src\\aula172\\teste.txt");
        Scanner sc = null;

        try {
            sc = new Scanner(file);

            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Erro: arquivo não encontrado!");;
        } finally {
            if (sc != null)
                sc.close();
            System.out.println("Finalizando...");
        }

        // o bloco finally é executado independentemente do código dar erro ou não
    }
}
