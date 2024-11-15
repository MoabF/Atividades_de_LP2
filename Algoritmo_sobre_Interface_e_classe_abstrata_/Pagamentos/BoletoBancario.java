package Pagamentos;

public class BoletoBancario extends Pagamento implements Autenticacao {
    @Override
    public void realizarPagamento() {
        System.out.println("Pagamento com boleto bancário realizado.");
    }

    @Override
    public void autenticar() {
        System.out.println("Boleto bancário autenticado.");
    }
}

