package desafio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name;
        String email;
        int quarto;
        Inquilino iq;
        Inquilino[] iqs = new Inquilino[10];

        System.out.print("Quantos quartos serão alugados?: ");
        int alugados = Integer.parseInt(sc.nextLine());

        for (int i = 1; i <= alugados; i++) {
            System.out.println("Quarto " + i);
            System.out.print("Nome: ");
            name = sc.nextLine();
            System.out.print("Email: ");
            email = sc.nextLine();
            while(true) {
                System.out.print("N° do quarto: ");
                quarto = Integer.parseInt(sc.nextLine());

                if ((quarto < 0 || quarto > 9) || iqs[quarto] != null) {
                    System.out.println("Quarto não existe ou já está ocupado, tente novamente!");
                } else {
                    break;
                }
            }

            iq = new Inquilino(name, email);
            iqs[quarto] = iq;
        }

        System.out.println("\nQuartos ocupados: ");
        for (int i = 0; i < iqs.length; i++) {
            if (iqs[i] != null) {
                System.out.printf("%d: %s%n", i, iqs[i].toString());
            }
        }


        sc.close();
    }
}
