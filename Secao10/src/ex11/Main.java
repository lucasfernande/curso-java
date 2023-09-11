package ex11;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitados: ");
        int n = sc.nextInt();

        Pessoa[] pessoas = new Pessoa[n];

        for (int i = 0; i < pessoas.length; i++) {
            sc.nextLine();

            System.out.printf("\nDados %da pessoa\n", i + 1);
            System.out.print("Altura: ");
            double altura = sc.nextDouble();
            sc.nextLine();
            System.out.print("Sexo: ");
            char sexo = sc.next().charAt(0);

            pessoas[i] = new Pessoa(altura, sexo);
        }

        double maiorAltura = pessoas[0].getAltura();
        double menorAltura = pessoas[0].getAltura();
        double somaAlturaMulheres = 0;
        int qtdHomens = 0;
        int qtdMulheres = 0;

        for (Pessoa p : pessoas) {
            if (p.getAltura() > maiorAltura) {
                maiorAltura = p.getAltura();
            }

            if (p.getAltura() < menorAltura) {
                menorAltura = p.getAltura();
            }

            if (p.getSexo() == 'F') {
                somaAlturaMulheres += p.getAltura();
                qtdMulheres++;
            }

            if (p.getSexo() == 'M') {
                qtdHomens++;
            }
        }

        double mediaAlturaMulheres = somaAlturaMulheres / qtdMulheres;

        System.out.println("Menor altura: " + menorAltura);
        System.out.println("Maior altura: " + maiorAltura);
        System.out.println("Média de altura das mulheres: " + mediaAlturaMulheres);
        System.out.println("Quantidade de homens: " + qtdHomens);

        sc.close();
    }
}
