/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2018-05-06 09:57
 **/
public class Solution831 {
    public String maskPII(String S) {
        S=S.replace("+","");
        S=S.replace(",","");
        S=S.replace("(","");
        S=S.replace(")","");
        S=S.replace("-","");
        S=S.replace(" ","");
        S = S.toLowerCase();
        String res = "";
        if (S.contains("@")) {
            for (int i = 0; i < S.length()-1; ++i) {
                if (i == 0) {
                    String s=S.substring(0, 1);
                    res +=  s+ "*****";
                }
                if (S.charAt(i + 1) == '@') {
                    res += S.substring(i, S.length());
                }
            }
            //return res;
        } else {
            if(S.length()==10)
            {
                res+="***-***-"+S.substring(6);
            }else if(S.length()==12){
                res+="+**-***-***-"+S.substring(8);
            }else if(S.length()==13) {
                res+="+***-***-***-"+S.substring(9);
            }else
            {
                res+="+*-***-***-"+S.substring(7);
            }
        }

        return res;
    }
}
