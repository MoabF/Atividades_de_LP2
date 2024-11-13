public abstract class Pagamento {
    public abstract void realizarPagamento();
}

interface Autenticacao {
    void autenticar();
}

class CartãoCrédito extends Pagamento implements Autenticacao {
    @Override
    public void realizarPagamento() {
        System.out.println("Pagamento com cartão de crédito realizado.");
    }

    @Override
    public void autenticar() {
        System.out.println("Cartão de crédito autenticado.");
    }
}

class BoletoBancario extends Pagamento implements Autenticacao {
    @Override
    public void realizarPagamento() {
        System.out.println("Pagamento com boleto bancário realizado.");
    }

    @Override
    public void autenticar() {
        System.out.println("Boleto bancário autenticado.");
    }
}

class PIX extends Pagamento implements Autenticacao {
    @Override
    public void realizarPagamento() {
        System.out.println("Pagamento com PIX realizado.");
    }

    @Override
    public void autenticar() {
        System.out.println("PIX autenticado.");
    }
}
