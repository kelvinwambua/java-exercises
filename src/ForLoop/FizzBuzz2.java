package ForLoop;
import java.util.Scanner;
public class FizzBuzz2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter your last number: ");
        int num2 = input.nextInt();
        for(int i = num1; i <= num2; i++) {
            if(i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz: "+i);
            }
            else if(i % 3 == 0) {
                System.out.println("Fizz: "+i);

            }
            else if(i % 5 == 0) {
                System.out.println("Buzz: "+i);
            }
        }

    }
}
