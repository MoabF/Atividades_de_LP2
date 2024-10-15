public void status{
  public int coins = 0;
  public int star = 0;
  public int score = 0;
  public void moedas_ganhas(moedas){
  		coins = coins + moedas;
  }
  public void estrelas_totais(estrelas){
  	star = star + estrelas;
  }
  public void score_ganho(pontuacao){
  	score = score + pontuacao;
  }
}
