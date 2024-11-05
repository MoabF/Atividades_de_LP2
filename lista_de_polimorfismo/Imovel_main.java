import java.util.Scanner;
class Imovel{
    private String endereco;
    private int preco;
    
    public Imovel(){
        this.endereco = "";
        this.preco = 0;
    }
    public Imovel(String end, int pre){
        this.endereco = end;
        this.preco = pre;
    }
    public String getEndereco(){
       return this.endereco;
    }
    public int getPreco(){
       return this.preco;
    }
    public void setEndereco(String end){
       this.endereco = end;
    }
    public void setPreco(int pre){
       this.preco = pre;
    }
}
class Novo extends Imovel{
    private int adicional;

    public Novo(String endereco, int preco, int adicional) {
        super(endereco, preco+adicional);
        this.adicional = adicional;
    }
    public int getAdicional(){
       return this.adicional;
    }
    public void setAdicional(int adicional){
       this.adicional = adicional;
    }
} 
class Velho extends Imovel{
    private int desconto;

    public Velho(String endereco, int preco, int desconto) {
        super(endereco, preco-desconto);
        this.desconto = desconto;
    }
    public int getDesconto(){
       return this.desconto;
    }
    public void setDesconto(int desconto){
       this.desconto = desconto;
    }
} 

public class Imovel_main
{
	public static void main(String[] args) {
	    Scanner entrada = new Scanner(System.in);
		System.out.println("O Imovel que deseja cadastrar é novo ou velho?\n1-Novo\n2-Velho");
		int tipocarro = entrada.nextInt();
		System.out.println("Qual o preço do Imovel?");
		int preco = entrada.nextInt();
		entrada.nextLine();
		System.out.println("Qual o endereço do Imovel?");
		String end = entrada.nextLine();
		if(tipocarro == 1){
		    System.out.println("Qual o valor adicional do Imovel?");
		    int adicional = entrada.nextInt();
		    Novo carronovo = new Novo(end, preco, adicional);
		    System.out.println("O imóvel de localização " + carronovo.getEndereco() + 
		                        ", com preço "+  carronovo.getPreco()+ 
		                        ", cujo houve um acréscimo de "+  carronovo.getAdicional()
		                        +" foi adicionado com sucesso!");
		}
		else if(tipocarro == 2){
		    System.out.println("Qual o valor do desconto do Imovel?");
		    int desconto = entrada.nextInt();
		    Velho carrovelho = new Velho(end, preco, desconto);
		    System.out.println("O imóvel de localização " + carrovelho.getEndereco() + 
		                        ", com preço "+  carrovelho.getPreco()+ 
		                        ", cujo houve um acréscimo de "+  carrovelho.getDesconto()
		                        +" foi adicionado com sucesso!");
		}
		entrada.close();
	}
}
