package Funcionarios;

public abstract class Funcionario {
    private double pagamento;
    public Funcionario(){
        this.pagamento = 1500;
    }
    public double getPagamento() {
        return this.pagamento;
    }
    public abstract double calcularPagamento();
}
interface Bonus{
    double calcularBonus(double bonus);
}
