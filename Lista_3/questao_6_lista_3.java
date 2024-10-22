public class questao_6_lista_3 {
    public static void main(String[] args) {
        int[][] matriz = new int[5][5];
        for(int linha = 0; linha<5; linha++){
			for(int coluna = 0; coluna < 5; coluna++){
                if(linha == coluna){
                    matriz[linha][coluna] = 1;
                }
                else{
                    matriz[linha][coluna] = 0;
                }
            }
        }
        for(int linha = 0; linha<5; linha++){
			for(int coluna = 0; coluna < 5; coluna++){
				  System.out.printf(" %d ", matriz[linha][coluna]);
			}
				System.out.println("");
		}
    }
}
