import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;
public class Main {

    Scanner sc;
    int[][] map;


    public Main(int row, int col, Scanner sc){

        this.sc = sc;
        map = new int[row][col];

        makeList();
    }

    public void makeList(){

        for(int i = 0; i < map.length; i++){
            for(int j = 0; j < map[0].length; j++){

                map[i][j] = sc.nextInt();
            }

        }

    }

    public void checkSquare(){


    }

    public static void main(String[] args) {

//        File file = new File("samples/coast-sample-1.in");
//        System.setIn(new FileInputStream(file));

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
