import java.util.Scanner;

public class Calculator {


    public static int firstNumber;
    public static int secondNumber;
    public static int answer;
    private static final Scanner scanner = new Scanner(System.in);



    public static void main(String[] args) {

        calculator();
    }

    public static void calculator(){

        System.out.println("Simple Calculator ");
        System.out.println("Pick One Option ");
        System.out.println("Option 1 - Addition");
        System.out.println("Option 2 - Subtraction");
        System.out.println("Option 3 - Multiplication");
        System.out.println("Option 4 - Division");

        int Scanner = scanner.nextInt();


        switch (Scanner){

            case 1:
                addition();
                break;

            case 2:
                subtraction();
                break;

            case 3:
                multiplication();
                break;

            case 4:
                division();
                break;

             default:

                 System.out.println("Please select 1, 2, 3 or 4");
        }

    }

    public static void getNumbers(){

        System.out.println("Enter the first number: ");
        firstNumber = scanner.nextInt();
        System.out.println("Enter the second number: ");
        secondNumber = scanner.nextInt();
        return;

    }

    public static void addition(){

        System.out.println("Addition");
        getNumbers();
        answer = firstNumber + secondNumber;
        System.out.println("Sum of first number and second number is " + answer);
        calculator();

    }

    public static void subtraction(){

        System.out.println("Subtraction");
        getNumbers();
        answer = firstNumber - secondNumber;
        System.out.println("Difference between first number and second number is " + answer);
        calculator();
    }

    public static void multiplication(){

        System.out.println("Multiplication");
        getNumbers();
        answer = firstNumber *secondNumber;
        System.out.println("The product of the first number and second number is " + answer);
        calculator();

    }

    public static void division(){

        System.out.println("Division");
        getNumbers();
        answer = firstNumber / secondNumber;
        System.out.println("The answer is" + answer);
        calculator();

    }
}
