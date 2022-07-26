public class NonDuInAry {
    public static void main(String[] args) {
        // int cnt=0;
        // int sum=0;
        // int[] ary = {100, 213, 414, 555, 62, 321};
        // for(int i=0; i< ary.length; i++){
        //     int val = ary[i];
        //     String v = Integer.toString(val);
        //     for(int j=0; j<v.length(); j++ ){
        //         char c=v.charAt(j);
        //         for(int k=j+1; k<v.length(); k++){
        //             if(c==v.charAt(k)){
        //                 cnt++;
        //                 break;
        //             }
        //         }
        //     }
        //     if(cnt==0){
                
        //         System.out.println(val);
        //         sum += val;
        //     }
        //     cnt=0;
        // }
        // System.out.println(sum);

        // Evaluate an expression from string. E.g. exp = “1098+47” OR “3*6” OR “150/3” etc.

        // int EvaluateExpression(string exp)

        String s =("1098+47");
        char ch = '';
        int sum=0;
        int fv;
        int sv
        

        for(int i=0; i<s.length(); i++){
            String sp = str[i];
            if(sp.equals("+" )){
                ch = sp;
            }

        }
        String[] k = s.split("//ch");
        fv=Integer.parseInt(k[0]);
        sv=Integer.parseInt(k[1]);
        System.out.println(fv+sv);
        
        // System.out.println(sum);

























        // for(int i =0; i<s.length(); i++){
        //     char c = s.charAt(i);
        //     if(c=='/' || c=='+' || c=='*'){
        //         String str = Character.toString(c);
        //         String[] st = s.split(str);
        //         fv = Integer.parseInt(st[0]);
        //         sv = Integer.parseInt(st[1]);
            
        //     }else{
        //         continue;
        //     }
        // }

    
        // sum = fv +sv;
       
        // System.out.println(sum);






    }
}
