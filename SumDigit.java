import java.util.*;
class SumDigit{
	public static void main(String args[]){
	int n,sum=0,digit;
	Scanner sc = new Scanner(System.in);
	n = sc.nextInt();
	while(n>0){
		digit = n%10;
		sum+=digit;
		n = n/10;
	}	
	System.out.println(sum);
}
}