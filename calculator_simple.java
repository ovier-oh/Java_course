import java.util.Scanner;

public class calculator_simple {
    
    public static boolean repeat(Scanner scanner){
        System.out.println("Do you want repeat any operation (y/n)");
        String repeat = scanner.nextLine();
        if(repeat.equals("y")){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        boolean Flag_1 = true;      // Flag for if user want to exit 
        Scanner input1 = new Scanner(System.in);
        float result;
        
        while(Flag_1){
            System.out.print("\033[H\033[2J");
            System.out.println("*** Calculator ***");
            System.out.println("> Write the first number: ");
            int number1 = input1.nextInt();
            System.out.println("> Write the second number: ");
            int number2 = input1.nextInt();
            input1.nextLine(); //
            System.out.println("> Select one operation.");
            System.out.println("[1] Sum \n[2] Rest \n[3] Multiply \n[4] Division");
            String select = input1.nextLine();

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
            Flag_1= repeat(input1);
        }
        input1.close();
    }
}
