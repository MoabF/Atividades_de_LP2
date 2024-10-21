import java.util.Scanner;

public class questao_1_lista_3
{
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    int n = 0;
		System.out.println("Digite o tamanho do vetor:");
        n = scanner.nextInt();
        int v[] = new int[n];
        System.out.println("Digite a sequência numérica:");
		for(int i = 0; i<n; i++){
		    v[i] = scanner.nextInt();
		}
		System.out.println("A sequência de números é:");
		for(int i = n-1; i>=0; i--){
		   	System.out.print(v[i] + " ");
		}
		scanner.close();
	}
}