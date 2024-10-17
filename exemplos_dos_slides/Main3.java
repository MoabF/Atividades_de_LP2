import java.util.Scanner;
public class Main3
{
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    int num = 0;
		System.out.println("Digite o seu número da sorte (entre 0 e 10):");
		num = scanner.nextInt(); 
	    int valor = (int)(Math.random() * 11);
	    
	    if(valor == num){
	        System.out.println("Parabéns, você ganhou!");
	    }
	    else{
	         System.out.println("Que pena, o número sorteado foi: " + valor);
	    }
		scanner.close();
	}
}