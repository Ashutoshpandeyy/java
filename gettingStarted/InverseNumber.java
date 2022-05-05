import java.util.*;
class InverseNumber{
    public static void inverse(int n){
        int sum = 0;
        int pos= 1;
        while(n!=0)
        {
            int digit = n%10;
           
            int val = pos*(int)Math.pow(10,digit-1);
            sum += val;
            pos++;
            n=n/10;
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("ENter the Number : ");
        int n =scn.nextInt();
        inverse(n);
        scn.close();
    }
}