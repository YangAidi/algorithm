package offer;

import java.io.*;
import java.util.Stack;

/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2019-09-11 15:57
 **/


public class Main1 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputStr = br.readLine();
        int output = solution(inputStr );
        System.out.println(output);
    }

    private static int solution(String str) {
        int count=0;
        for(int i=0;i<str.length();++i){
            if(str.charAt(i)=='('){
                ++count;
            }

            if(str.charAt(i)==')'){
                --count;
            }

            if(str.charAt(i)=='0'){
                return count;
            }
        }
        return count;
    }
}
