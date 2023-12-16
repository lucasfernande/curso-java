package aula146;
import aula146.entities.Order;
import aula146.entities.enums.OrderStatus;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Order order = new Order(1106, LocalDate.now(), OrderStatus.PENDING_PAYMENT);
        System.out.println(order);
    }
}
