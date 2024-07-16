import java.util.*;
class Prime{
	public static void main(String args[]){
		int n,flag=0;
		Scanner sc= new Scanner(System.in);
		n = sc.nextInt();
		for(int i = 2; i<=n/2;i++){
			if(n % i == 0){
			flag = 1;
			break;
			}
		}
		if(flag==1){
			System.out.println("Not a Prime number");
		}
		else{
			System.out.println("prime number");
		}
		
	}
}