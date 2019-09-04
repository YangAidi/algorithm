import java.util.*;

/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2019-09-03 10:00
 **/
public class Solution209 {
    /**
     * @param str: str: the given string
     * @return: char: the first unique character in a given string
     */
    public char firstUniqChar(String str) {
        // Write your code here
        LinkedHashMap<Character,Integer> l = new LinkedHashMap<Character, Integer>(16,0.75f,true);
        for(int i=0;i<str.length();++i){
            l.put(str.charAt(i), l.getOrDefault(str.charAt(i), 0)+1);
        }
        for(Map.Entry<Character,Integer> entry:l.entrySet()){
            if(entry.getValue()==1){
                return entry.getKey();
            }
        }
        return 'a';

//        int[] a = new int[300];
//        Arrays.fill(a, Integer.MAX_VALUE);
//        for (int i = 0; i < str.length(); ++i) {
//            char c = str.charAt(i);
//            if (a[c] < i) {
//                a[c] = -1;
//            } else {
//                a[c] = i;
//            }
//        }
//        for (int i = 0; i < 300; ++i) {
//            if (a[i] < 0) {
//                a[i] = Integer.MAX_VALUE;
//            }
//        }
//
//        return str.charAt(Arrays.stream(a).min().getAsInt());
    }
}
