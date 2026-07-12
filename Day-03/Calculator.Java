import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner j = new Scanner(System.in);

        int b = j.nextInt();
        char a = j.next().charAt(0);
        int c = j.nextInt();

        switch (a) {
            case '+':
                System.out.println(b + c);
                break;

            case '-':
                System.out.println(b - c);
                break;

            case '*':
                System.out.println(b * c);
                break;

            case '/':
                if (c != 0)
                    System.out.println(b / c);
                else
                    System.out.println("Division by zero not allowed");
                break;

            case '%':
                if (c != 0)
                    System.out.println(b % c);
                else
                    System.out.println("Division by zero not allowed");
                break;

            default:
                System.out.println("Invalid input");
        }

        j.close();
    }
}