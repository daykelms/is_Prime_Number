import java.util.Scanner;

public class Main {
// Method to check for prime numbers
    public static boolean isPrime (int a){
        if(a%2!=0 || a==2)
            return false;
        else
            return true;
    }

    public static void main(String[] args) {
	// write your code here
        Scanner kb = new Scanner(System.in);
        System.out.println("Please enter the value: ");
        int num = kb.nextInt();
        System.out.println(isPrime(num));
    }

}
