package aula161ex;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the sales file path: ");
        String salesFilePath = sc.nextLine();
        File salesFile = new File(salesFilePath);

        boolean success = new File(salesFile.getParent() + "\\out").mkdir();
        String targetFile = salesFile.getParent() + "\\out\\summary.csv";

        List<Product> products = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(salesFile))){
            String line = br.readLine();

            while (line != null) {
                String[] productData = line.split(",");
                Product product = new Product(productData[0], Double.parseDouble(productData[1]), Integer.parseInt(productData[2]));
                products.add(product);

                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(targetFile, true))){
            for (Product p : products) {
                bw.write(p.getName() + ", " + p.totalValue());
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }

}
