import java.util.*;
class Sorting{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[6];
		int[] res = new int[6];

		for(int i = 0; i<6;i++)
			arr[i] = sc.nextInt();	
		Arrays.sort(arr);
		int large = 5,small = 0;
		for(int i = 0;i<6;i++){
		if(i%2==0)
			res[i] = arr[large--];
		else res[i] = arr[small++];
		System.out.println(res[i]);
		}


	}
}