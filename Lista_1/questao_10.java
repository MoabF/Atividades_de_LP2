import java.util.Scanner;
public class questao_10{
    public static void main(String[] args){
        float nota_1 = 0.0f; float nota_2 = 0.0f; float nota_3 = 0.0f; float nota_4 = 0.0f;
        float nota_bim_1 = 0.0f; float nota_bim_2 = 0.0f; float nota_semestre = 0.0f;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite as notas das provas da unidade 1:");
        nota_1 = scanner.nextInt();
        nota_2 = scanner.nextInt();
        if((nota_1 <= 10 && nota_1 >= 0)&&(nota_2 <= 10 && nota_2 >= 0)){
            System.out.println("Agora digite as notas das provas da unidade 2:");
            nota_3 = scanner.nextInt();
            nota_4 = scanner.nextInt();
            if((nota_3 <= 10 && nota_3 >= 0)&&(nota_4 <= 10 && nota_4 >= 0)){
                nota_bim_1 = (nota_1 + nota_2)/2;
                nota_bim_2 = (nota_3 + nota_4)/2;
                nota_semestre = (nota_bim_1 + nota_bim_2)/2;
                System.out.println("A nota do semestre é: "+ nota_semestre);
            }
        }
    }
}