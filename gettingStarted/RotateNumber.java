import java.util.*;
public class RotateNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        int count = 0;
        int temp = n;
        while(temp != 0){
            temp = temp/10;
            count++;
        }

        //actual rotation

        k = k % count;
        if(k < 0){  // we rotate
            k = k+count;
        }
        int temp1  = (int)Math.pow(10,k);
        
        int p1= n % temp1;
        int p2 = n / temp1;

        int temp2 = (int)Math.pow(10, count-k);
        
        int ans = (p1 * temp2) + p2;
        System.out.println(ans);
        scn.close();
    }
}
