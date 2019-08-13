package huawei;

import java.util.Scanner;

/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2019-08-07 19:09
 **/
public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] array = new int[10000];
        int i = 0;
        while (i < n ) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            in.hasNextInt();
            int a = in.nextInt();
//            int b = in.nextInt();
//            System.out.println(a / 2);
//            System.out.println("i="+i+"; a="+a);
            ++i;
            array[a] = 1;
        }
        for (int k=0;k<array.length; ++k) {
            if (array[k] > 0) {
                System.out.println(k);
            }
        }
    }
}
