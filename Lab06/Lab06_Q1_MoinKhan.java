// Author : Moin Khan
// A program to convert a alphabet only string to soundex code using several methods that are created.
import java.util.Scanner;

public class Lab06_Q1_MoinKhan {
    /** * This method check whether a string is only alphabet or not.
     * @param s and its a String that will be checked if its alphabet or not.
     * @return flag and its a boolean that will be true on false depending on string. 
     */
    public static boolean isAlphaWord(String s) {
        boolean flag = true;
            int length;
            length = s.length();
            for(int i =0; i<length; i++)
            {
                if(!((s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')))
                {
                    flag = false;
                }
               
               
            }
            return flag;
    }
    /** * This is a method to convert a character to a number according to rules.
     * @param c is a character that will be converted to a number according to given rules.
     * @return code is an alphabet converted to a number according to given rules.
     */
    public static int getCode(char c) {
        c = Character.toLowerCase(c);
        int code;
        if (c == 'b' || c == 'f' ||c == 'p' ||c == 'v')
        {
            code = 1;
        }
        else if (c == 'c' || c == 'g' || c == 'j' || c == 'k' || c == 'q' || c == 's' || c == 'x' || c == 'z' )
        {
            code = 2;
        }
        else if(c == 'd' || c == 't')
        {
            code = 3;
        }
        else if (c == 'l')
        {
            code = 4;
        }
        else if (c == 'm' || c == 'n')
        {
            code = 5;
        }
        else if (c == 'r')
        {
            code = 6;
        }
        else 
        {
            code = -1;
        } 
        return code;   
    }
    /** *This a method which convert a string into a code according to rules using getcode() method.
     * @param s1 is a string that will be converted into a code according to given rules.
     * @return newcode is the converted string into a code according to given rules.
     */
    public static String buildCode(String s1) {
        String newCode ="";
        for(int i = 1; i<s1.length(); i++)
        { 
            int code;
            code = getCode(s1.charAt(i));
            if (!(code == -1))
            {
                newCode = newCode + code;
            }
            else 
            {
                newCode = newCode + s1.charAt(i);
            }
        }
        
        return newCode;
    }
    /** * A method to remove adjav=cent duplicates from a string.
     * @param s2 is a string from which duplicate adjacent characters will be removed.
     * @return removedDuplicates is a string from which adjacent duplicates have been removed.
     */
    public static String removeAdjacentDuplicates(String s2) {
        String removedDuplicates = "";
        for(int i=0; i<s2.length()-1; i++)
        {
            if(Character.toLowerCase(s2.charAt(i)) != Character.toLowerCase(s2.charAt(i + 1)))
            {
                removedDuplicates = removedDuplicates + s2.charAt(i);
            }
         
        }
        removedDuplicates = removedDuplicates + s2.charAt(s2.length()-1);
        return removedDuplicates;
    }
    /** * A method which take two strings as parameter and remove letters of second string from first.
     * @param s3 is a string from which letters passed in second string will be removed.
     * @param s4 is a string which contains letters to be removed.
     * @return s3 is the string from which letters passed in second string s4 have been removed.
     */
    public static String removeLetters(String s3, String s4) {
        for(int i=0; i<s4.length(); i++)
        {
            String characterToRemove1 = "" + Character.toLowerCase(s4.charAt(i));
            String characterToRemove2 = "" + Character.toUpperCase(s4.charAt(i));
            s3 = s3.replaceAll(characterToRemove1, "");
            s3 = s3.replaceAll(characterToRemove2, "");
        }
        return s3;
    }
    /** * This is a method to check and change a string to have exactly four characters in it.
     * @param s5 is the string which will be checked and changed to make sure it have exactly 4 characters in it.
     * @return s5 is the string after making changes containing exactly 4 characters in it.
     */
    public static String padCode(String s5) {
        while (s5.length()<4)
        {
          s5 = s5 + "0"  ;
        }
        if(s5.length()>4)
        {
            s5 = s5.substring(0, 4);
        }
        return s5;
    }
    /** * A method which converts a string into soundex code.
     * @param s6 is the string that will be converted by the method into soundex code.
     * @return s7 is the string that have the converted code in it.
     */
    private static String getSoundex(String s6) {
        boolean f;
        String s7 = s6 ;
        String charactersToremove = "aeiouhwy";
        f = isAlphaWord(s6);
        if(f == true)
        {
            s7 = removeAdjacentDuplicates(s7);
            s7 = buildCode(s7);
            s7 = removeLetters(s7, charactersToremove);
            s7 = Character.toUpperCase(s6.charAt(0)) + s7;
            s7 = padCode(s7);
            s7 = s7 + "";

        }
        else if (f == false)
        {
            s7 = "";
        }
        return s7;
    }
    
    public static void main(String[] args) {  
        String stringToconvert;
        String mainString; 
       Scanner input = new Scanner(System.in);
       do
       {
        System.out.print("Enter a string: ");
        mainString = input.next();
        stringToconvert = mainString;
        stringToconvert = getSoundex(stringToconvert);
        if (stringToconvert.compareToIgnoreCase("") == 0)
        {
            System.out.println("Characters must be alphabetic...");
        }   
        else
        {
            System.out.println("Soundex: " + stringToconvert);
        }
       }
       while(!(mainString.compareToIgnoreCase("Exit")== 0));
       System.out.println("Goodbye!");
       input.close();
       
    }
}
