package LeetCode;

import java.util.*;

/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2018-04-15 09:33
 **/
public class Solution819 {
    public String mostCommonWord(String paragraph, String[] banned) {
        String temp=paragraph.toLowerCase();
        for(String ban:banned)
        {
            temp=temp.replace(" "+ban,"");
        }
        temp=temp.replaceAll("\\p{P}" , "");
        //temp=temp.replaceAll("\\\\pP" , "");
        //temp=temp.replace(".", "");
        String[] s=temp.split(" ");
        HashMap<String,Integer> h=new HashMap();
        for(String ss:s)
        {
            if(h.containsKey(ss))
            {
                h.put(ss, h.get(ss) +1);
            }else
                h.put(ss,1);
        }
        int max=0;
        String maxkey=null;
        for(Map.Entry<String,Integer> entry:h.entrySet())
        {
            String k=entry.getKey();
            Integer v=entry.getValue();
            if(v>max)
            {
                max=v;
                maxkey=k;

            }
        }
        return maxkey;
        //return paragraph;
    }
}
