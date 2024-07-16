import java.util.*;
class PrimeRange{
	public static void main(String args[]){
		int start,end;
		Scanner sc = new Scanner(System.in);
		start = sc.nextInt();
		end = sc.nextInt();
		for(int i=start;i<=end;i++){
			if(isprime(i)){
				System.out.println(i);	
			}
		}
	}

	public static boolean isprime(int n){
		int i;
		if(n<2){
		return false;
		}
		for(i=2;i<=n/2;i++){
		if(n%i == 0){
		return false;
		}
	}
	return true;
	}
}