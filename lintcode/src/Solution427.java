import java.util.ArrayList;
import java.util.List;

/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2019-09-06 23:09
 **/
public class Solution427 {
    /**
     * @param n: n pairs
     * @return: All combinations of well-formed parentheses
     */
    public List<String> generateParenthesis(int n) {
        // write your code here
        dfs(n,0,0,"");
        return res;
    }

    private List<String> res = new ArrayList<>();
    private void dfs(int n,int left,int right,String pre){
        if(left==n){
            StringBuilder s= new StringBuilder();
            for(;right<left;++right){
                s.append(")");
            }
            res.add(pre+s);
            return;
        }
        dfs(n, left+1, right, pre+"(");
        if(right<left) {
            dfs(n, left, right + 1, pre + ")");
        }
    }
}
