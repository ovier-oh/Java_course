import java.util.Scanner; 


public class TicTacToe{
    public static int matrixtoe[][] = {{1,2,3},{4,5,6},{7,8,9}}; 
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
        System.out.println(matrixtoe[0][0] + " | " + matrixtoe[0][1] + " | "+ matrixtoe[0][2]);
        System.out.println("-- " + "-- " + "--");
        System.out.println(matrixtoe[1][0] + " | " + matrixtoe[1][1] + " | "+ matrixtoe[1][2]);
        System.out.println("-- " + "-- " + "--");
        System.out.println(matrixtoe[2][0] + " | " + matrixtoe[2][1] + " | "+ matrixtoe[2][2]);
    }

    public static String[] players(){
        System.out.println("Please, Take one player [1] or [2]");
        String player = input.nextLine(); 
        if (player.equals("1")) {
            player_1 = "Player1";
            player_2 = "Player2";
        }
        if (player.equals("2")){
            player_2 = "Player1";
            player_1 = "Player2";
        }
        return new String[]{player_1, player_2};
    }

    public static void game_turns(String[][] matrix, String player_1, String player_2){

    }
    public static void main(String[] args){
        greetings();
        matix_tictactoe();
        input.nextLine();
        ClearScreen();
        String [] players = players();
        System.out.println("You are: " + players[0]);
        System.out.println("Other person is: " + players[1]);
        while(loop){
            //Aqui necesito ver como es el juego 
            game_turns(matrixtoe, player_1, player_2);
        }
        

        
    }
}