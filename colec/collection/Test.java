import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
 
public class Test {
 
  public void fonction(){
    List l = new LinkedList();
    l.add(12);
    l.add("toto ! !");
    l.add(12.20f);

    for(int i = 0; i < l.size(); i++)
      System.out.println("Élément à l'index " + i + " = " + l.get(i));
  }
}