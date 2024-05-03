package Programa1;
import java.util.Scanner;

public class Palindrome{
    
    public static boolean isPalindrome(String word){
        if (word.isEmpty()){
            return true;
        }

        int firstP = 0, secondP = word.length() - 1;

        while (firstP <= secondP){
            char currFirstC = word.charAt(firstP);
            char currLastC = word.charAt(secondP);
            
            if(!Character.isLetterOrDigit(currFirstC)){
                firstP++;
            }else if(!Character.isLetterOrDigit(currLastC)){
                secondP--;
            }else{
                if(Character.toLowerCase(currFirstC) != Character.toLowerCase(currLastC)){
                    return false;
                }
                firstP++;
                secondP--;
            }
        }
        return true;
    }
    public static void main(String[] args){
        String palindrome;
        boolean isPad;
        Scanner scanner = new Scanner(System.in);
      
        System.out.println("\nIntroduzca la palabra u oracion: ");
        palindrome = scanner.nextLine();
        scanner.close();

        isPad = isPalindrome(palindrome);

        if (isPad){
            System.out.println("\nLa palabra que ingreso es palindromo\n");
        }else{
            System.out.println("\nLa palabra que ingreso no es palindromo \n");
        }
    }
}