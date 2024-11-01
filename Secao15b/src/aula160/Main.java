package aula160;

import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a folder path: ");
        String path = sc.nextLine();

        File file = new File(path);

        System.out.println("getName: " + file.getName()); // retorna o nome do arquivo
        System.out.println("getPath: " + file.getPath()); // retorna o caminho do arquivo (com o nome do arquivo)
        System.out.println("getParent: " + file.getParent()); // retorna a pasta do arquivo

        sc.close();
    }
}
