import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2019-09-07 16:49
 **/
public class Solution914 {
    /**
     * @param s: the given string
     * @return: all the possible states of the string after one valid move
     */
    public List<String> generatePossibleNextMoves(String s) {
        // write your code here
        if (s == null || s.length() < 2) {
            return new ArrayList<>();
        }

        dfs(s, 0, "",0);
        res.remove(s);
        return new ArrayList<>(res);
    }

    Set<String> res = new HashSet<>();

    private void dfs(String s, int i, String pre,int count) {
        if(count>1){
            return;
        }
        if (i == s.length()) {
            res.add(pre);
            return;
        }
        if (i < s.length() - 1 && s.charAt(i) == '+' && s.charAt(i + 1) == '+') {
            dfs(s, i + 2, pre + "--",count+1);
        }
        dfs(s, i + 1, pre + s.charAt(i),count);
    }
}
