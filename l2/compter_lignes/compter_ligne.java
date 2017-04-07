import java.io.*;

/**
 * Write a description of class compter_ligne here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class compter_ligne
{
    public static void main(String[] args)throws IOException{
        FileInputStream in = null;
        FileOutputStream out=null;
        try {
            in=new FileInputStream("fichier_in.txt");//args[0]);
            out=new FileOutputStream("fichier_out.txt");
            int c=0;
            int li=1;
            while((c=in.read())!=-1 ){
                out.write(c);
                if (c==(int)'\n')li=li+1;
            }
           
            System.out.println(li);
            
        }
        finally{
            if(in!=null)in.close();
            if(out!=null)out.close();
            
        }
    }
}
