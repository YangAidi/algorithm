/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2019-08-31 21:59
 **/
public class Solution1259 {
    /**
     * @param n: a positive integer
     * @return: the minimum number of replacements
     */
    public int integerReplacement(int n) {
        return dfs(n);
    }

    private int dfs(int n){
        if(n==0 || n==1) {
            return 0;
        }

        if(n%2 == 0) {
            return dfs(n/2) + 1;
        }else if((n+1)%4==0&&(n-1 != 2)){
            return dfs(n+1)+1;
        }
        else{
            return dfs(n-1) + 1;
        }
    }
}
