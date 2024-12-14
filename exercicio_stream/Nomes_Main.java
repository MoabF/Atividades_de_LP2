package exercicio_stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Nomes_Main {
    public static void main(String[] args) {
        List<String> nomes = Arrays.asList("Ana", "Carlos", "Francisco", "Chagas", "Eduardo", "Fábio", "Baltazar", "Gaspar", "Fred", "Bela");

        List<String> nomesf = nomes.stream()
                .filter(nome -> nome.length() > 5)
                .sorted()
                .collect(Collectors.toList());

        System.out.println(nomesf);
    }
}