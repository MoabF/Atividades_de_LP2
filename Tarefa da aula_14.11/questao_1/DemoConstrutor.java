public class DemoConstrutor {
    private int a,b;
    public DemoConstrutor(){
        System.out.println("No construtor sem argumentos...");
        /*Aqui era realizada a chamada de outro construtor dentro do construtor sem argumentos,
         acredito que esse era o erro.
         */
        a = 0; b = 0;
    }
    public DemoConstrutor(int xa, int xb){
        System.out.println("No construtor com argumentos...");
        a = xa; b = xb;
    }
}
