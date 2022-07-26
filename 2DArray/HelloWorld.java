// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        // System.out.println("HEloo Mithi"); 
        Scanner scn = new Scanner(System.in);
        int r = scn.nextInt();
        int c = scn.nextInt();
        System.out.println("------Input Start-------");
        int[][] ary = new int[r][c];
        for(int i=0;  i<ary.length; i++){
            for(int j=0; j<ary[0].length; j++){
                ary[i][j] = scn.nextInt();
                
            }
        }
        System.out.println("--------------------print 2D Array ---------");
         for(int i =0; i<ary.length; i++){
            for(int j=0; j<ary[0].length; j++){
                System.out.print("[ "+ ary[i][j] + " ]");
            }
            System.out.println();
        }
        System.out.println("-----------Diagonal------------------");
        // System.out.println("-----------------------------");
        for(int i =0; i<ary.length; i++){
            for(int j=0; j<ary[0].length; j++){
                if(i==j){
                    System.out.print(ary[i][j] + " ");
                }
            }
        }
        
    
        
    }
}