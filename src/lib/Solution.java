package lib;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2018-04-17 18:46
 * 思想的主体函数是对的，但是对于怎么得出子list自己的方法太笨了
 * 应该去找规律的
 **/
public class Solution {
    public List<String> ambiguousCoordinates(String S) {
        int n = S.length();
        List<String> res = new ArrayList();
        for (int i = 1; i < n - 2; ++i) {
            List<String> A = f(S.substring(1, i + 1)), B = f(S.substring(i + 1, n - 1));
            for (String a : A) for (String b : B) res.add("(" + a + ", " + b + ")");
        }
        return res;
    }
    public List<String> f(String S) {
        int n = S.length();
        List<String> res = new ArrayList();
        if (n == 0 || (n > 1 && S.charAt(0) == '0' && S.charAt(n - 1) == '0')) return res;
        if (n > 1 && S.charAt(0) == '0') {
            res.add("0." + S.substring(1));
            return res;
        }
        res.add(S);
        if (n == 1 || S.charAt(n - 1) == '0') return res;
        for (int i = 1; i < n; ++i) res.add(S.substring(0, i) + '.' + S.substring(i));
        return res;
    }
//    private List<String> list=new ArrayList<>();
//    public List<String> ambiguousCoordinates(String S) {
//        if(S.length()<4) return null;
//        char [] chars=S.toCharArray();
//        int sum=0;
//        for(int i=1;i<chars.length-2;++i)
//        {
//            List<String> listLeft=diffNumber(chars,1,i);
//            List<String> listRight= diffNumber(chars,i+1,chars.length-1);
//            for(String sl:listLeft)
//            {
//                for(String sr:listRight)
//                {
//                    list.add("("+sl+","+sr+")");
//                }
//            }
//        }
//        return  list;
//    }
//    public List<String>  diffNumber(char[] chars, int left, int right){
//        List<String> listLeft=new ArrayList<>();
//        return listLeft;
//    }
//
//    private boolean isNeed(char[] chars,int left,int right,int point){
//
//        return true;
//    }
}
