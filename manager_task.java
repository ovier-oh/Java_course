import java.util.ArrayList;
import java.util.Scanner;

public class manager_task {
    public static void clear(){
        System.out.print("\033[H\033[2J");
    }

    public static void show_task(ArrayList<String> taskList){
        if (taskList.isEmpty()) {
            System.out.println("La lista está vacía.");
        } else {
            for (int i = 1; i < taskList.size(); i++) {
                System.out.println(i + ": " + taskList.get(i));
            }
        }
    }
    private static ArrayList<String> taskList = new ArrayList<>();
    public static void main(String[] args) {
        boolean bucle = true; 
        System.out.println("*** Task manager ***");
        while(bucle){
            System.out.println("> Choice one option.");
            System.out.println("[1] Add Task. \n[2] Show Task \n[3] Edit task \n[4] Delete task");
            System.out.println("[5] Mark task as completed \n[6] Organize task \n[7] Exit");
            Scanner input = new Scanner(System.in);
            String select = input.nextLine();
            
            switch(select){
                case "1":
                    clear();
                    System.out.println("> You select Add Task:");
                    System.out.println("> Write the new task");
                    String new_task = input.nextLine(); 
                    taskList.add(new_task);
                    break;

                case "2":
                    clear();
                    System.out.println("> You select Show Task:");
                    show_task(taskList);
                    break;

                case "3":
                    clear();
                    System.out.println("> You select Edit Task:");
                    
                    break;

                case "4":
                    clear();
                    System.out.println("> You select Delete Task");
                    break;

                case "5":
                    clear();
                    System.out.println("> You select Mark task as completed");
                    break;

                case "6":
                    clear();
                    System.out.println("> You select Organize task");
                    break;

                case "7":
                    clear();
                    System.out.println("> You select Exit of program.");
                    bucle = false;
                    break;

                default:
                    System.out.println("Option Select no valid.");
            }
        }
    }
}
