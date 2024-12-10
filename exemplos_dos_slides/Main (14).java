import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        
        // Corrigido: usando lambda sem chaves
        int result = numeros.stream().filter(x -> x % 2 == 1).map(x -> x * x).reduce(0, (x, y) -> x + y); // Soma os resultados
        System.out.println(result);
    }
}
