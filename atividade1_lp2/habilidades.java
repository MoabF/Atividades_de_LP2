public class habilidades{
	public boolean flame = false;
	public boolean yoshi = false;
  	public boolean mushroom = false;
	public void states_habilidades(boolean fogo, boolean yosh, boolean cogumelo){
	if(fogo == true){
		flame = true;
  	}
  	else{
	  flame = false;  
	  }
	if(yosh == true){
			yoshi = true;
	  }
	else{
	  yoshi = false;
	  }
	
	if(cogumelo == true){
		mushroom = true;
	  }
	else{
	    mushroom  = false;
	  }
	
	  }	
}

