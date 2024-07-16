import java.util.*;
class ReplaceWord{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int i;
		String str = sc.nextLine();
		String str2 = sc.nextLine();
		String[] strArr = str.split("\\s+");
		for(i =0;i<strArr.length;i++){
			if(strArr[i].equals(str2)){
				strArr[i] = strArr[i].toUpperCase();
			}
		}
	String ans = String.join(" ",strArr);
	System.out.println(ans);
	} 
}