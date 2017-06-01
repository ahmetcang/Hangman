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
import java.util.Scanner;



public class hangManProject
{
    public static void main( String[] args) 
    {
        Scanner scan = new Scanner( System.in);

                

       
        int totalMistake = 0;
        boolean b = false;
        
        
        showWelcome();
        SecretWord word = new SecretWord();
        System.out.println("İpucu: " + word.getClue());
        KeyboardInput input = new KeyboardInput();
        while (totalMistake < 4 && !word.isSolved())
        {
            System.out.println(word);
            char c = input.getNewLetter();
            if (!word.update(c))
                totalMistake = totalMistake + 1 ;
        }
        if (word.isSolved())
            System.out.println("Tebrikler.");
        else
            System.out.println("Adam asıldı.");
       
    }
        
        public static void showWelcome()
        {
            System.out.println( "Adam asmacaya hoşgeldiniz :)" );
        }
        
}








