import java.util.*;
class ArmstrongRange{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	int start = sc.nextInt();
        int end = sc.nextInt();
        for (int i = start; i <= end; i++) {
              if (isArmstrong(i)) {
                   System.out.println(i);
              }      
}
}
public static boolean isArmstrong(int no) {
        int rem, res = 0, digits = 0, t;
        t = no;
        while (t > 0) {
            t = t / 10;
            digits++;
        }
        t = no;
        while (t > 0) {
            rem = t % 10;
            res += Math.pow(rem, digits);
            t = t / 10;
        }
        if (res == no) {
            return true;
        } else {
            return false;
        }
    }
}