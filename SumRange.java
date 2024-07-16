import java.util.*;
class SumRange{
	public static void main(String args[]){
		int start,end,sum=0;
		Scanner sc = new Scanner(System.in);
		start = sc.nextInt();
		end = sc.nextInt();
		for(int i = start; i <= end; i++){
			sum += i;
		}
		System.out.println(sum);
	}
}