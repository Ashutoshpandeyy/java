import java.util.*;
    
    public class GcdAndLcm{
    
    public static void main(String[] args) {
      // write your code here 
      Scanner sc = new Scanner(System.in);
      int a=sc.nextInt();
      int b=sc.nextInt();
      int a1=a,b1 =b;
      while(a%b!=0)
      {
        int rem=a%b;
        a=b;
        b=rem;
        
        
      } 
      int gcd=b;

      int lcm=(a1*b1)/gcd;

      System.out.println(gcd);

      System.out.println(lcm);
    sc.close();  
  }
}
  