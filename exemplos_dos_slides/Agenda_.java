import java.util.ArrayList;
import java.util.Scanner;

public class Agenda_ {

    public static void obterMemoriaUsada() {
        int MB = 1024 * 1024;
        Runtime runtime = Runtime.getRuntime();
        System.out.println("Memória utilizada: " + (runtime.totalMemory() - runtime.freeMemory()) / MB + "MB");
    }

    public static void main(String[] args) {
        ArrayList<Agenda> tarefas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean executando = true;

        while (executando) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Adicionar tarefa");
            System.out.println("2. Remover tarefa");
            System.out.println("3. Listar tarefas");
            System.out.println("4. Ver memória utilizada");
            System.out.println("5. Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do scanner

            switch (opcao) {
                case 1:
                    System.out.print("Digite a descrição da tarefa: ");
                    String descricao = scanner.nextLine();
                    tarefas.add(new Agenda(descricao));
                    System.out.println("Tarefa adicionada.");
                    obterMemoriaUsada();
                    break;

                case 2:
                    System.out.print("Digite o índice da tarefa a ser removida (começando em 0): ");
                    int indice = scanner.nextInt();
                    if (indice >= 0 && indice < tarefas.size()) {
                        tarefas.remove(indice);
                        System.out.println("Tarefa removida.");
                    } else {
                        System.out.println("Índice inválido.");
                    }
                    obterMemoriaUsada();
                    break;

                case 3:
                    System.out.println("Lista de Tarefas:");
                    for (int i = 0; i < tarefas.size(); i++) {
                        System.out.println(i + ". " + tarefas.get(i).getTarefa());
                    }
                    break;

                case 4:
                    obterMemoriaUsada();
                    break;

                case 5:
                    executando = false;
                    break;

                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }

        // Limpeza e liberação de memória
        tarefas.clear();
        tarefas = null;
        Runtime.getRuntime().runFinalization();
        Runtime.getRuntime().gc();

        System.out.println("\nTodas as tarefas foram removidas da memória.");
        obterMemoriaUsada();

        scanner.close();
    }
}

class Agenda {
    private String tarefa;

    public Agenda(String tarefa) {
        this.tarefa = tarefa;
    }

    public String getTarefa() {
        return tarefa;
    }
}
