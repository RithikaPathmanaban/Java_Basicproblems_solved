import java.util.*;
class RightPyramid{
	public static void main(String[] args){
		int i,j;	
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(i=1;i<=n;i++){
			for(j=i;j<n;j++){
				System.out.print(" ");
			}	
			for(j=1; j<=i;j++){
				System.out.print("*");
			}
		System.out.println();
		}	
	}
}