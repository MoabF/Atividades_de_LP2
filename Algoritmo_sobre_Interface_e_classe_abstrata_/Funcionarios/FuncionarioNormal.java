package Funcionarios;
public class FuncionarioNormal extends Funcionario implements Bonus{
    public FuncionarioNormal() {
        super();
    }
    @Override
    public double calcularPagamento(){
        return this.getPagamento();
    }
    @Override
    public double calcularBonus(double bonus){
        return this.calcularPagamento() * bonus;
    }
}
