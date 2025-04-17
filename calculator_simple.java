import java.util.Scanner;

public class calculator_simple {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("**** CALCULATOR ****");
        System.out.println("> Write the first number: ");
        int number1 = input.nextInt();
        System.out.println("> Write the second number: ");
        int number2 = input.nextInt();
        input.nextLine(); //
        System.out.println("> Select one operation.");
        System.out.println("[1] Sum \n[2] Rest \n[3] Multiply \n[4] Division");

        String select = input.nextLine();

        float result;
        switch(select){
            case "1":
                result = number1 + number2;
                System.out.println("The sum is: " + result);
                break;
            case "2":
                result = number1 - number2;
                System.out.println("The rest is: " + result);
                break;
            case "3":
                result = number1 * number2;
                System.out.println("The multiply is: " + result);
                break;
            case "4":
                result = number1 / number2;
                System.out.println("The division is " + result);
                break;
            default:
                System.out.println("Invalid selection.");
                break;
        }
    }
}
