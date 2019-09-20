import java.util.*;

/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2019-09-14 22:47
 **/
public class Solution171B {
    /**
     * @param strs: A list of strings
     * @return: A list of strings
     *
     * WA
     */
    public List<String> anagrams(String[] strs) {
        // write your code here
        List<Map<Character, Integer>> l = new ArrayList<>();
        List<String> res = new ArrayList<>();
        for (String s : strs) {
            Map<Character, Integer> map = new HashMap<>();
            for (Character c : s.toCharArray()) {
                map.put(c, map.getOrDefault(c, 0) + 1);
            }
            if (containMap(l, map)) {
                res.add(s);
            } else {
                if(s.isEmpty()){
                    res.add(s);
                    continue;
                }
                l.add(map);
            }
        }
        return res;
    }

    private boolean containMap(List<Map<Character, Integer>> l, Map<Character, Integer> map) {
        if(l.size()==0){
            return false;
        }

        for (Map<Character, Integer> m:l){
            for (Map.Entry<Character,Integer> entry:m.entrySet()){
                Character c = entry.getKey();
                if(entry.getValue().equals(map.get(c))){
                }else {
                    return false;
                }
            }
        }

        return true;
    }
}
