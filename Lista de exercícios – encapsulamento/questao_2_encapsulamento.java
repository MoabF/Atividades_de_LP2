import java.util.Scanner;
class Retangulo{
    private int altura;
    private int largura;
    public Retangulo(){
        this.altura = 0;
        this.largura = 0;
    }
    public void setAltura(int a){
        this.altura = a;
    }
    public void setLargura(int l){
        this.largura = l;
    }
    public int getAltura(){
        return this.altura;
    }
    public int getLargura(){
        return this.largura;
    }
    public int area(){
        return (this.largura*this.altura);
    }
    public int perimetro(){
        return ((this.largura*2) + (this.altura*2));
    }
}
public class questao_1_encapsulamento{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int alt = 0; int larg = 0;
        Retangulo retangulo = new Retangulo();
        System.out.println("Digite a altura do retângulo:");
        alt = entrada.nextInt();
        System.out.println("Digite a largura do retângulo:");
        larg = entrada.nextInt();
        retangulo.setAltura(alt);
        retangulo.setLargura(larg);
        System.out.println("A altura do retângulo é: " + retangulo.getAltura() +
                            "\nA largura do retângulo é: "+ retangulo.getLargura());
        entrada.close();
    }
}