import java.util.ArrayList;
import java.util.Scanner; 

public class to_do {
    
    public static void clear_screen(){
        //String clear = ;
        System.out.println("\\033[H\\033[2J");
    }

    public ArrayList<String> CreateListTask(){
        ArrayList<String> tasks = new ArrayList<>();
        return tasks;
    }

    public static ArrayList<String> AddItem(ArrayList<String> listTask){
        Scanner input = new Scanner(System.in); 
        System.out.println("Write the element for add in the list"); 
        String additemwrite = input.nextLine();
        listTask.add(additemwrite);
        return listTask;
    }

    public static doubleResult deleteItem(ArrayList<String> listTask){
        Scanner input = new Scanner(System.in); 
        System.out.println("Write the element for delete in the list"); 
        String deleteitem = input.nextLine();
        listTask.remove(deleteitem);
        return new  doubleResult(listTask, deleteitem);
    }

    
    public static void main(String[] args) {
        to_do toDo = new to_do();
        boolean bucle_temp = true;
        ArrayList<String> listTasks = toDo.CreateListTask();
        
        while(bucle_temp){
            clear_screen();
            System.out.println("*** To Do list ***");
            System.out.println("[1] Show Tasks");
            System.out.println("[2] Add Task");
            System.out.println("[3] Delete Tasks");
            //System.out.println("[4] Save Tasks");
            System.out.println("[5] Exit.");
            
            Scanner input = new Scanner(System.in); 
            String select_option = input.nextLine();
            
            switch(select_option){
                case "1":
                    System.out.println(listTasks);
                    select_option = "";
                    break;
                
                case "2":
                    listTasks = AddItem(listTasks);
                    System.out.println(listTasks); 
                    select_option = "";
                    break;
                case "3":
                    doubleResult listTask =  deleteItem(listTasks);
                    System.out.println("Item delete: " + listTask.getItem());
                    System.out.println("List Task update: " + listTask.getList());
                    break;
                case "5":
                    bucle_temp = false;
                    break;
                default:
                    System.out.println("Invalid Option try again");
                    break;
            }
                
        }

    }
}


class doubleResult {
    private ArrayList<String> list;
    private String item; 
    public doubleResult(ArrayList<String> list, String item){
        this.list = list;
        this.item = item;
    }

    public ArrayList<String> getList(){
        return list;
    }

    public String getItem(){
        return item;
    }
    
}