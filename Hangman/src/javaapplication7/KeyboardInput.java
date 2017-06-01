/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;

/**
 *
 * @author Ahmetcan
 */



import java.util.ArrayList;
import java.util.Scanner;

public class KeyboardInput
{   
   
    ArrayList<String> keyList ; 
    boolean chosen;
    
     
    public KeyboardInput()
    {
        keyList = new ArrayList<String>();
    }
    
   
    public void keyChosen( String key )
    {
        keyList.add( key );
    }
    
    
    public boolean hasBeenChosen( String key)
    {
        chosen = keyList.contains( key );
        return chosen;
    }
    
    
    public char getNewLetter() 
    {
        Scanner scan=new Scanner( System.in);
    
        char a;
        boolean chosen;
        String aTmp;    
        
        do
        {   
            System.out.println("Harf giriniz");
            a = scan.next().charAt( 0); 
            aTmp = "" + a;
            chosen = hasBeenChosen( aTmp);
            if(!chosen)
                keyChosen( aTmp);
            else
            {   
                System.out.println("Az önce kullandınız.Lütfen yeni bir harf giriniz.");
                
            }
            
                        
        }
       
        while(chosen);
        
        return a;  
    }
}

