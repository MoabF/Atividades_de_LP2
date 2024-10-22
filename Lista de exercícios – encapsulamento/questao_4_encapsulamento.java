import java.util.Scanner;
class Triangulo_Retangulo{
    private int catetoaltura;
    private int catetolargura;
    private float hipotenusa;
    public Triangulo_Retangulo(){
        this.catetoaltura = 0;
        this.catetolargura = 0;
    }
    public void setCatetoAltura(int a){
        this.catetoaltura = a;
    }
    public void setCatetoLargura(int l){
        this.catetolargura = l;
    }
    public int getCatetoAltura(){
        return this.catetoaltura;
    }
    public int getCatetoLargura(){
        return this.catetolargura;
    }
    public int setHipotenusa(){
        this.hipotenusa = this.altura 
    }
}
public class questao_4_encapsulamento{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int alt = 0; int larg = 0;
        Triangulo_Retangulo trianguloretangulo = new Triangulo_Retangulo();
        System.out.println("Digite o cateto altura do triângulo retângulo:");
        alt = entrada.nextInt();
        System.out.println("Digite o cateto largura do triângulo retângulo:");
        larg = entrada.nextInt();
        trianguloretangulo.setCatetoAltura(alt);
        trianguloretangulo.setCatetoLargura(larg);
        System.out.println("O cateto altura do triângulo retângulo é: " + trianguloretangulo.getCatetoAltura() +
                            "\nO cateto largura do triângulo retângulo é: "+ trianguloretangulo.getCatetoLargura());
        entrada.close();
    }
}