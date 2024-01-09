package aula164;

import aula164.entities.Circle;
import aula164.entities.Rectangle;
import aula164.entities.Shape;
import aula164.entities.enums.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Shape> shapes = new ArrayList<>();

        System.out.print("Enter the number of shapes: ");
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 1; i <= n; i++) {
            System.out.printf("Shape #%d data%n", i);

            System.out.print("Rectangle or Circle (r/c): ");
            char rc = sc.nextLine().charAt(0);

            System.out.print("Color (BLACK/BLUE/RED): ");
            Color color = Color.valueOf(sc.nextLine());
            if (rc == 'r') {
                System.out.print("Width: ");
                double width = Double.parseDouble(sc.nextLine());
                System.out.print("Height: ");
                double height = Double.parseDouble(sc.nextLine());
                shapes.add(new Rectangle(color, width, height));
            } else if (rc == 'c') {
                System.out.print("Radius: ");
                double radius = Double.parseDouble(sc.nextLine());
                shapes.add(new Circle(color, radius));
            }
        }

        System.out.println("SHAPE AREAS: ");
        for (Shape s : shapes) {
            System.out.println(s.area());
        }

        sc.close();
    }
}
