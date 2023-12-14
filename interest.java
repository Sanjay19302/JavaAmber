import java.util.Scanner;
public class interest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the principal amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter the time (in years): ");
        double time = scanner.nextDouble();

        System.out.print("Enter the rate of interest: ");
        double rate = scanner.nextDouble();
        scanner.close();
        double simpleInterest = (principal * time * rate) / 100;

        System.out.println("Principal Amount: $" + principal);
        System.out.println("Time (in years): " + time);
        System.out.println("Rate of Interest: " + rate + "%");
        System.out.println("Simple Interest: $" + simpleInterest);
    }
}
