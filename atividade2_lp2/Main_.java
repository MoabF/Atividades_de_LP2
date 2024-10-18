package atividade2_lp2;

import java.util.Scanner;

class ContaBancaria {
    private Cliente cliente;
    private double saldo;

    // Construtor
    public ContaBancaria(Cliente cliente) {
        this.cliente = cliente;
        this.saldo = 0.0;
    }

    // Método para depósito
    public void depositar(double valor) {
        if (valor > 0) {
            saldo = saldo + valor;
            System.out.println("Depósito realizado com sucesso.");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    // Método para saque
    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo = saldo - valor;
            System.out.println("Saque realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente ou valor de saque inválido.");
        }
    }
    public double getSaldo() {
        return saldo;
    }
}

class Cliente {
    private String nome;
    private String cpf;

    // Construtor
    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    // Getters e setters (opcional, se precisar acessar os atributos externamente)
    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }
}


public class Main_ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome_do_cliente = "";
        String cpf = "";
        int operacao = 0;
        float valor = 0.0f;
        System.out.println("Digite o nome do cliente:");
        nome_do_cliente = scanner.nextLine();
        System.out.println("Digite o cpf do cliente:");
        cpf = scanner.nextLine();

        Cliente cliente = new Cliente(nome_do_cliente, cpf);
        ContaBancaria conta = new ContaBancaria(cliente);
        System.out.println("Olá, " + cliente.getNome() + "!\n" +
                            "Escolha a operação que você deseja realizar:\n"+
                            "1 - Ver o saldo \n2 - Sacar dinheiro \n3 - Depositar dinheiro\n4 - Sair");
        operacao = scanner.nextInt();
        while (operacao != 4) {
            switch (operacao) {
                case 1:
                System.out.println("Saldo atual: R$" + conta.getSaldo());
                    break;
                case 2:
                System.out.println("Saldo atual: R$" + conta.getSaldo());
                System.out.println("Digite o valor que deseja sacar:");
                valor = scanner.nextFloat();
                conta.sacar(valor);
                System.out.println("Saldo atual: R$" + conta.getSaldo());
                    break;
                case 3:
                System.out.println("Saldo atual: R$" + conta.getSaldo());
                System.out.println("Digite o valor que deseja depositar:");
                valor = scanner.nextFloat();
                conta.depositar(valor);
                System.out.println("Saldo atual: R$" + conta.getSaldo());
                    break;
                default:
                    break;
            }
            System.out.println("Escolha a operação que você deseja realizar:\n"+
            "1 - Ver o saldo \n2 - Sacar dinheiro \n3 - Depositar dinheiro\n4 - Sair");
            operacao = scanner.nextInt();
        }
        
        scanner.close();
    }
}