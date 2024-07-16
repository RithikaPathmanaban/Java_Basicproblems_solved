class Banking{
	void CreateAccount(name,PhNo,Amount){
		this.name = name;
		this.PhNo = PhNo;
		this.Amount = PhNo;	
		System.out.println("Account Created");
		System.out.println("Name " + name);
		System.out.println("Phone Number " + PhNo);
		System.out.println("Amount " + Amount);
	}
	void WithDrawal{
	System.out.println();
	}
	void Deposit{
	Systemout.println();
	}
}

public class Demo{
	public static void main(String[] args){
		Banking b = new Banking();
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		Switch(c){
			case 1: 
				System.out.println("Enter your name : ");
				int name = sc.next();
				System.out.println("Enter your Phone no: ");
				int PhNo = sc.nextInt();
   				System.out.println("Enter your Phone no: ");
				double Amount = sc.nextDouble();
				b.CreateAccount(name,PhNo,Amount);
				break;
			case 2:
				b.WithDrawal();
				
		}
		
	}	
}