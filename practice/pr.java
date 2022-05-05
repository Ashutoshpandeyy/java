import java.util.Scanner;
public class pr {
    public static void main(String[] args) {
        // System.out.println("Hello, World!"); 
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        s += sc.nextLine();
        String p = sc.next();
        p += sc.nextLine();
        System.out.println("Your Name is : "+s);
        System.out.println("Your Name is : "+p);
        sc.close();
    
    }
    
}
