import java.util.ArrayList;
 
public class Test {
 
  public static void fonction(){
         
    ArrayList al = new ArrayList();
    al.add(12);
    al.add("Une chaîne de caractères !");
    al.add(12.20f);
    al.add('d');
                
    for(int i = 0; i < al.size(); i++)
    {
      System.out.println("donnée à l'indice " + i + " = " + al.get(i));
    }               
  }
}