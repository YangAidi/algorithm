/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2019-10-21 16:41
 **/
class Solution200 {
    public int numIslands(char[][] g) {
        int m = g.length;
        if(m == 0){
            return 0;
        }
        int n = g[0].length;
        boolean[][] b = new boolean[m][n];
        for(int i=0;i<m;++i){
            for(int j=0;j<n;++j){
                dfs(g,b,m,n,i,j,true);

            }
        }
        return res;
    }

    int res = 0;

    public void dfs(char[][] g,boolean[][] b,int m,int n,int i,int j,boolean a){
        if(b[i][j]||g[i][j]=='0'){
            return;
        }
        if(a){
            ++res;
            a=false;
        }
        b[i][j]=true;


        if(i>0&&!b[i-1][j]){
            dfs(g,b,m,n,i-1,j,a);
        }

        if(i<m-1&&!b[i+1][j]){
            dfs(g,b,m,n,i+1,j,a);
        }

        if(j>0&&!b[i][j-1]){
            dfs(g,b,m,n,i,j-1,a);
        }

        if(j<n-1&&!b[i][j+1]){
            dfs(g,b,m,n,i,j+1,a);
        }
    }
}
