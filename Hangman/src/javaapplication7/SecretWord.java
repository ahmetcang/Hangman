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
public class SecretWord
{
    String clue, visible, secret;

public SecretWord()
{
    String [] wordList = { "ihanet", "aziz sancar", "metin oktay", "orhan pamuk" };
    
    String [] clueList = { "Sezen Aksu'nun yeni albümü.", "Nobel kimya ödülü sahibi", "Galatasaray'ın efsane futbolcusu", "Nobel ödüllü yazar" };
    int rand;
    rand = (int) (Math.random()*4);
    secret = wordList[rand];
    clue = clueList[rand];
    int wordLength = secret.length();
    
    visible = "";
   
    for ( int i = 0; i < secret.length(); i++)
    {
        char c = secret.charAt(i);
        
        if ( c == ' ' )
            visible += c;
        else
            visible += '_';
    }
}

public String getClue()
{
    return clue;
}

public String toString()
{
   
    
    return visible;
}

    
    public boolean update(char c)
    {
        char[] secretArray = new char [secret.length()];
        char[] visibleArray = new char [secret.length()];
        String s = "";
        boolean contains = false ;
        
        
        for(int i = 0; i < secret.length(); i++)
        {
            secretArray[i] = secret.charAt(i);
            visibleArray[i] = visible.charAt(i);
        }
        
       
        for(int k = 0; k < secret.length();k++)
        {
            
            if(secretArray[k] == c)
            {
                visibleArray[k] = c;
                contains = true;
            }
        }
      
        for(int m=0; m < secret.length(); m++ )
        {
            s = s + visibleArray[m];
        }
        visible = s;
        
        return contains;
   }
   
    public boolean isSolved()
    {   
        return secret.equalsIgnoreCase(visible);
    }
}
