public class personagem{
  public int tipo_de_bigode = null (0,1 ou 2);
  public string cor_da_roupa = null; 
  public personagem(tipo_personagem){
		if(tipo_personagem == “mario”){
        tipo_de_bigode = 1;
        cor_da_roupa = vermelho; 
      }
    else if(tipo_personagem == “luigi”){
      tipo_de_bigode = 2;
      cor_da_roupa = verde; 
    }

  }
}

