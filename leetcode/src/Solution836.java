/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2018-05-20 10:32
 **/
public class Solution836 {
    public void test()
    {
        System.out.println(isRectangleOverlap(new int[]{2, 17, 6, 20}, new int[]{3, 8, 6, 20}));
    }
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        if(isInMap(rec1,rec2[0],rec2[1])||isInMap(rec1,rec2[2],rec2[3])||isInMap(rec1,rec2[0],rec2[3])||isInMap(rec1,rec2[1],rec2[2]))
        {
            return true;
        }

        return false;
    }
    private boolean isInMap(int[] rec1,int x,int y){
        int x0=rec1[0];
        int x1=rec1[2];
        int y0=rec1[1];
        int y1=rec1[3];
        return x < x1 && x > x0 && y < y1 && y > y0;
    }
}
