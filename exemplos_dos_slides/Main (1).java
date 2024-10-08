import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    float L1 = 0.0f; float L2 = 0.0f; float L3 = 0.0f;
		System.out.println("Digite os lados ou ângulos do triangulo:");
		L1 = scanner.nextFloat(); L2 = scanner.nextFloat(); L3 = scanner.nextFloat();
	
		if((L1 == L2) && (L1 == L3)){
    		System.out.println("Esse triãngulo é equilátero");
		}
		else if(((L1 == L2) && (L1 != L3))||((L3 == L2) && (L1 != L3))
		||((L1 != L2) && (L1 == L3))){
    		System.out.println("Esse triãngulo é isósceles");
		}
		else{
    		System.out.println("Esse triãngulo é escaleno");
		}
		
	}
}