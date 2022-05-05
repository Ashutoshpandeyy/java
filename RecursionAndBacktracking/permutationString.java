import java.util.*;
public class permutationString {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        strngPermu(str, "");
        scn.close();
    }
    public static void strngPermu(String qsf, String asf){
        if(qsf.length()==0){
            System.out.println(asf);
            return;
        }
        for(int i =0; i< qsf.length(); i++){
            char ch = qsf.charAt(i);
            StringBuilder sb = new StringBuilder(qsf); // qsf: question so far
            sb.deleteCharAt(i);
            String roq = sb.toString(); // roq - rest of question
            strngPermu(roq, asf+ch);
        }
    }
}
