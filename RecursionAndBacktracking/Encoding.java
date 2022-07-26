import java.util.*;
public class Encoding {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String st = scn.nextLine();
        printEncoding(st, "");
        scn.close();
    }

    public static void printEncoding(String qsf, String asf){
        if(qsf.length()==0){
            System.out.println(asf);
            return;
        }

        // Single Digit
        char n1 = qsf.charAt(0);
        if(n1 == '0'){
            return;
        }else{
            char enc1 = (char)('a'+(n1-'1'));
            printEncoding(qsf.substring(1), asf+enc1);

            //Multiple Digit
            if(qsf.length()>1){
                String temp = qsf.substring(0, 2);
                int n2 = Integer.parseInt(temp);
                if(n2 <= 26){
                    char enc2 = (char) ('a'+(n2-1));
                    printEncoding(qsf.substring(2), asf+enc2);
                }
            }
        }
    }
}
