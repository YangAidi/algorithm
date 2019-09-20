import java.util.*;

/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2019-09-14 23:21
 **/
public class Solution171C {
    /**
     * @param strs: A list of strings
     * @return: A list of strings
     */
    public List<String> anagrams(String[] strs) {
        List<String> result = new ArrayList<>();
        if (strs == null || strs.length == 0) {
            return result;
        }
        Map<String, ArrayList<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] arr = str.toCharArray();
            Arrays.sort(arr);
            String s = String.valueOf(arr);
            if (!map.containsKey(s)) {
                ArrayList<String> list = new ArrayList<>();
                map.put(s, list);
            }
            map.get(s).add(str);
        }
        for (Map.Entry<String, ArrayList<String>> entry : map.entrySet()) {
            if (entry.getValue().size() >= 2) {
                result.addAll(entry.getValue());
            }
        }
        return result;
    }
}
