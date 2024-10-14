import java.util.Scanner;
public class questao_1_lista_2{
	public static void main(String[] args) {
    	Scanner entrada = new Scanner(System.in);
		float nota1 = 0.0f; float nota2 = 0.0f; float nota3 = 0.0f;
		double nota_final = 0.0d;
		System.out.println("Digite a nota das 3 unidades do semestre: ");
		nota1 = entrada.nextFloat();  
		nota2 = entrada.nextFloat();  
		nota3 = entrada.nextFloat();  
		nota_final = (nota1 + nota2 +nota3)/3;
		if(nota_final >= 3){
			/*if(nota_final < 6){
				System.out.println("O aluno precisa fazer a prova de reposição");
			}*/
			if(nota1 >= 4 && nota2 >= 4 && nota3 >= 4 && nota_final >= 7){
				System.out.println("O aluno foi aprovado, com nota final igual a " + nota_final);
			}
			else if(nota1 >= 4 && nota2 >= 4 && nota3 >= 4 && nota_final >= 6){
				System.out.println("O aluno foi aprovado por nota, com nota final igual a " + nota_final);
			}
			else{
				System.out.println("O aluno precisa fazer a prova de reposição");
			}
		}
		else{
			System.out.println("O aluno está reprovado.");
		}
		entrada.close();
	}
}
