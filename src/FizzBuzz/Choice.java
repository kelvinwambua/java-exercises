package FizzBuzz;
// If a number is divisible by 3 print Fiz, by 5 Buzz by both FizzBuzz
public class Choice {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        int number =  Integer.parseInt(System.console().readLine());
        if(number%3==0 && number%5==0) {
            System.out.println("FizzBuzz");

        }
        if(number%5==0) {
            System.out.println("Buzz");
        }
        if(number%3==0) {
            System.out.println("Fizz");
        }

    }
}
