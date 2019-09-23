package tx1;

import java.util.Scanner;

/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2019-09-01 21:39
 **/
public class Main1 {


    static int dfs(boolean[][] store, boolean[] opened, int now)
    {
        int res = 0;
        if (now == store.length)
        {
            int i=0;
            for(boolean b:opened){
                if(b){
                    ++i;
                }
            }
            return i;
        }
        for (int i = 0; i < store[0].length; i++)
        {
            if (store[now][i] && !opened[i])
            {
                opened[i] = true;
                res = Math.max(res, dfs(store, opened, now + 1));
                opened[i] = false;
            }
        }
        res = Math.max(res, dfs(store, opened, now + 1));
        return res;
    }


    public static void main(String[] args) {
        int n, m;
        Scanner in = new Scanner(System.in);
        n=in.nextInt();
        m=in.nextInt();
        int[] a=new int[n];
        int [] b= new int[m];
        for (int i = 0; i < n; i++)
        {
            a[i]=in.nextInt();
        }
        for (int i = 0; i < m; i++)
        {
            b[i]=in.nextInt();
        }
        boolean[][] store= new boolean[n][m];
        boolean[] opened=new boolean[m];
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < m; j++)
            {
                store[i][j] = (a[i] % 2 + b[j] % 2) % 2==1;
            }
        }
        System.out.println(dfs(store, opened, 0));
    }

}
