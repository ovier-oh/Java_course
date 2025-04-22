import java.util.ArrayList;
import java.util.Scanner; 

public class to_do {

    public ArrayList<String> CreateListTask(){
        ArrayList<String> tasks = new ArrayList<>();
        return tasks;
    }

    public static void main(String[] args) {
        to_do toDo = new to_do();
        ArrayList<String> result =toDo.CreateListTask();
        System.out.println("*** To Do list ***");
        System.out.println("[1] Show Tasks");
        System.out.println("[2] Add Task");
        System.out.println("[3] Delete Tasks");
        System.out.println("[4] Exit.");
        
        //Scanner input = new Scanner(System.in); 
        //String select_option = input.nextLine();

        System.out.println(result);
    }
}
