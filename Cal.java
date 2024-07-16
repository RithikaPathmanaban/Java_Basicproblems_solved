class Cal{
 static int counter = 0;
	public void Cal(){
		counter++;
	}
public static void main(String[] args){
	Cal c1 = new Cal();
	Cal c2 = new Cal();
c1.Cal();
	System.out.println(Cal.counter);	
}
}