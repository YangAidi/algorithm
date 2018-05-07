package LeetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2018-05-06 09:34
 **/
public class Solution830 {
    public List<List<Integer>> largeGroupPositions(String S) {
        List<List<Integer>> result = new ArrayList<>();
        char c = ' ';
        int num = 1;
        int begin = 0;
        int end = 0;
        for (int i = 0; i < S.length() - 1; ++i) {
            if (S.charAt(i) == S.charAt(i + 1)) {
                num++;
                end = i + 1;
            } else {
                num = 1;
                if (end - begin >= 2) {
                    List<Integer> list = new ArrayList();
                    list.add(begin);
                    list.add(end);
                    result.add(list);
                }
                begin = i + 1;
                end = i + 1;
            }
            if (end == S.length() - 1 && end - begin >= 2) {
                List<Integer> list = new ArrayList();
                list.add(begin);
                list.add(end);
                result.add(list);
            }
        }

        return result;
    }
}
