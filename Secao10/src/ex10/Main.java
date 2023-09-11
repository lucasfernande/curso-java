package ex10;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos alunos serão digitados: ");
        int n = sc.nextInt();

        Aluno[] alunos = new Aluno[n];

        for (int i = 0; i < alunos.length; i++) {
            sc.nextLine();

            System.out.printf("%d° Aluno:", i + 1);
            System.out.print("\nNome: ");
            String nome = sc.nextLine();
            System.out.print("1° nota: ");
            double n1 = sc.nextDouble();
            System.out.print("2° nota: ");
            double n2 = sc.nextDouble();

            alunos[i] = new Aluno(nome, n1, n2);
        }

        System.out.println("Alunos aprovados: ");
        for (Aluno a : alunos) {
            if (a.media() >= 6.0 ) {
                System.out.println(a.getNome());
            }
        }

        sc.close();
    }
}
