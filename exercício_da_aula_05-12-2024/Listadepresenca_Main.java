import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Listadepresenca_Main
{
	public static void main(String[] args) {
		
		Map<Integer, String> lista = new HashMap <> ();
		Map<Integer, Boolean> presenca = new HashMap <> ();
		Scanner sc = new Scanner (System.in);
		lista.put (101, "Joao Lima");
		lista.put (108, "Maria Lima");
		lista.put (103, "Roberto Silva");
		lista.put (109, "Joab");
		lista.put (104, "anaí");
		lista.put (122, "maria do bairro");
		
		presenca.put (101, false);
		presenca.put (108, false);
		presenca.put (103, false);
		presenca.put (109, false);
		presenca.put (104, false);
		presenca.put (122, false);
		
	/*	for(Map.Entry <Integer, String> entry: lista.entrySet()){
		    System.out.println("ID: "+ entry.getKey()+ " - Nome: "+ entry.getValue());
		}
		
	/*	System.out.println("Digite o id para consulta: ");
		int id = sc.nextInt();
		String nome = lista.get(id);
		Boolean presen = presenca.get(id);*/
		int n = 0;
		do{
		   System.out.println("Digite a função que deseja realizar"); 
		   System.out.println("1 - atualizar preseça de um aluno\n"+ 
		                      "2 - ver quais alunos estão presentes\n"+
		                      "3 - ver quais alunos estão ausentes\n"+
		                      "4 - Sair...\n"); 
		  n = sc.nextInt();
		  switch(n){
		      case 1:
		          System.out.println("Digite o id para consulta: ");
		            int id = sc.nextInt();
		            String nome = lista.get(id);
		            	if (nome != null){
            		    System.out.println("Aluno(a): "+ nome);
            		    presenca.put (id, true);
            		    }else{
            		    System.out.println("Aluno não encontrado.");
            		    }
		          break;
		      case 2:
		          for(Map.Entry <Integer, Boolean> entry: presenca.entrySet()){
		              if(entry.getValue() == true){
		                 String nome_pres = lista.get(entry.getKey());
		            System.out.println(nome_pres + " - Presente");
		              }
	            	}
	            	break;
	            case 3:
		          for(Map.Entry <Integer, Boolean> entry: presenca.entrySet()){
		              if(entry.getValue() == false){
		                 String nome_pres = lista.get(entry.getKey());
		            System.out.println(nome_pres + " - Ausente");
		              }
	            	}
	            	break;
		  }
		
		    
		}while (n != 4);
		sc.close();
	}
}
