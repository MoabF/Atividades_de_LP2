import java.util.Scanner;

public class questao_5_lista_2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int tabuada = 0;

        System.out.println("Digite o número que você deseja olhar a tabuada: ");
        tabuada = entrada.nextInt();
        
        switch (tabuada) {
            case 1:
                System.out.println("Tabuada do 1:\n" +
                                   "1 x 1 = 1\n1 x 2 = 2\n1 x 3 = 3\n1 x 4 = 4\n1 x 5 = 5\n" +
                                   "1 x 6 = 6\n1 x 7 = 7\n1 x 8 = 8\n1 x 9 = 9\n1 x 10 = 10\n");
                break;
            case 2:
                System.out.println("Tabuada do 2:\n" +
                                   "2 x 1 = 2\n2 x 2 = 4\n2 x 3 = 6\n2 x 4 = 8\n2 x 5 = 10\n" +
                                   "2 x 6 = 12\n2 x 7 = 14\n2 x 8 = 16\n2 x 9 = 18\n2 x 10 = 20\n");
                break;
            case 3:
                System.out.println("Tabuada do 3:\n" +
                                   "3 x 1 = 3\n3 x 2 = 6\n3 x 3 = 9\n3 x 4 = 12\n3 x 5 = 15\n" +
                                   "3 x 6 = 18\n3 x 7 = 21\n3 x 8 = 24\n3 x 9 = 27\n3 x 10 = 30\n");
                break;
            case 4:
                System.out.println("Tabuada do 4:\n" +
                                   "4 x 1 = 4\n4 x 2 = 8\n4 x 3 = 12\n4 x 4 = 16\n4 x 5 = 20\n" +
                                   "4 x 6 = 24\n4 x 7 = 28\n4 x 8 = 32\n4 x 9 = 36\n4 x 10 = 40\n");
                break;
            case 5:
                System.out.println("Tabuada do 5:\n" +
                                   "5 x 1 = 5\n5 x 2 = 10\n5 x 3 = 15\n5 x 4 = 20\n5 x 5 = 25\n" +
                                   "5 x 6 = 30\n5 x 7 = 35\n5 x 8 = 40\n5 x 9 = 45\n5 x 10 = 50\n");
                break;
            case 6:
                System.out.println("Tabuada do 6:\n" +
                                   "6 x 1 = 6\n6 x 2 = 12\n6 x 3 = 18\n6 x 4 = 24\n6 x 5 = 30\n" +
                                   "6 x 6 = 36\n6 x 7 = 42\n6 x 8 = 48\n6 x 9 = 54\n6 x 10 = 60\n");
                break;
            case 7:
                System.out.println("Tabuada do 7:\n" +
                                   "7 x 1 = 7\n7 x 2 = 14\n7 x 3 = 21\n7 x 4 = 28\n7 x 5 = 35\n" +
                                   "7 x 6 = 42\n7 x 7 = 49\n7 x 8 = 56\n7 x 9 = 63\n7 x 10 = 70\n");
                break;
            case 8:
                System.out.println("Tabuada do 8:\n" +
                                   "8 x 1 = 8\n8 x 2 = 16\n8 x 3 = 24\n8 x 4 = 32\n8 x 5 = 40\n" +
                                   "8 x 6 = 48\n8 x 7 = 56\n8 x 8 = 64\n8 x 9 = 72\n8 x 10 = 80\n");
                break;
            case 9:
                System.out.println("Tabuada do 9:\n" +
                                   "9 x 1 = 9\n9 x 2 = 18\n9 x 3 = 27\n9 x 4 = 36\n9 x 5 = 45\n" +
                                   "9 x 6 = 54\n9 x 7 = 63\n9 x 8 = 72\n9 x 9 = 81\n9 x 10 = 90\n");
                break;
            default:
                System.out.println("Número sem tabuada");
        }

        entrada.close();
    }
}
