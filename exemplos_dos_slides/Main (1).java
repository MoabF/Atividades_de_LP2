import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    List <String> lista = new ArrayList <> ();
	    lista.add("Ivo");
	    lista.add("Reginaldo");
	    lista.add("Diniorah");
	    lista.add("Ana");
	    lista.add("Pedro");
	    lista.add("Geraldo");
		System.out.println(lista);
		Collections.sort(lista);
		System.out.println(lista);
	}
}