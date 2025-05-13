public class TicTacToe{
    public static int matrixtoe[][] = {{1,2,3},{4,5,6},{7,8,9}}; 

    public static void matix_tictactoe(){
        System.out.println(matrixtoe[0][0] + " | " + matrixtoe[0][1] + " | "+ matrixtoe[0][2]);
        System.out.println("-- " + "-- " + "--");
        System.out.println(matrixtoe[1][0] + " | " + matrixtoe[1][1] + " | "+ matrixtoe[1][2]);
        System.out.println("-- " + "-- " + "--");
        System.out.println(matrixtoe[2][0] + " | " + matrixtoe[2][1] + " | "+ matrixtoe[2][2]);
    }

    public static void main(String[] args){
        matix_tictactoe();
        
    }
}