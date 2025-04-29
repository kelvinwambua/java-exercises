package Interest;

public class Variables {
    void Interest(){
        double amount;
        double interest;
        amount = 50000;
        System.out.println("Amount is " + amount);
        interest = 15.0;
        amount = amount * (100+interest)/100;
        System.out.println("Amount after a year " + amount);
        amount = amount * (100+interest)/100;
        System.out.println("Amount after year 2 " + amount);
    }
    public static void main(String[] args) {
        Variables v = new Variables();
        v.Interest();
    }

}
