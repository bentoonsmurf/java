

public class non_exeption extends Exception
{
    private final String nom;
    
    public non_exeption(String nom){
        super("non_exeption"+nom);
        this.nom=nom;
        
    }
    public final String getnom(){
        return this.nom;
    }
}
