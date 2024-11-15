package Pagamentos;

public class CartaoCredito extends Pagamento implements Autenticacao {
    @Override
    public void realizarPagamento() {
        System.out.println("Pagamento com cartão de crédito realizado.");
    }
    
    @Override
    public void autenticar() {
        System.out.println("Cartão de crédito autenticado.");
    }
}
