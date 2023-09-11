package ex09;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas?: ");
        int n = sc.nextInt();

        Pessoa[] pessoas = new Pessoa[n];

        for (int i = 0; i < pessoas.length; i++) {
            sc.nextLine();

            System.out.printf("Dados da %d° pessoa: ", i + 1);
            System.out.print("\nNome: ");
            String nome = sc.nextLine();
            System.out.print("Idade: ");
            int idade = sc.nextInt();

            pessoas[i] = new Pessoa(nome, idade);
        }

        int maisVelho = pessoas[0].getIdade();
        String nomeMaisVelho = null;

        for (Pessoa p : pessoas) {
            if (p.getIdade() > maisVelho) {
                maisVelho = p.getIdade();
                nomeMaisVelho = p.getNome();
            }
        }

        System.out.println("Pessoa mais velha: " + nomeMaisVelho);
        
        sc.close();
    }
}
