import java.util.Scanner;
class AllPrime{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        int i =1;
        while(i <= t){
            int n = scn.nextInt();
            int count = 0;
            for(int j =2; j*j<=n; j++){
                if(n%j==0){
                    count++;
                }
            }
            if(count==0){
                System.out.println("prime");
            }else{
                System.out.println("Not Prime");
            }
            i++;
        }
        scn.close();

        
    }
}