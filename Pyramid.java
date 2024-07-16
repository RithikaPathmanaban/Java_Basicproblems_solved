import java.util.*;
class Pyramid{
	public static void main(String[] args){
		int i,j;
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		or (int i = 1; i <= rows; i++) {
            // Print leading spaces
            for (int j = i; j <= rows - i; j++) {
                System.out.print(" ");
            }
            // Print the first half of asterisks
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Print the second half of asterisks
            for (int j = 1; j < i; j++) {
                System.out.print("*");
            }
            // Move to the next line after each row
            System.out.println();
        }

	}	
}