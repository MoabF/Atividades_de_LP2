package Pagamentos;

public class PIX extends Pagamento implements Autenticacao {
    @Override
    public void realizarPagamento() {
        System.out.println("Pagamento com PIX realizado.");
    }

    @Override
    public void autenticar() {
        System.out.println("PIX autenticado.");
    }
}

