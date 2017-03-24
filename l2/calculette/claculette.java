import java.io.*;
import java.nio.file.*;
import java.util.List;
import java.nio.charset.Charset;
import java.util.Scanner;



public class claculette
{
   public static void ecrire(){
       System.out.println("entrer un chifre  ");
       Scanner sca = new Scanner(System.in);
       String chifre1 = sca.nextLine();
       
       String test ="continue";
       String operateur="rien";
       while (test=="continue"){
           System.out.println("entrer un operateur  ");
           Scanner sca2 = new Scanner(System.in);
           operateur = sca2.nextLine();
           if(operateur.equals("x") || operateur.equals("+") || operateur.equals("/") || operateur.equals("-") || operateur.equals("*")){
               test = "stop";
               System.out.println(test);
            }
        }
       System.out.println("entrer un deuxiemme chifre  ");
       Scanner sca3 = new Scanner(System.in);
       String chifre2 = sca3.nextLine();
 
       System.out.println(chifre1 +" "+ operateur +" "+ chifre2);
       
    }   
    public claculette()
    {
        
    }

}
