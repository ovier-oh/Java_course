import java.util.Scanner; 


public class TicTacToe{
    public static String matrixtoe[][] = {{"1","2","3"},{"4","5","6"},{"7","8","9"}}; 
    public static Scanner input = new Scanner(System.in);
    public static String player_1 = "";
    public static String player_2 = "";
    public static boolean loop = true;

    public static void ClearScreen(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void greetings(){
        System.out.println("**Welcome to TicTacToe Game**");
        System.out.println("[Info] The First participant in create 3 in line Wins!!");
        System.out.println("[Info] You can choose one player [O] or [X]");
        System.out.println("[Info] Please look the game board, here one number is one position");
        System.out.println("[Info] You only need write the number of position that you want :D");
    }
    public static void matix_tictactoe(){
        for (int i=0; i < matrixtoe.length; i++){
            for(int j=0; j < matrixtoe[i].length; j++){
                System.out.print(matrixtoe[i][j]);
                if(j < matrixtoe[i].length - 1){
                    System.out.print(" | ");
                }
            }
            System.out.println();
            if(i < matrixtoe.length - 1){
                System.out.println("-- -- --");
            }
        }
    }

    public static String[] players(){
        System.out.println("Please, Take one player [1] or [2]");
        String player = input.nextLine(); 
        if (player.equals("1")) {
            player_1 = "Player1 [O]";
            player_2 = "Player2 [X]";
        }
        if (player.equals("2")){
            player_2 = "Player1 [O]";
            player_1 = "Player2 [X]";
        }
        return new String[]{player_1, player_2};
    }

    public static int[] position_select(String position){
        switch(position){
            case "1": return new int[]{0,0};
            case "2": return new int[]{0,1};
            case "3": return new int[]{0,2};
            case "4": return new int[]{1,0};
            case "5": return new int[]{1,1};
            case "6": return new int[]{1,2};
            case "7": return new int[]{2,0};
            case "8": return new int[]{2,1};
            case "9": return new int[]{2,2}; 
            default: return null;           
        }
    }
    public static void game_turns(String[][] matrix, String player_1, String player_2){
        //ClearScreen();
        System.out.println("Turns of player 1: ");
        System.out.println("Please choose ona position: ");
        // Crear funcion que recorra el array System.out.println(matrix);
        String position  = input.nextLine(); 
        //if(player_1.equals("Player1")){
        int[] pos =  position_select(position);
        System.out.println(pos);
        //}
        



    }
    public static void main(String[] args){
        //greetings();
        matix_tictactoe();
        //input.nextLine();
        //ClearScreen();
        //String [] players = players();
        //System.out.println("You are: " + players[0]);
        //System.out.println("Other person is: " + players[1]);
        //while(loop){
            //Aqui necesito ver como es el juego 
            //game_turns(matrixtoe, player_1, player_2);
        //}
    
    }
}