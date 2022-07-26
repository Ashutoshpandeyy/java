import java.util.Scanner;

import javax.sound.sampled.ReverbType;
public class displToLoTriang {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] ary = new int[n][m];
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                ary[i][j] = scn.nextInt();
            }
        }
        int[][] a = aryDia(ary);
        display(a);
    }

    public static int[][] aryDia(int[][] ary){
        for(int i =0; i<ary.length; i++){
            for(int j=0; j<ary[0].length; j++){
                if(i < j){
                    ary[i][j] = 0;
                }
            }
            System.out.println();
        }
        return ary;
    }

    public static void display(int[][] ary){
        for(int i =0; i<ary.length; i++){
            for(int j =0; j<ary[0].length; j++){
                System.out.print(ary[i][j] + "\t");
            }
            System.out.println();
        }
    }
    
}
