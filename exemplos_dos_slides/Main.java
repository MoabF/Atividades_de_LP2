public class Main {

	public static void obterMemoriaUsada(){
		int MB = 1024*1024;
		Runtime runtime = Runtime.getRuntime();
		//runtime.totalMemory() - runtime.freeMemory();
		System.out.println((runtime.totalMemory() - runtime.freeMemory())/MB+"MB");
	}
	public static void main (String[] args ){
		Agenda[] terefas = new Agenda[10000];
		//Agenda Agenda
		for (int i=0; i< terefas.length; i++){
		Agenda terefa = new Agenda("terefa"+i);
		terefas[i] = terefa;
		}
		System.out.println("terefas criados");
		obterMemoriaUsada();
		terefas = null;
		Runtime.getRuntime().runFinalization();
		Runtime.getRuntime().gc();
		
		System.out.println("terefas removidos da memória");
		obterMemoriaUsada();
	}
}
class Agenda{
    private String tarefa;
	public Agenda(){
        this.tarefa = "";
    }
    public Agenda(String tar){
        this.tarefa = tar;
    }
}