import java.util.*;
class Item{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int ItemNo = sc.nextInt();
		sc.nextLine();
		String ItemName = sc.nextLine();
		int Rate = sc.nextInt();
		int Quantity = sc.nextInt();
		int Price = Rate * Quantity;
		System.out.println("Item Number " + ItemNo + "\n" + "Item name " + ItemName + "\n" + "Price " + Price + "\n"); 
}
}
