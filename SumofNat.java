import java.util.*;
class SumofNat{
	public static void main(String args[]){
		int n,m = 0;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m += (n*(n+1))/2;		
		System.out.println(m);
	}
}