package LeetCode;

import java.util.List;

/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2018-04-29 09:33
 **/
public class Solution {
    public String toGoatLatin(String S) {
        String[] s=S.split(" ");
        String res="";
        for(int i=0,j=0;i<s.length;++i)
        {
            if(i!=0) res+=" ";
            char first=s[i].charAt(0);
            String now;
            //int j=0;
            if(first=='a'||first=='o'||first=='e'||first=='i'||first=='u'||first=='A'||first=='O'||first=='E'||first=='I'||first=='U') {
                now =s[i] +"ma";

            }else
            {
                now=s[i].substring(1, s[i].length())+first+"ma";
            }
            for(int k=0;k<=j;++k)
            {
                now+="a";
            }
            ++j;
            res+=now;
        }

        return res;
    }
}
