import java.util.Scanner;
public class Main {
    public static void obterMemoriaUsada() {
        int MB = 1024 * 1024;
        Runtime runtime = Runtime.getRuntime();
    //runtime.totalMemory() - runtime.freeMemory();
      //  Runtime runtime = Runtime.getRuntime();
        System.out.println((runtime.totalMemory() - runtime.freeMemory()) / MB + " MB");
    }

    public static void main(String[] args) {
        Agenda[] tarefas = new Agenda[10000];
        int n = 0;
        Scanner entrada = new Scanner(System.in);
       do{
           System.out.println("Digite o que você deseja realizar: \n1-adicionar tarefa\n2-remover tarefa\n3-listar tarefas\n4-sair");
            n = entrada.nextInt();
            Agenda tarefa = new Agenda("");
            tarefas[0]= tarefa;
       }while(n!=4);
   
        System.out.println("Contatos criados");
        obterMemoriaUsada();
        tarefas = null;
        Runtime.getRuntime().runFinalization();
        Runtime.getRuntime().gc();
 
        System.out.println("Contatos removidos da memória");
        obterMemoriaUsada();
    }
}


class Agenda {
    String tarefa;
   

    public Agenda(String tarefa) {
        this.tarefa = tarefa;
    }
}