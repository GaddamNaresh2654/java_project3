import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float num_1 , num_2;
        System.out.println("Enter First Number :");
        Scanner scan = new Scanner(System.in);
        num_1 = scan.nextFloat();

        System.out.println("Enter Second Number : ");
        num_2 = scan.nextFloat();
        System.out.print("You have entered numbers ");
        System.out.print(num_1);
        System.out.print(" and ");
        System.out.println(num_2);

        String prompt = "Enter 0 for Addition, 1 for Subtraction, 2 for Multiplication,3 for Division";
        System.out.println(prompt);

        int input = scan.nextInt();
        switch (input) {
            case 0 -> {
                System.out.println("Addition ");
                System.out.println("The Addition of two number is :");
                System.out.println(num_1 + num_2);
            }
            case 1 -> {
                System.out.println("Subtraction ");
                System.out.println("The Subtraction of two number is :");
                System.out.println(num_1 - num_2);
            }
            case 2 -> {
                System.out.println("Multiplication");
                System.out.println("The Multiplication of two number is :");
                System.out.println(num_1 * num_2);
            }
            case 3 -> {
                System.out.println("Division");
                System.out.println("The Division of two numbers is :");
                System.out.println(num_1 / num_2);
            }
            default -> System.out.println("Invalid Input,please enter correct input");
        }
    }
}
