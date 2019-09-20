/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2019-09-05 23:09
 **/
public class Solution422 {
    /**
     * @param s: A string
     * @return: the length of last word
     */
    public int lengthOfLastWord(String s) {
        // write your code here
        if(s==null||s.length() ==0){
            return 0;
        }


        int begin = s.length()-1;
        while (s.charAt(begin) ==' '){
            --begin;
        }
        if(s.charAt(begin) ==0 ){
            return 0;
        }
        for(int i=begin;i>=0;--i){
            if(s.charAt(i)==' '){
                return begin-i;
            }
        }
        return s.length();

    }
}
