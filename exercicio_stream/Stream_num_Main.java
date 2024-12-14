package exercicio_stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream_num_Main {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(10, 15, 22, 37, 45, 56, 87, 92, 98, 99, 101, 110);

        List<Integer> numeros_pares = numeros.stream()
                .filter(x -> x % 2 == 0) 
                .collect(Collectors.toList()); 

        List<Integer> numeros_impares = numeros.stream()
                .filter(x -> x % 2 != 0) 
                .collect(Collectors.toList()); 

        System.out.println("Pares: " + numeros_pares);
        System.out.println("Ímpares: " + numeros_impares);
    }
}