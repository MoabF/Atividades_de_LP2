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
    public double calcularBonus(float bonus){
        return this.calcularPagamento() * bonus;
    }
}
