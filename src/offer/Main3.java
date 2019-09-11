package offer;
import java.io.*;
import java.util.Arrays;

/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2019-09-11 15:58
 **/
public class Main3 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputStr = br.readLine();
        int input[] = parseInts(inputStr.split(" "));
        int output = solution(input);
        System.out.println(output);
    }

    private static int[] parseInts(String[] strArr) {
        if (strArr == null || strArr.length == 0) {
            return new int[0];
        }
        int[] intArr = new int[strArr.length];
        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = Integer.parseInt(strArr[i]);
        }
        return intArr;
    }

    private static int solution(int[] input) {
        b=new boolean[input.length];
        for (int j=0;j<input.length;++j) {
            if(j>0&&input[j]==input[j-1]){
                continue;
            }
            Arrays.fill(b,false);
            b[j]=true;
            int end = j;
            while (end<input.length){
                if(b[end]){
                    ++end;
                }
                if(end<input.length&&input[end]!=input[j]){
                    break;
                }
                ++end;
            }
            Arrays.fill(b,j,end-1,true);
            int count =end-j;
            dfs(input,j,count*count,count);
        }

        return max;

    }

    private static void dfs(int[] input, int i, int sum,int count){
        if(sum > max && count<input.length){
            max=sum;
        }
        if(count>=input.length){
            return;
        }
        for (int j=0;j<input.length;++j){
            if(!b[j]&&i!=j){
                b[j]=true;
                int end = j;
                while (end<input.length){
                    if(b[end]){
                        ++end;
                    }
                    if(end<input.length&&input[end]!=input[j]){
                        break;
                    }
                    ++end;
                }
                Arrays.fill(b,j,end-1,true);

                dfs(input,end,sum+(end-j)*(end-j),count+end-j);

                Arrays.fill(b,j,end-1,false);
            }
        }
    }

    private static int max = Integer.MIN_VALUE;
    static boolean[] b;
}
