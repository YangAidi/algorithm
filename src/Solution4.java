import java.util.*;

/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2018-03-19 15:10
 * 我最初的想法是直接对n取余之类的操作，然后根据余数什么的进行判断这个数字是多少
 * 但是后来发现还有2*2 之类的数会干扰，如果穷举这些数字感觉又不合适
 * 看了参考答案，又是穷举法！！！
 **/
// version 1: O(n) scan
class Solution4 {
    /**
     * @param n an integer
     * @return the nth prime number as description.
     */
    public int nthUglyNumber(int n) {
        List<Integer> uglys = new ArrayList<Integer>();
        uglys.add(1);

        int p2 = 0, p3 = 0, p5 = 0;
        // p2, p3 & p5 share the same queue: uglys

        for (int i = 1; i < n; i++) {
            int lastNumber = uglys.get(i - 1);
            while (uglys.get(p2) * 2 <= lastNumber) p2++;
            while (uglys.get(p3) * 3 <= lastNumber) p3++;
            while (uglys.get(p5) * 5 <= lastNumber) p5++;

            uglys.add(Math.min(
                    Math.min(uglys.get(p2) * 2, uglys.get(p3) * 3),
                    uglys.get(p5) * 5
            ));
        }

        return uglys.get(n - 1);
    }

// version 2 O(nlogn) HashMap + Heap

    /**
     * @param n an integer
     * @return the nth prime number as description.
     */
    public int nthUglyNumber2(int n) {
        // Write your code here
        Queue<Long> Q = new PriorityQueue<Long>();
        HashSet<Long> inQ = new HashSet<Long>();
        Long[] primes = new Long[3];
        primes[0] = Long.valueOf(2);
        primes[1] = Long.valueOf(3);
        primes[2] = Long.valueOf(5);
        for (int i = 0; i < 3; i++) {
            Q.add(primes[i]);
            inQ.add(primes[i]);
        }
        Long number = Long.valueOf(1);
        for (int i = 1; i < n; i++) {
            number = Q.poll();
            for (int j = 0; j < 3; j++) {
                if (!inQ.contains(primes[j] * number)) {
                    Q.add(number * primes[j]);
                    inQ.add(number * primes[j]);
                }
            }
        }
        return number.intValue();
    }
}