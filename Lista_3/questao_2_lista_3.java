import java.util.Scanner;


public class questao_2_lista_3
{
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    int n = 10;
	    int v[] = new int[n];
		System.out.println("Digite 10 números:");
		for(int i = 0; i<n; i++){
		    v[i] = scanner.nextInt();
		}
		for(int i = n; i>0; i--){
		    for(int j = 0; j<i-1; j++){
		    if(v[j] > v[j+1]){
    		    int aux = v[j];
    		     v[j] = v[j+1];
    		     v[j+1] = aux;
		}
		    }
		}
		System.out.println("A sequência de números ordenada em forma decrescente é:");
		for(int i = n-1; i>=0; i--){
            System.out.print(v[i] + " ");
     }
		scanner.close();
	}
}