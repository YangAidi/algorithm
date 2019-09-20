package test;

/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2019-09-20 14:18
 **/

import java.util.Scanner;

/**
 * <p>Copyright: Copyright (c) 2018</p >
 * <p>succez</p >
 * @author ZhangJinjin
 * @createdate 2018年5月4日
 */
public class intToHex_Alter {

    /**
     * 这次算法用了StringBuffer效率更好
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        System.out.println("请输入要转换的十进制的数：");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println("转换的十六进制的数为："+intToHex(n));
    }

    private static String intToHex(int n) {
        StringBuffer s = new StringBuffer();
        String a;
        char []b = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        while(n != 0){
            s = s.append(b[n%16]);
            n = n/16;
        }
        a = s.reverse().toString();
        return a;
    }

}
