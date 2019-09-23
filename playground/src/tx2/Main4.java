package tx2;

/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2019-09-20 20:39
 **/

import java.util.*;


public class Main4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt(), k = in.nextInt();
        int[] numbers = new int[k + 1];
        int readCount = 0;
        Set<Integer> appeared = new HashSet<>();
        for (int i = 0; i < m; i++) {
            int num = in.nextInt();
            if (appeared.contains(num)) {
                continue;
            } else {
                appeared.add(num);
            }
            if (num > 0) {
                numbers[readCount] = num;
                int now = readCount;
                while (now > 0 && numbers[now] < numbers[now - 1]) {
                    int tmp = numbers[now];
                    numbers[now] = numbers[now - 1];
                    numbers[now - 1] = tmp;
                    now--;
                }
                if (readCount < k) {
                    readCount++;
                }
            }
        }
        for (int i = 0; i < k; i++) {
            if (i == 0) {
                System.out.println(numbers[i]);
            } else {
                if(numbers[i] == 0)
                {
                    System.out.println("0");
                }
                else
                {
                    System.out.println(numbers[i] - numbers[i-1]);
                }
            }
        }
    }
}
