import java.util.HashSet;
import java.util.Iterator;
 
public class Test { 
  public static void fonction(){         
    HashSet hs = new HashSet();
    hs.add("toto");
    hs.add(12);
    hs.add('d');

    Iterator it = hs.iterator();
    while(it.hasNext())
      System.out.println(it.next());
 
    System.out.println("\nParcours avec un tableau d'objet");
    System.out.println("-----------------------------------");
                
    Object[] obj = hs.toArray();
    for(Object o : obj)
      System.out.println(o);                
  }
}

/*
 
add() ajoute un élément ;
contains(Object value) retourne « vrai » si l'objet contient value ;
isEmpty() retourne « vrai » si l'objet est vide ;
iterator() renvoie un objet de type Iterator ;
remove(Object o) retire l'objet o de la collection ;
toArray() retourne un tableau d'Object.
 
 */