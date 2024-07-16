import java.util.*;;
public class VowelsCount {
    public static void main(String[] args){   
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String[] words = text.trim().split("\\s+");
        System.out.println("No of words " + words.length);
        int i = 0;
        int VowelCount =0;
        int ConCount= 0; 
        for(String word : words){
            char[] charArr = word.toCharArray();
            for(char ch : charArr)
            if(ch== 'a' || ch == 'e' || ch == 'i' || ch == 'o'|| ch == 'u') VowelCount++;
            else ConCount++;
        }
        System.out.println("No of vowels " + VowelCount);
        System.out.println("No of consonants " + ConCount);
    }
}
