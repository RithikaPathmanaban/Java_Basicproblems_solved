import java.util.*;
class Greatof3{
	public static void main(String args[]){
		int a,b,c;	
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		String d = (a>b && a>c) ? "a is greater" : (b>a && b>c) ? "b is greater" : "c 		is greater";
		System.out.println(d);
 
	}
}