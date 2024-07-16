import java.util.*;
class Insertion{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] a = new int[5];
		for(int i = 0;i<5;i++)
			a[i] = sc.nextInt();
		insertion(a);
		for(int i =0;i<5;i++)
			System.out.println(a[i]+" ");

	}
	public static void insertion(int[] arr){
		for(int i = 1;i<5;i++){
			int key = arr[i];
			int j = i-1;
			while (j>=0 && arr[j] > key){
				arr[j+1] = arr[j];
				j--;	
			}
			arr[j+1] = key;
		}
			
	}
}