 // builtin methods


// import java.util.*;
// public class StringPalindrome {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         String str = sc.nextLine();
//         String rev = new StringBuffer(str).reverse().toString();
//         if(str.equals(rev)){
//             System.out.println(str + " is palindrome");
//         }
//         else{
//             System.out.println(str + " is not a palindrome");
//         }
//     }
// }

// user defined
import java.util.*; 
public class StringPalindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int i = 0,j = str.length()-1;
                if(str.charAt(i)==str.charAt(j)) {
                    System.out.println(str + " is palindrome");
                }
                else{
                    System.out.println(str+" is not a palindrome");
                }
    }
} 
