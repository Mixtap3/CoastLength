import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    Scanner sc;
    int row, col;
    ArrayList<ArrayList<Integer>> map = new ArrayList<ArrayList<Integer>>();


    public Main(int row, int col, Scanner sc){

        this.row = row;
        this.col = col;
        this.sc = sc;

        makeList();
    }

    public void makeList(){

        for(int i = 0; i < col; i++){


        }

    }

    public void checkSquare(){


    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();
        int col = sc.nextInt();

        Main cl = new Main(row, col, sc);


    }
}

class CoastLength {

    int row, col;
    Scanner sc;
    public CoastLength(int row, int col, Scanner sc){

        this.row = row;
        this.col = col;
        this.sc = sc;
    }


}
