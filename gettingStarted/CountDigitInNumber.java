import java.util.*;
class CountDigitInNumber{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the Number :"); 
        int n = scn.nextInt();
        int count =0;
        while(n != 0){
            n = n/10;
            count++;
        }
        scn.close();
        System.out.print("total number of digit : "+count);
    }
}