import java.util.*;
class leapyear{
	public static void main(String args[]){
		int year;
		Scanner sc = new Scanner(System.in);
		year = sc.nextInt();
		String ans = (year%400==0 && year%100!=0 && year%4==0) ? "Leap year" : "not a leap year";
		System.out.println(ans);
}
}