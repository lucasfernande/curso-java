package exListas;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int id;
        String nome;
        double salario;


        List<Funcionario> funcs = new ArrayList<>();

        System.out.print("Quantos funcionário serão registrados?: ");
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.printf("\nFuncionário %d%n", i + 1);
            System.out.print("Id: ");
            id = Integer.parseInt(sc.nextLine());
            System.out.print("Nome: ");
            nome = sc.nextLine();
            System.out.print("Salário: ");
            salario = Double.parseDouble(sc.nextLine());

            funcs.add(new Funcionario(id, nome, salario));
        }

        System.out.print("Digite o id do funcionário que receberá aumento: ");
        double idAumento = Double.parseDouble(sc.nextLine());

        Funcionario func = funcs.stream().filter(f -> f.getId() == idAumento).findFirst().orElse(null);
        if (func == null) {
            System.out.println("Funcionário não existe!");
        } else {
            System.out.print("Digite a porcentagem de aumento: ");
            double percentual = Double.parseDouble(sc.nextLine());

            func.setSalario(func.getSalario() * (1 + percentual / 100));
        }

        System.out.println("Lista de Funcionários: ");
        for (Funcionario f: funcs) {
            System.out.println(f);
        }

        sc.close();
    }
}
