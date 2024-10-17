import java.util.Scanner;


public class Main5
{
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    //int n = 10;
	    int [][] matriz = new int[3][3];
	    System.out.println("Matriz M[3][3]\n");
		//System.out.println("Digite os números que deseja ordenar:");
		for(int linha = 0; linha<3; linha++){
		    for(int coluna = 0; coluna < 3; coluna++){
		        System.out.printf("Insira o elemento M[%d][%d]: ", linha+1, coluna+1);
		        matriz[linha][coluna] = scanner.nextInt();
		    }
		    //v[i] = scanner.nextInt();
		}
			System.out.println("\nA matriz ficou: \n");
		//System.out.println("Digite os números que deseja ordenar:");
		for(int linha = 0; linha<3; linha++){
		    for(int coluna = 0; coluna < 3; coluna++){
		        System.out.printf("\t %d \t", matriz[linha][coluna]);
		    }
		    System.out.println();
		}
		scanner.close();
	}
}