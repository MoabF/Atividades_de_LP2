import java.util.Scanner;
public class questao_6{
    public static void main(String[] args){
        
        //pra essa questão determinei que todos meses deveriam ter 30 dias, como consequência o ano tem 360 dias
        
        int dias_digitados = 0; int anos = 0; int meses = 0; int dias = 0;
        int resto_de_anos = 0; int resto_de_meses = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite sua idade no formato de dias:");
        dias_digitados = scanner.nextInt();
        anos = dias_digitados/360; 
        resto_de_anos= dias_digitados%360;
        meses = resto_de_anos/30; 
        dias= resto_de_anos%30;
        System.out.println("Você tem " + anos + " anos, " + meses + " meses e " + dias + " dias");
    }
}