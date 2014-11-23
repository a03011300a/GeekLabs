/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chardiff;

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
            if(str1.length()==str2.length())
            {
    if (str1.charAt(n)!=str2.charAt(n))
    {
            x++;
    }
            }}
                System.out.println(x);
                return x;
        }   
   
   else
   {
       System.out.println("Różne długości wyrazów.");
   }
   return x;
}


    public static void main(String[] args) {
        // TODO code application logic here
   CharDiff chardiff1 = new CharDiff();
   chardiff1.Count("POLSKA","ABCDEF");
   
    }
    
}
