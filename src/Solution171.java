import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2019-09-14 23:09
 **/
public class Solution171 {
    private String getHash(int[] count) {

        return Arrays.toString(count);
//        int hash = 0;
//        int a = 378551;
//        int b = 63689;
//        for (int num : count) {
//            hash = hash * a + num;
//            a = a * b;
//        }
//        return hash;
    }

    public ArrayList<String> anagrams(String[] strs) {
        ArrayList<String> result = new ArrayList<>();
        HashMap<String, ArrayList<String>> map = new HashMap<>();

        for (String str : strs) {
            int[] count = new int[26];
            for (int i = 0; i < str.length(); i++) {
                count[str.charAt(i) - 'a']++;
            }

            String hash = getHash(count);
            if (!map.containsKey(hash)) {
                map.put(hash, new ArrayList<String>());
            }

            map.get(hash).add(str);
        }

        for (ArrayList<String> tmp : map.values()) {
            if (tmp.size() > 1) {
                result.addAll(tmp);
            }
        }

        return result;
    }
}
