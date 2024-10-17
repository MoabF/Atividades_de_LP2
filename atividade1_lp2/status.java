public class status{
  public int coins = 0;
  public int star = 0;
  public int score = 0;
  public void moedas_ganhas(int moedas){
  		coins = coins + moedas;
  }
  public void estrelas_totais(int estrelas){
  	star = star + estrelas;
  }
  public void score_ganho(int pontuacao){
  	score = score + pontuacao;
  }
}
