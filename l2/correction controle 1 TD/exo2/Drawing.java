
import java.util.ArrayList;


public class Drawing
{
   
    private String name;
    private ArrayList<Circle> listCirle;

    /**
     * Constructor for objects of class Drawing
     */
    public Drawing(String name)
    {
       this.name = name;
       this.listCirle = new ArrayList<Circle> ();
    }
    
    
     public boolean addCircle(Circle c)
    {        
        if (c != null)
       { this.listCirle.add(c);
        return true;
    }
        return false;
    
    }
    
    public String displayNameCircles()
    {        
        
        String circlesNames = "";
        
         for(int i =0; i< this.listCirle.size(); i++)
        {
        
        circlesNames += this.listCirle.get(i).getName() + " ";
        
        
        }
        
        return circlesNames;
      
    }
}
