@FunctionalInterface
interface Operacao{
    int executar(int a, int b);
}
public class CALC_LAMBDA
{
	public static void main(String[] args) {
	    Operacao soma = (a,b) -> a+b;
	    Operacao multiplicacao = (a,b) -> a*b;
	    Operacao divisao = (a,b) -> a/b;
	    Operacao subtracao = (a,b) -> a-b;
		System.out.println("SOMA: "+ soma.executar(5,3));
		System.out.println("SUBTRAÇÃO: "+ subtracao.executar(5,3));
		System.out.println("DIVISÃO: "+ divisao.executar(5,3));
		System.out.println("MULTIPLICAÇÃO: "+ multiplicacao.executar(5,3));
	}
}