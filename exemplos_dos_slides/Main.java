import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

interface Biblioteca {
	// MC)todo para cadastrar um livro na biblioteca
	void cadastrarLivro(String titulo, String autor, String isbn);

	// MC)todo para emprestar um livro
	void emprestarLivro(String isbn);

	// MC)todo para devolver um livro
	void devolverLivro(String isbn);

	// MC)todo para buscar informaC'C5es sobre um livro
	void buscarLivro(String isbn);
}


class BibliotecaImpl implements Biblioteca {
	// Mapa para armazenar livros, onde a chave C) o ISBN
	private Map<String, String> livros = new HashMap<>();

	@Override
	public void cadastrarLivro(String titulo, String autor, String isbn) {
		livros.put(isbn, "TC-tulo: " + titulo + ", Autor: " + autor);
		System.out.println("Livro cadastrado com sucesso: " + titulo);
	}

	@Override
	public void emprestarLivro(String isbn) {
		if (livros.containsKey(isbn)) {
			System.out.println("Livro emprestado: " + livros.get(isbn));
		} else {
			System.out.println("Livro com ISBN " + isbn + " nC#o encontrado.");
		}
	}

	@Override
	public void devolverLivro(String isbn) {
		if (livros.containsKey(isbn)) {
			System.out.println("Livro devolvido: " + livros.get(isbn));
		} else {
			System.out.println("Livro com ISBN " + isbn + " nC#o encontrado.");
		}
	}

	@Override
	public void buscarLivro(String isbn) {
		if (livros.containsKey(isbn)) {
			System.out.println("InformaC'C5es do livro: " + livros.get(isbn));
		} else {
			System.out.println("Livro com ISBN " + isbn + " nC#o encontrado.");
		}
	}
}
//***************************************** */
public class Main {
	public static void main(String[] args) {
		Biblioteca biblioteca = new BibliotecaImpl();

		// Cadastrar livros
		biblioteca.cadastrarLivro("O Senhor dos AnC)is", "J.R.R. Tolkien", "12345");
		biblioteca.cadastrarLivro("Dom Casmurro", "Machado de Assis", "67890");

		// Buscar livros
		biblioteca.buscarLivro("12345");

		// Emprestar e devolver livros
		biblioteca.emprestarLivro("12345");
		biblioteca.devolverLivro("12345");

		// Tentar buscar livro que nC#o existe
		biblioteca.buscarLivro("00000");
		Scanner entrada = new Scanner(System.in);
		int n = 0;
		do {
			System.out.println("Digite o que vocC* deseja realizar:\n1-Cadastrar livro\n2-Buscar livro"+
			                   "\n3-Pegar um livro emprestado\n4-Devolver livro\n5-Sair");
			n = entrada.nextInt();
			switch(n) {
			case 1:
				break;
			case 2:
				break;
			case 3:
			}
		} while(n!=5);

	}
}