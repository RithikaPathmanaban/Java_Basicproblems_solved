import java.util.Scanner;

class Basic {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.print("Enter your choices or 0 to exit: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter a number: ");
                    int posOrNegInput = scanner.nextInt();
                    PosOrNeg(posOrNegInput);
                    break;
                case 2:
                    System.out.print("Enter a number: ");
                    int evenOrOddInput = scanner.nextInt();
                    EvenOrOdd(evenOrOddInput);
                    break;
                case 3:
                    System.out.print("Enter a number: ");
                    int natNoInput = scanner.nextInt();
                    NatNo(natNoInput);
                    break;
                case 4:
                    System.out.print("Enter start range: ");
                    int sumRangeStart = scanner.nextInt();
                    System.out.print("Enter end range: ");
                    int sumRangeEnd = scanner.nextInt();
                    SumRange(sumRangeStart, sumRangeEnd);
                    break;
                case 5:
                    System.out.print("Enter first number: ");
                    int great2Num1 = scanner.nextInt();
                    System.out.print("Enter second number: ");
                    int great2Num2 = scanner.nextInt();
                    Great2(great2Num1, great2Num2);
                    break;
                case 6:
                    System.out.print("Enter first number: ");
                    int great3NumA = scanner.nextInt();
                    System.out.print("Enter second number: ");
                    int great3NumB = scanner.nextInt();
                    System.out.print("Enter third number: ");
                    int great3NumC = scanner.nextInt();
                    Great3(great3NumA, great3NumB, great3NumC);
                    break;
                case 7:
                    System.out.print("Enter a year: ");
                    int leapYearInput = scanner.nextInt();
                    Leap(leapYearInput);
                    break;
                case 8:
                    System.out.print("Enter a number: ");
                    int primeInput = scanner.nextInt();
                    Prime(primeInput);
                    break;
                case 9:
                    System.out.print("Enter start range: ");
                    int primeRangeStart = scanner.nextInt();
                    System.out.print("Enter end range: ");
                    int primeRangeEnd = scanner.nextInt();
                    for (int i = primeRangeStart; i <= primeRangeEnd; i++) {
                        if (IsPrime(i)) {
                            System.out.println(i);
                        }
                    }
                    break;
                case 10:
                    System.out.print("Enter a number: ");
                    int digitSumInput = scanner.nextInt();
                    DigitSum(digitSumInput);
                    break;
                case 11:
                    System.out.print("Enter a number: ");
                    int reverseInput = scanner.nextInt();
                    Reverse(reverseInput);
                    break;
                case 12:
                    System.out.print("Enter a number: ");
                    int palindromeInput = scanner.nextInt();
                    Palindrome(palindromeInput);
                    break;
                case 13:
                    System.out.print("Enter a number: ");
                    int armstrongInput = scanner.nextInt();
                    Armstrong(armstrongInput);
                    break;
                case 14:
                    System.out.print("Enter start range: ");
                    int armstrongRangeStart = scanner.nextInt();
                    System.out.print("Enter end range: ");
                    int armstrongRangeEnd = scanner.nextInt();
                    for (int i = armstrongRangeStart; i <= armstrongRangeEnd; i++) {
                        if (ArmstrongRange(i)) {
                            System.out.println(i);
                        }
                    }
                    break;
                case 15:
                    System.out.print("Enter a number: ");
                    int fibonacciInput = scanner.nextInt();
                    Fibonacci(fibonacciInput);
                    break;
                case 16:
                    System.out.print("Enter a number: ");
                    int factorialInput = scanner.nextInt();
                    Factorial(factorialInput);
                    break;
                case 17:
                    System.out.print("Enter base: ");
                    double powerBase = scanner.nextDouble();
                    System.out.print("Enter exponent: ");
                    double powerExponent = scanner.nextDouble();
                    Power(powerBase, powerExponent);
                    break;
                case 18:
                    System.out.print("Enter a number: ");
                    int factorsInput = scanner.nextInt();
                    Factors(factorsInput);
                    break;
                case 19:
                    System.out.print("Enter a number: ");
                    int primeFactorInput = scanner.nextInt();
                    PrimeFactor(primeFactorInput);
                    break;
                 case 0:
                    exit = true;
                    break;
                default:
                    System.out.println("Enter a valid choice");
                    break;
            }
        }

        scanner.close();
    }

    public static void PosOrNeg(int n) {
        String res = n > 0 ? "Positive" : "Negative";
        System.out.println(res);
    }

    public static void EvenOrOdd(int n) {
        String ans = n % 2 == 0 ? "Even" : "Odd";
        System.out.println(ans);
    }

    public static void NatNo(int n) {
        int sum = 0, i;
        for (i = 1; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
    }

    public static void SumRange(int x, int y) {
        int i, sum = 0;
        for (i = x; i <= y; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
    }

    public static void Great2(int a, int b) {
        String res = a > b ? "a is greater" : "b is greater";
        System.out.println(res);
    }

    public static void Great3(int a, int b, int c) {
        int t, res;
        t = a > b ? a : b;
        res = t > c ? t : c;
        System.out.println(res + " is greater");
    }

    public static void Leap(int year) {
        String res = year % 400 == 0 ? "Leap year" : year % 4 == 0 && year % 100 != 0 ? "Leap year" : "Not leap year";
        System.out.println(res);
    }

    public static void Prime(int n) {
        int i, flag = 0;
        if (n < 2) {
            System.out.println(n + " is not prime");
        }
        for (i = 2; i < n / 2; i++) {
            if (n % i == 0) {
                flag++;

                break;
            }
        }
        if (flag == 1) {
            System.out.println(n + " is not prime");
        } else {
            System.out.println(n + " is prime");
        }
    }

    public static boolean IsPrime(int n) {
        int i;
        if (n < 2) {
            return false;
        }
        for (i = 2; i < n / 2; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void DigitSum(int n) {
        int sum = 0;
        while (n > 0) {
            sum = sum + n % 10;
            n = n / 10;
        }
        System.out.println(sum);
    }

    public static void Reverse(int n) {
        int rev = 0, r;
        while (n > 0) {
            r = n % 10;
            rev = rev * 10 + r;
            n = n / 10;
        }
        System.out.println(rev);
    }

    public static void Palindrome(int n) {
        int rev = 0, r, t;
        t = n;
        while (t > 0) {
            r = t % 10;
            rev = rev * 10 + r;
            t = t / 10;
        }
        if (rev == n) {
            System.out.println("The no is Palindrome");
        } else {
            System.out.println("The no is not Palindrome");
        }
    }

    public static void Armstrong(int no) {
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
            System.out.println("The no is armstrong");
        } else {
            System.out.println("The no is not armstrong");
        }
    }

    public static boolean ArmstrongRange(int no) {
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

    public static void Fibonacci(int n) {
        int i, f0 = 0, f1 = 1, f2;
        for (i = 0; i <= n; i++) {
            f2 = f0 + f1;
            f0 = f1;
            f1 = f2;
            System.out.println(f2);
        }
    }

    public static void Factorial(int n) {
        int i, fact = 1;
        for (i = 2; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println(fact);
    }

    public static void Power(double base, double e) {
        double res = 1.0;
        while (e != 0) {
            res = res * base;
            e--;
        }
        System.out.println(res);
    }

    public static void Factors(int n) {
        int i;
        for (i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }
    }

    public static void PrimeFactor(int n) {
        int i, x;
        for (i = 1; i <= n; i++) {
            if (IsPrime(i)) {
                x = n;
                if (x % i == 0) {
                    System.out.println(i);
                }
            }
        }
    }
}
