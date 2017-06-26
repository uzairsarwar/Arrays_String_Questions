// package whatever; // don't place package name!

import java.io.*;
import java.util.*;

class Questions
{
    static boolean flag = false;
    public static void main (String[] args) throws java.lang.Exception
    {   
        //Palindrome Combination Java
        String str = "";
       
        int oddValue = 0;
        char[] char_array = str.toCharArray();

        System.out.println("The Given String is : " + str);

    Map<Character, Integer> charCounter = new HashMap<Character, Integer>();

        for (char i : char_array) {

    charCounter.put(i,charCounter.get(i) == null ? 1 : charCounter.get(i) + 1);
        }

    if(str.length()% 2==0)
    {
        for(Character key : charCounter.keySet())
      {
                  if(charCounter.get(key)%2!=0)
                  {
                      flag = false;
                      break;
                  }
                  else if(charCounter.get(key)%2==0)
                  {
                      flag = true;
                  }
        }
    }
        else
        {
            for(Character key : charCounter.keySet())
            {
                if(charCounter.get(key)%2!=0)
                {
                    oddValue++;
                }
            }
              
        }
        
         if(flag == false && str.length()%2==0)
             System.out.println("The Given String is Not a Palindrome");
        else if(oddValue>1)
        {
            System.out.println("The Given String is Not a Palindrome"); 
        }
        else
        {
            System.out.println("The Given String is a Palindrome");
        }
                   
            
      }
          
    
    }

        
             
          
                                
        
      
