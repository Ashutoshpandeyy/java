import java.util.*;
public class DigitOfNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Entr the Number : ");
        int n = scn.nextInt();
        int temp =n;
        int count =1;
        while(n>9){
            n=n/10;
            count *=10;
        }

        while(count>0){
            int mod = temp/count;
            System.out.println(mod);
            temp = temp%count;
            count = count/10;
        }
        scn.close();
    }
}
