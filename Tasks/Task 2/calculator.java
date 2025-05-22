import java.util.*;
public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter the first number: ");
        double num1 = sc.nextDouble();

        System.out.println("Enter the Operator (+, -, *, /): ");
        char operator = sc.next().charAt(0);

        System.out.println("Enter the second number: ");
        double num2 = sc.nextDouble();

        double result;

        switch(operator){
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> {
                if (num2 != 0)
                    result = num1 / num2;
                else {
                    System.err.println("Error : Division by zero is not defined!");
                    return ;
                }
            }
            default -> {
                System.out.println("Invalid Operator!");
                return ; 
            }
            }
        System.out.println("Result : " + result);

    }
}