package aula159;

import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a folder path: ");
        String folderPath = sc.nextLine();

        File path = new File(folderPath);

        File[] folders = path.listFiles(File::isDirectory); // retorna todos as pastas dentro da pasta fornecida pelo usuário
        System.out.println("Folders: ");
        for (File folder : folders) {
            System.out.println(folder);
        }

        File[] files = path.listFiles(File::isFile); // retorna todos os arquivos dentro da pasta fornecida pelo usuário
        System.out.println("Files: ");
        for (File file : files) {
            System.out.println(file);
        }

        boolean success = new File(folderPath + "\\testeCriandoPasta").mkdir(); // criando uma pasta
        System.out.println("Directory created successfully: " + success);

        sc.close();
    }
}
