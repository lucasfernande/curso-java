package listas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();

        // adicionando valores
        nomes.add("Maria");
        nomes.add("John");
        nomes.add("Felipe");
        nomes.add("Marcos");

        // adiciona um valor no índice especificado
        nomes.add(1, "Ana");

        // remove um valor (também remove pelo índice)
        nomes.remove(2); // removerá o nome John

        // retorna o tamanho da lista
        System.out.println(nomes.size());

        for (String n: nomes) {
            System.out.println(n);
        }
        System.out.println("-------------------------");

        // removerá todos os nomes que começam com M
        nomes.removeIf(nome -> nome.charAt(0) == 'M'); // função lambda

        for (String n: nomes) {
            System.out.println(n);
        }

        System.out.println("-------------------------");

        nomes.add("Kaio");
        nomes.add("Fernanda");

        // retorna o índice do valor pesquisado (se não achar, retorna -1)
        System.out.println(nomes.indexOf("Ana"));

        // retorna apenas os nomes que começam com F
        List<String> pesquisa = nomes.stream().filter(nome -> nome.charAt(0) == 'F').toList();
        for (String n: pesquisa) {
            System.out.println(n);
        }

        System.out.println("-------------------------");

        // retorna o primeiro nome que começa com F (se não achar, retorna null)
        String n = nomes.stream().filter(c -> c.charAt(0) == 'F').findFirst().orElse(null);
        System.out.println(n);
    }
}
