import java.util.ArrayList;
import java.util.List;

/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2019-09-06 23:32
 **/
public class Solution411 {
    public List<Integer> grayCode(int n) {
        List<Integer> res = new ArrayList<Integer>();
        for (int i = 0; i < 1 << n; i++) {
            res.add((i >> 1) ^ i);
        }
        return res;
    }
}
