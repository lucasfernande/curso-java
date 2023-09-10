package ex03;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoa serão digitadas?: ");
        int n = sc.nextInt();

        Pessoa[] pessoas = new Pessoa[n];

        for (int i = 0; i < pessoas.length; i++) {
            sc.nextLine();
            System.out.printf("Dados da %da pessoa", i + 1);
            System.out.print("\nNome: ");
            String nome = sc.nextLine();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            System.out.print("Altura: ");
            double altura = sc.nextDouble();

            pessoas[i] = new Pessoa(nome, idade, altura);
        }

        double somaAlturas = 0;
        double mediaAlturas = 0;
        double percentualMenor16 = 0;
        int qtdMenor16 = 0;

        for (Pessoa p : pessoas) {
            somaAlturas += p.getAltura();

            if (p.getIdade() < 16) {
                qtdMenor16++;
            }
        }

        mediaAlturas = somaAlturas / pessoas.length;
        percentualMenor16 = ((double) qtdMenor16 / pessoas.length) * 100;

        System.out.printf("Média das alturas: %.2f\n", mediaAlturas);
        System.out.printf("Percentual de pessoas de idade menor que 16 anos: %.1f%%\n", percentualMenor16);
        for (Pessoa p : pessoas) {
            if (p.getIdade() < 16) {
                System.out.println(p.getNome());
            }
        }

        sc.close();
    }
}
