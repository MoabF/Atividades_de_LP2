// Classe Pessoa
class Pessoa {
    private String nome;
    private int idade;
    private double salario;

    public Pessoa(String nome, int idade, double salario) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

   
}

// Interface funcional para aplicar desconto
@FunctionalInterface
interface Desconto {
    double aplicar(Pessoa pessoa);
}

public class Loja {
    public static void main(String[] args) {
        // Lista de pessoas
        Pessoa[] pessoas = new Pessoa[5];
        pessoas[0] = new Pessoa("Alice", 55, 3500.0);
        pessoas[1] = new Pessoa("Bruno", 34, 4250.0);
        pessoas[2] = new Pessoa("Carla", 27, 2550.0);
        pessoas[3] = new Pessoa("Daniel", 75, 5700.0);
        pessoas[4] = new Pessoa("Paula", 20, 1500.0);
        
        
        Desconto desconto = pessoa -> pessoa.getSalario() > 3000 ? pessoa.getSalario() * 0.9 : pessoa.getSalario();
       // pessoas.forEach(pessoa -> pessoa.setSalario(desconto.aplicar(pessoa)));

        System.out.println("\nPessoas após aplicação de desconto:");
    }
}
