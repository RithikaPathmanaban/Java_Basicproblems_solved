import java.util.*;
class Evenorodd{
	public static void main(String args[]){
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		String a = n % 2 == 0 ? "Even" : "Odd";
		System.out.println(a);
}
}