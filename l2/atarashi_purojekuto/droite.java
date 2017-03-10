import java.util.*;

// get(i) permet de recupérer le iemme element de la liste
public class droite
{
       private List<point> Droite;
       private String name;
 

    public droite(point p1,point p2,String name)
    {
        this.name=name;
        this.Droite = new ArrayList<point>();
        Droite.add(p1);
        Droite.add(p2);
    }
    
    public String getName(){
        return this.name;
    }
    
    public boolean add_point_dans_droite(point p1){
        
        return this.Droite.add(p1);
        
    }
    public String all_name(){
        
        String all_name="";
        for (int i=0;i<this.Droite.size();i++){
            all_name += this.Droite.get(i).getName() +" ";
        }
        
        /*
        for(Droite d : this.Droite){
            all_name += d.getName()+ " ";
        }
        return all_name;
        */
        
        
        
        
        
        return all_name;
        
    }

    
}
