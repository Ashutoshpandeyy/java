import java.util.Scanner;
public class Diagonal {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int row = scn.nextInt();//3
        int col = scn.nextInt();//4
        int[][] ary = new int[row][col]; // empty array
        for(int r=0; r<ary.length; r++){
            for(int c=0; c<ary[0].length; c++){
                ary[r][c]=scn.nextInt();
            }
        }
        System.out.println("----------------------------------------");

    
        for(int i=0; i<ary.length; i++){
            for(int j=0; j<ary[0].length;j++){
                System.out.print(ary[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("-------------Addition-------------------------------");
        int sum =0;
        for(int r=0; r<ary.length; r++){
            for(int d=0; d<ary[0].length;d++){
                if(r==d){
                    sum= sum + ary[r][d];
                    System.out.println(ary[r][d]);
                }
            }
        }
        System.out.println("SUm of Diagonal is : " + sum);

    }
}
