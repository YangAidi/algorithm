class Solution3 {
    /*
     * param k : As description.
     * param n : As description.
     * return: An integer denote the count of digit k in 1..n
     * 这个题目没想到参考答案用的竟然是枚举法，竟然还能通过？
     * 看了第二个参考答案感觉更好一些，和我的思路比较接近，但是我的遇到了一些问题没有解决，后来感觉太麻烦了
     */
    public int digitCounts(int k, int n) {
        // write your code here
        if (n == 0 && k == 0) {
            return 1;
        }
        int count = 0;
        int time = 1;
        int last = 0;
        while (n > 0) {
            int rest = n%10;
            n = n/10;
            if (n == 0 && k == 0) {
                return count;
            }
            if (rest > k) {
                count += (n + 1) * time;
            } else if (rest == k) {
                count += n * time + last + 1;
            } else {
                count += n * time;
            }
            if (n > 0 && k == 0 && time != 1) {
                count = count - time;
            }
            last += rest * time;
            time *= 10;
        }
        return count;
    }
    public int digitCounts2(int k, int n) {
        // write your code here
        int cnt = 0;
        for (int i = k; i <= n; i++) {
            cnt += singleCount(i, k);
        }
        return cnt;
    }

    public int singleCount(int i, int k) {
        if (i == 0 && k == 0)
            return 1;
        int cnt = 0;
        while (i > 0) {
            if (i % 10 == k) {
                cnt++;
            }
            i = i / 10;
        }
        return cnt;
    }
};