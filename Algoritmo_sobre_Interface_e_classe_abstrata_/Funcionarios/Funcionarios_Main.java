package Funcionarios;
public class Funcionarios_Main {
    public static void main(String[] args) {
        FuncionarioHorista horista = new FuncionarioHorista(160); 
        FuncionarioNormal assalariado = new FuncionarioNormal(); 

        System.out.println("Funcionário Horista - Pagamento: R$" + horista.calcularPagamento());
        System.out.println("Funcionário Horista - Bônus: R$" +  horista.calcularBonus(0.5));

        System.out.println("Funcionário Assalariado - Pagamento: R$" + assalariado.calcularPagamento());
        System.out.println("Funcionário Assalariado - Bônus: R$" + assalariado.calcularBonus(0.4));
    }
}
