import java.util.*;
class FiboRecur{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int f0=0,f1=1,f2;
		for(int i=0;i<n;i++){
			f2=f0+f1;
			f0=f1;
			f1=f2;
		System.out.println(f2);
		}	
	}	
}