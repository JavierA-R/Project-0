import java.util.Scanner;
public class Project0
{
   public static void main(String[] args)
   {
      Scanner kb = new Scanner(System.in);
      boolean statement = true; 
      int palCount = 0;
      
      while(statement)
      {   
         System.out.println("Enter a word, phrase, or sentence "
                             + "(blank line to stop): ");
         String input = kb.nextLine().toLowerCase(); 
         if(input.equals(""))
         {
            statement = false; 
            continue; 
         }
         
         boolean test = true; 
         String newInput = ""; 
         for(int i=0; i<input.length(); i++)
         {
            if(input.charAt(i) >= 'a' && input.charAt(i) <= 'z')
               newInput += input.charAt(i);
         }
         for(int j=0; j<newInput.length(); j++)
         {
            if(newInput.charAt(j) 
               != newInput.charAt(newInput.length()-j-1))  
            {
               System.out.println("Not a palindrome.\n");
               test = false; 
               break;
            }
         }
         if(test)
         {
            System.out.println("palindrome\n");
            palCount++;
         } 
      }
      System.out.println("You found " + palCount+ " palindromes.\n"
                          + "Thank you for using PalindromeTester.");
   }
}