public class Main {

	public static void obterMemoriaUsada(){
		int MB = 1024*1024;
		Runtime runtime = Runtime.getRuntime();
		//runtime.totalMemory() - runtime.freeMemory();
		System.out.println((runtime.totalMemory() - runtime.freeMemory())/MB+"MB");
	}
	public static void main (String[] args){
		Contato[] contatos = new Contato[10000];
		//Contato contato
		for (int i=0; i< contatos.length; i++){
		Contato contato = new Contato("Contato"+i,"1234-5678"+i, "contato"+i+"@email.com");
		contatos[i] = contato;
		}
		System.out.println("Contatos criados");
		obterMemoriaUsada();
		contatos = null;
		Runtime.getRuntime().runFinalization();
		Runtime.getRuntime().gc();
		
		System.out.println("Contatos removidos da memória");
		obterMemoriaUsada();
	}
}
class Contato{
    private String nome;
    private String numero;
    private String email;
    
    public Contato(String nome, String numero, String email){
        this.nome = nome;
        this.numero = numero;
        this.email = email;
    }
}