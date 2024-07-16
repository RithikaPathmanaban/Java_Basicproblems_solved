import java.util.*;
class PalindromeString{
	public static void main(String args[]){
	String str,rev="";
	Scanner sc = new Scanner(System.in);
	str = sc.nextLine();
	for(int i = str.length()-1; i>=0; i--){
	rev = rev+str.charAt(i);
	}
	if(str.equals(rev))
		System.out.println("Palindrome");
	else
		System.out.println("Not a palindrome");
}
}