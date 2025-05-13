public class TicTacToe{
    public static int matrixtoe[][] = {{1,2,3},{4,5,6},{7,8,9}}; 

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

    public static void main(String[] args){
        greetings();
        matix_tictactoe();
        
    }
}