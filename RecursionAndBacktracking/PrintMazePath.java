import java.util.*;

public class PrintMazePath {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int drow = scn.nextInt();
        int dcol = scn.nextInt();
        mazePath(0, 0, drow-1, dcol-1, "");
        scn.close();
    }

    public static void mazePath(int sr,int sc, int dr,int dc,String psf){
        // invalid dec
        if(sr > dr || sc > dc){
            return;
        }

        // valid dec
        if(sr == dr && sc==dc){
            System.out.println(psf);
            return;
        }
        mazePath(sr, sc+1, dr, dc, psf+"h"); // horizontal move
        mazePath(sr+1, sc, dr, dc, psf+"v"); // vertical Move
    }
}
