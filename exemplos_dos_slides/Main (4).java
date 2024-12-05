import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		
		Map<Integer, String> lista = new HashMap <> ();
		
		lista.put (101, "Joao Lima");
		lista.put (108, "Maria Lima");
		lista.put (103, "Roberto Silva");
		lista.put (109, "Joab");
		lista.put (104, "anaí");
		lista.put (122, "maria do bairro");
		
		for(Map.Entry <Integer, String> entry: lista.entrySet()){
		    System.out.println("ID: "+ entry.getKey()+ " - Nome: "+ entry.getValue());
		}
		Scanner sc = new Scanner (System.in);
		System.out.println("Digite o id para consulta: ");
		int id = sc.nextInt();
		String nome = lista.get(id);
		if (nome != null){
		    System.out.println("Aluno encontrado: "+ nome);
		}else{
		    System.out.println("Aluno não encontrado.");
		}
		sc.close();
	}
}