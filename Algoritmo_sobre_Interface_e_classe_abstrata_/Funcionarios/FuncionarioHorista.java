package Funcionarios;
public class FuncionarioHorista extends Funcionario implements Bonus{
    private int horasTrabalhadas;
    private double valorPorHora;
    public FuncionarioHorista(int horasTrabalhadas) {
        super();
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorPorHora = 5.0d;
    }
    @Override
    public double calcularPagamento(){
        return this.horasTrabalhadas * this.valorPorHora;
    }
    @Override
    public double calcularBonus(double bonus){
        return this.calcularPagamento() * bonus;
    }
}
