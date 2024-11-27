import java.util.*;
import java.util.stream.Collectors;

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
        pessoa[0] = new Pessoa("Alice", 25, 3000.0),
        pessoa[1] = new Pessoa("Bruno", 30, 4000.0),
        pessoa[2] = new Pessoa("Carla", 20, 2500.0),
            new Pessoa("Daniel", 35, 5000.0)
        
        
        Desconto desconto = pessoa -> pessoa.getSalario() > 3000 ? pessoa.getSalario() * 0.9 : pessoa.getSalario();
        pessoas.forEach(pessoa -> pessoa.setSalario(desconto.aplicar(pessoa)));

        System.out.println("\nPessoas após aplicação de desconto:");
        pessoas.forEach(System.out::println);
    }
}
