interface Biblioteca {
    // Método para cadastrar um livro na biblioteca
    void cadastrarLivro(String titulo, String autor, String isbn);

    // Método para emprestar um livro
    void emprestarLivro(String isbn);

    // Método para devolver um livro
    void devolverLivro(String isbn);

    // Método para buscar informações sobre um livro
    void buscarLivro(String isbn);
}

//***************************************** */
import java.util.HashMap;
import java.util.Map;

class BibliotecaImpl implements Biblioteca {
    // Mapa para armazenar livros, onde a chave é o ISBN
    private Map<String, String> livros = new HashMap<>();

    @Override
    public void cadastrarLivro(String titulo, String autor, String isbn) {
        livros.put(isbn, "Título: " + titulo + ", Autor: " + autor);
        System.out.println("Livro cadastrado com sucesso: " + titulo);
    }

    @Override
    public void emprestarLivro(String isbn) {
        if (livros.containsKey(isbn)) {
            System.out.println("Livro emprestado: " + livros.get(isbn));
        } else {
            System.out.println("Livro com ISBN " + isbn + " não encontrado.");
        }
    }

    @Override
    public void devolverLivro(String isbn) {
        if (livros.containsKey(isbn)) {
            System.out.println("Livro devolvido: " + livros.get(isbn));
        } else {
            System.out.println("Livro com ISBN " + isbn + " não encontrado.");
        }
    }

    @Override
    public void buscarLivro(String isbn) {
        if (livros.containsKey(isbn)) {
            System.out.println("Informações do livro: " + livros.get(isbn));
        } else {
            System.out.println("Livro com ISBN " + isbn + " não encontrado.");
        }
    }
}
//***************************************** */
public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new BibliotecaImpl();

        // Cadastrar livros
        biblioteca.cadastrarLivro("O Senhor dos Anéis", "J.R.R. Tolkien", "12345");
        biblioteca.cadastrarLivro("Dom Casmurro", "Machado de Assis", "67890");

        // Buscar livros
        biblioteca.buscarLivro("12345");

        // Emprestar e devolver livros
        biblioteca.emprestarLivro("12345");
        biblioteca.devolverLivro("12345");

        // Tentar buscar livro que não existe
        biblioteca.buscarLivro("00000");
    }
}