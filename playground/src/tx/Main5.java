package tx;

import java.util.*;

/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2019-09-01 20:47
 **/

public class Main5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        Set<String> cache = new HashSet<>();
        cache.add("0");
        if (k == 1) {
            cache.add("1");
        }
        int len = 1;
        Map<Integer, Integer> result = new HashMap<>();
        result.put(len, cache.size());
        for (int i = 0; i < n; i++) {
            int left = in.nextInt();
            int right = in.nextInt();
            while (right > len) {
                len++;
                Set<String> backup = new HashSet<>(cache);
                cache.clear();
                for (String s : backup) {
                    cache.add(s + "0");
                    if (k == 0) {
                        cache.add(s + "1");
                    } else if (s.length() >= k-1) {

                        String back = s.substring(s.length() - k + 1);
                        if (!back.contains("1")) {
                            StringBuilder tmp = new StringBuilder(s.substring(0, s.length() - k + 1));
                            for (int j = 0; j < k; j++) {
                                tmp.append("1");
                            }
                            cache.add(tmp.toString());
                        }
                    }
                }
                result.put(len, cache.size());
            }
            int res = 0;
            for (int j = left; j <= right; j++) {
                res += result.get(j);
            }
            System.out.println(res);
        }
    }
}