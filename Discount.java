import java.util.*;
class Discount{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int Price = sc.nextInt();
		int netprice;
		if(Price>=1000 && Price<=2000){
			if(Price>=1000 && Price<=1500){
				netprice = Price-(10/100);
				System.out.println("Netprice is " + netprice);	
			}
			else if(Price>=1501 && Price<=2000){
				netprice = Price-(15/100);
				System.out.println("Netprice is " + netprice);		
			}
		}
		else if(Price>=2001 && Price<=3000){
			if(Price>=2001 && Price<=2500){
				netprice = Price-(20/100)+500;
				System.out.println("Netprice is " + netprice);	
			}
			else if(Price>=2501 && Price<=3000){	
				netprice = Price-(25/100)+1000;
				System.out.println("Netprice is " + netprice);	
			}
		}
}
}