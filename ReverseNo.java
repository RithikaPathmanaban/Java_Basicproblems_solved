import java.util.*;
class ReverseNo{
	public static void main(String args[]){
		int rem,n,r=0;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		while(n>0){
		rem = n%10;
		r = r*10+rem;
		n=n/10;
		}
System.out.println(r);
	}
}