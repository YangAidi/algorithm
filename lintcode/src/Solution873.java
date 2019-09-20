/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2019-08-30 18:41
 **/
public class Solution873 {
    /**
     * @param height:   the height
     * @param width:    the width
     * @param tree:     the position of tree
     * @param squirrel: the position of squirrel
     * @param nuts:     the position of nuts
     * @return: the minimal distance
     */
    public int minDistance(int height, int width, int[] tree, int[] squirrel, int[][] nuts) {
        // Write your code here
        int max = Integer.MIN_VALUE;
        int length = 0;
        for (int[] nut : nuts) {
            int d = getLength(squirrel[0], squirrel[1], nut[0], nut[1]);
            int d2 = getLength(tree[0], tree[1], nut[0], nut[1]);
            max = d2 - d > max ? d2 - d : max;
            length += d2 * 2;
        }
        return length - max;
    }

    private int getLength(int x1, int y1, int x2, int y2) {
        return Math.abs(x1 - x2) + Math.abs(y1 - y2);
    }
}
