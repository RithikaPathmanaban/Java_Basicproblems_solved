import java.util.*;
class Armstrong{
	public static void main(String args[]){
		int n,t,digit=0,rem,res=0;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		t = n;
		while(t>0){
			t = t/10;
			digit++;
		}
		while(t>0){
			rem = t%10;	
			res += Math.pow(rem,digit);
			t = t/10;
		}
		if(res==t){
			System.out.println("Armstrong number");
		}
		else{
			System.out.println("Not a armstrong number");
		}
	}
}