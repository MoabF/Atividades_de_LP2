public class personagem{
  public int tipo_de_bigode = 0; //(0,1 ou 2)
  public String cor_da_roupa = ""; 
  public personagem(String tipo_personagem){
		if(tipo_personagem.equals("mario")){
        tipo_de_bigode = 1;
        cor_da_roupa = "vermelho"; 
      }
    else if(tipo_personagem.equals("luigi")){
      tipo_de_bigode = 2;
      cor_da_roupa = "verde"; 
    }

  }
}

