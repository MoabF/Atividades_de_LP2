import java.util.Scanner;
class Ingresso{
    private int preco;
    
    public Ingresso(){
        this.preco = 50;
    }
    public int getPreco(){
       return this.preco;
    }
    public void setPreco(int pre){
       this.preco = pre;
    }
    public void imprimeValor() {
        System.out.println("Valor do ingresso: R$ " + preco);
    }
}
class VIP extends Ingresso{
    private int adicional;

    public VIP() {
        super();
        this.adicional = 25;
    }
    public int getAdicional(){
       return this.adicional;
    }
    public void setAdicional(int adicional){
       this.adicional = adicional;
    }
     public int getValorVIP() {
        return getPreco() + this.adicional;
    }
    @Override
    public void imprimeValor() {
        System.out.println("Valor do ingresso VIP: R$ " +  getValorVIP());
    }
} 
class Normal extends Ingresso{
    public Normal(){
        super();
    }
    @Override
    public void imprimeValor() {
        System.out.println("Ingresso Normal");
        super.imprimeValor();
    }
} 
class CamaroteInferior extends VIP{
    private String endereco;
    public CamaroteInferior(String endereco){
        super();
        this.endereco = endereco;
    }
     public String getEndereco() {
        return this.endereco;
    }
    public void setEndereco(String localizacao) {
        this.endereco = endereco;
    }
    public void imprimeEndereco() {
        System.out.println("Endereço do ingresso: " + this.endereco);
    }
}
class CamaroteSuperior extends VIP {
    private double valorAdicionalSuperior;

    public CamaroteSuperior() {
        super();
        this.valorAdicionalSuperior = 25;
    }
    public double getValorCamaroteSuperior() {
        return getValorVIP() + valorAdicionalSuperior;
    }
    
    @Override
    public void imprimeValor() {
        System.out.println("Valor do ingresso Camarote Superior: R$ " + getValorCamaroteSuperior());
    }
}
public class Ingresso_main
{
	public static void main(String[] args) {
	  Normal ingressoNormal = new Normal();
        ingressoNormal.imprimeValor();
        System.out.println("ingresso VIP");
        VIP ingressoVIP = new VIP();
        ingressoVIP.imprimeValor();
        System.out.println("Camarote Inferior");
        CamaroteInferior camaroteInferior = new CamaroteInferior("IMD");
        camaroteInferior.imprimeValor();
        camaroteInferior.imprimeEndereco();
        System.out.println("Camarote Superior");
        CamaroteSuperior camaroteSuperior = new CamaroteSuperior();
        camaroteSuperior.imprimeValor();
	}
}
