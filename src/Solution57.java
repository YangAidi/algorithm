import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2018-04-06 10:47
 **/
public class Solution57 {
    /**
     * @param numbers: Give an array numbers of n integer
     * @return: Find all unique triplets in the array which gives the sum of zero.
     */
    public List<List<Integer>> threeSum(int[] numbers) {
        // write your code here
        if (numbers == null || numbers.length < 3) return null;
        List<List<Integer>> l = new ArrayList<>();
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        for (int i = 0; i < numbers.length - 2; ) {
            int left = i + 1;
            int right = numbers.length - 1;
            while (left < right) {
                if (numbers[i] + numbers[left] + numbers[right] == 0) {
                    l.add(new ArrayList<>(Arrays.asList(numbers[i], numbers[left], numbers[right])));
                    int newLfet = left;
                    int newRight = right;
                    //此处可以不设新变量就能实现，但是为了稳妥起见。。。
                    while (newLfet < right && numbers[++newLfet] == numbers[left]) ;
                    left = newLfet;
                    while (newRight > left && numbers[--newRight] == numbers[right]) ;
                    right = newRight;
                } else if (numbers[i] + numbers[left] + numbers[right] < 0) {
                    int newLfet = left;
                    while (newLfet < right && numbers[++newLfet] == numbers[left]) ;
                    left = newLfet;
                } else {
                    int newRight = right;
                    while (newRight > left && numbers[--newRight] == numbers[right]) ;
                    right = newRight;
                }

            }
            while (i < numbers.length - 2 && numbers[i] == numbers[++i]) ;
        }


        return l;
    }
}
