
import java.util.Scanner;
public class subSeqString {
    public static void printSS(String qsf, String asf)// Question so far // Answer so far
    {
        if(qsf.length()==0){
            System.out.println(asf);
            return;
        }
        char ch = qsf.charAt(0);
        String roq = qsf.substring(1);
        printSS(roq, asf+ch);
        printSS(roq, asf);
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String ques = scn.nextLine();
        printSS(ques, "");
        scn.close();
    }
}
