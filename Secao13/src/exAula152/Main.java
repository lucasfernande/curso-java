package exAula152;

import exAula152.entities.Order;
import exAula152.entities.Client;
import exAula152.entities.OrderItem;
import exAula152.entities.enums.OrderStatus;
import exAula152.entities.Product;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        DateTimeFormatter birthDateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter client data: ");
        System.out.print("Name: ");
        String clientName = sc.nextLine();

        System.out.print("Email: ");
        String clientEmail = sc.nextLine();

        System.out.print("Birth date (DD/MM/YYYY): ");
        LocalDate clientBirthDate = LocalDate.parse(sc.nextLine(), birthDateFormat);

        Client client = new Client(clientName, clientEmail, clientBirthDate);

        System.out.println("Enter order data: ");

        System.out.print("Status: ");
        OrderStatus status = OrderStatus.valueOf(sc.nextLine());

        LocalDateTime orderMoment = LocalDateTime.now();

        Order order = new Order(orderMoment, status, client);

        System.out.print("How many items to this order?: ");
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 1; i <= n; i++) {
            System.out.printf("Enter #%d item data%n", i);

            System.out.print("Product name: ");
            String productName = sc.nextLine();

            System.out.print("Product price: ");
            double productPrice = Double.parseDouble(sc.nextLine());

            System.out.print("Quantity: ");
            int quantity = Integer.parseInt(sc.nextLine());

            Product product = new Product(productName, productPrice);
            OrderItem item = new OrderItem(quantity, productPrice, product);
            order.addItem(item);
        }

        System.out.println("\nOrder Summary: ");
        System.out.println("Order moment: " + order.getMoment().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")));
        System.out.println("Order status: " + order.getStatus());
        System.out.println("Client: " + order.getClient().toString());

        System.out.println("\nOrder items: ");
        for (OrderItem item: order.getItems()) {
            System.out.println(item.toString());
        }

        System.out.print("Total price: $" + order.total());
        sc.close();
    }
}
