@FunctionalInterface
interface Square{
    double calculate(double a);
}
public class CALC_Main
{
	public static void main(String[] args) {
	    Square quadrado = (a) -> a*a;
		System.out.println("Quadrado: "+ quadrado.calculate(5));
	}
}