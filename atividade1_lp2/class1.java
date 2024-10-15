public class class1{
  public String record_name_1 = "";
  public String record_name_2 = "";
  public String record_name_3 = "";
  public int record_1 = 0;
  public int record_2 = 0;
  public int record_3 = 0;
  public void record_positions(int record, String record_name){
    int record_aux = 0;
    String record_name_aux = null;

    if(record >= record_3){
      record_3 = record;
      record_name_3 = record_name;
      }
    if(record_3 > record_2){
      record_name_aux = record_name_2;
      record_name_2 = record_name_3;
      record_name_3 = record_name_aux;
      record_aux = record_2;
      record_2 = record_3;
      record_3 = record_aux;
    }
    if(record_2 > record_1){
      record_name_aux = record_name_1;
      record_name_1 = record_name_2;
      record_name_2 = record_name_aux;
      record_aux = record_1;
      record_1 = record_2;
      record_2 = record_aux;
    }
  }

  public void erase(){
    record_name_1 = "";
    record_name_2 = "";
    record_name_3 = "";
    record_1 = 0;
    record_2 = 0;
    record_3 = 0;
  }
}
  
