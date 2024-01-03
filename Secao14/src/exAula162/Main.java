package exAula162;

import exAula162.entities.ImportedProduct;
import exAula162.entities.Product;
import exAula162.entities.UsedProduct;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        List<Product> products = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of products: ");
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 1; i <= n; i++) {
            System.out.println("Product #" + i + " data: ");

            System.out.print("Common, used or imported (c/u/i)?: ");
            char type = sc.nextLine().charAt(0);

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Price: ");
            double price = Double.parseDouble(sc.nextLine());

            switch (type) {
                case 'c':
                    products.add(new Product(name, price));
                    break;
                case 'u':
                    System.out.print("Manufacture date (DD/MM/YYYY): ");
                    LocalDate manufactureDate = LocalDate.parse(sc.nextLine(), fmt);

                    products.add(new UsedProduct(name, price, manufactureDate));
                    break;
                case 'i':
                    System.out.print("Customs fee: ");
                    double customsFee = Double.parseDouble(sc.nextLine());

                    products.add(new ImportedProduct(name, price, customsFee));
                    break;
            }
        }

        System.out.println("\nPrice tags: ");
        for (Product p : products) {
            System.out.println(p.priceTag());
        }
        sc.close();
    }
}
