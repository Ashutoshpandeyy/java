import java.util.*;
public class ReverseOfNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n = scn.nextInt();
        while(n!=0){
            int dig = n % 10;
            System.out.println(dig);
            n=n/10;
        }
        scn.close();
    }
}
