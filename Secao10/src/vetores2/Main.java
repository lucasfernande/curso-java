package vetores2;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Product[] vect = new Product[n];

        for (int i = 0; i < vect.length; i++) {
            sc.nextLine(); // quebra de linha pendente

            String name = sc.nextLine();
            double price = sc.nextDouble();
            Product p = new Product(name, price);
            vect[i] = p;
        }

        double totalPrice = 0.0;
        for (Product p : vect) {
            totalPrice += p.getPrice();
        }

        double avg = totalPrice / vect.length;
        System.out.printf("Average price: %.2f", avg);

        sc.close();
    }
}
