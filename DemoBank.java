import java.util.Scanner;
class Banking{
    String name;
    long PhNo;
    double Amount;
    double WithdrawAmt;
    double DepositAmt;
    void CreateAccount(String name, long PhNo,double Amount){
		this.name = name;
		this.PhNo = PhNo;
		this.Amount = Amount;	
		System.out.println("Account Created");
		System.out.println("Name " + name);
		System.out.println("Phone Number " + PhNo);
		System.out.println("Amount " + Amount);
	}
	
    void WithDrawal(double WithdrawAmt) {
        if (WithdrawAmt <= Amount && (Amount - WithdrawAmt) >= 500) {
            Amount -= WithdrawAmt;
            System.out.println("Amount withdrawn: " + WithdrawAmt);
            System.out.println("Remaining balance: " + Amount);
        } else {
            System.out.println("Insufficient balance.");
        }
    }

	void Deposit(double DepositAmt){
		this.DepositAmt = DepositAmt;
		Amount += DepositAmt;
		System.out.println("The Balance is "+ Amount);	
	}
}

public class DemoBank{
	public static void main(String[] args){
		Banking b = new Banking();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name : ");
					String name = sc.next();
					System.out.println("Enter your Phone no: ");
					long PhNo = sc.nextLong();
   					System.out.println("Enter the amount: ");
					double Amount = sc.nextDouble();
					b.CreateAccount(name,PhNo,Amount);
		while(true){
			System.out.println("Type \nWithdraw to withdraw the money \nDeposit to deposit money \nExit to exit");
			String c = sc.next();
			switch(c){
				case "Withdraw":
					System.out.println("Enter the amount to withdraw : ");
					double WithdrawAmt = sc.nextDouble(); 
					b.WithDrawal(WithdrawAmt);
					break;
				case "Deposit":
					System.out.println("Enter the amount to deposit : ");
					double DepositAmt = sc.nextDouble(); 

					b.Deposit(DepositAmt);
					break;
				case "Exit":
					sc.close();
					return;
				default: 
					System.out.println("Invalid choice");
				
				}
			}
		
		
	}	
}