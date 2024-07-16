import java.util.*;
public class TextReverse {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String Text = sc.nextLine();
        String[] words = Text.split(" ");
    // for(String s : words){
    //    String reverse = new StringBuffer(s).reverse().toString(); builtin methods
    //    System.out.print(reverse+" ");
    // } 
      

    // User defined
    for(String s:words){
        int i = 0,j = s.length()-1;
        char[] charArr = s.toCharArray();  
        while(i<j){
            char temp = charArr[i];
            charArr[i] = charArr[j];
            charArr[j] = temp;
            i++;
            j--;
        }
      System.out.print(new String(charArr)+" ");
    }
    }

}

