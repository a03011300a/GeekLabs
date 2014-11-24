/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chardiff;
import java.util.*;
/**
 *
 * @author Kornel
 */
public class CharDiff { 
   
public int Count(String str1,String str2){
        int n = 0;
        int x = 0;
   if(str1.length()==str2.length())
   {
        for (n=0; n<str1.length(); n++)
        {
            
    if (str1.charAt(n)!=str2.charAt(n))
    {
            x++;
    }
            }
                System.out.println(x);
                return x;
        }   
   
   else
   {
       System.out.println("Różne długości wyrazów.");
	   return x;
   }
   
}


    public static void main(String[] args) {
        // TODO code application logic here
   Scanner scan = new Scanner(System.in);
   System.out.println("Podaj pierwszy wyraz:");
    String str1 = scan.nextLine();
    System.out.println("Podaj drugi wyraz:");
    String str2 = scan.nextLine();
    CharDiff chardiff1 = new CharDiff();
   System.out.println("Liczba różniących się liter:");
    chardiff1.Count(str1,str2);
   
    }
    
}
