import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2018-04-02 09:50
 **/

// Definition for a point.
class Point {
    int x;
    int y;

    Point() {
        x = 0;
        y = 0;
    }

    Point(int a, int b) {
        x = a;
        y = b;
    }
}

//public class Solution186 {
//    /**
//     * @param points: an array of point
//     * @return: An integer
//     */
//    private Map<Integer,Integer> l=new HashMap<>();
//    public int maxPoints(Point[] points) {
//        if (points == null || points.length == 0) return 0;
//        if (points.length == 1) return 1;
//        // write your code here
//        int max = 2;
//        for (int i = 0; i < points.length; ++i) {
//            for (int j = 0; j < points.length; ++j) {
//                if (i == j) continue;
//                if (isX(points[i], points[j])) {
//                    int num = 2;
//                    for (int k = 0; k < points.length; ++k) {
//                        if (i == k || k == j) continue;
//                        if (points[k].x == points[i].x) {
//                            num++;
//                            if (num > max)
//                                max = num;
//                        }
//                    }
//                } else {
//                    double a = a(points[i], points[j]);
//                    double b = b(points[i], a);
//                    int num = 2;
//                    for (int k = 0; k < points.length; ++k) {
//                        if (i == k || k == j) continue;
//                        if (isInLine(points[k], a, b)) {
//                            num++;
//                            if (num > max)
//                                max = num;
//                        }
//                    }
//                }
//            }
//        }
//        for(Map.Entry<Integer,Integer> entry:l.entrySet())
//        {
//            System.out.println(entry.getKey()+" "+entry.getValue());
//        }
//        return max;
//    }
//
//    //y=aX+b
//    private boolean isX(Point a, Point b) {
//        return (a.x - b.x) == 0;
//    }
//
//    public double a(Point a, Point b) {
//        double d1 = (a.x - b.x);
//        double d2 = (a.y - b.y);
////        if(d1==0) return 0;
//        return d2 / d1;
//    }
//
//    private double b(Point p, double a) {
//        double d1 = p.y;
//        double d2 = a * p.x;
//        return d1 - d2;
//    }
//
//    private boolean isInLine(Point p, double a, double b) {
//        if (p.y == a * p.x + b)
//            return true;
//        else
//            l.put(p.x,p.y);
//        return false;
//    }
//}
//public class Solution186 {
//    public  int maxPoints(Point[] points) {
//        if (points == null || points.length == 0) {
//            return 0;
//        }
//
//        HashMap<Double, Integer> map=new HashMap<Double, Integer>();
//        int max = 1;
//
//        for(int i = 0 ; i < points.length; i++) {
//            // shared point changed, map should be cleared and server the new point
//            map.clear();
//
//            // maybe all points contained in the list are same points,and same points' k is
//            // represented by Integer.MIN_VALUE
//            map.put((double)Integer.MIN_VALUE, 1);
//
//            int dup = 0;
//            for(int j = i + 1; j < points.length; j++) {
//                if (points[j].x == points[i].x && points[j].y == points[i].y) {
//                    dup++;
//                    continue;
//                }
//
//                // look 0.0+(double)(points[j].y-points[i].y)/(double)(points[j].x-points[i].x)
//                // because (double)0/-1 is -0.0, so we should use 0.0+-0.0=0.0 to solve 0.0 !=-0.0
//                // problem
//
//                // if the line through two points are parallel to y coordinator, then K(slop) is
//                // Integer.MAX_VALUE
//                double key=points[j].x - points[i].x == 0 ?
//                        Integer.MAX_VALUE :
//                        0.0 + (double)(points[j].y - points[i].y) / (double)(points[j].x - points[i].x);
//
//                if (map.containsKey(key)) {
//                    map.put(key, map.get(key) + 1);
//                } else {
//                    map.put(key, 2);
//                }
//            }
//
//            for (int temp: map.values()) {
//                // duplicate may exist
//                if (temp + dup > max) {
//                    max = temp + dup;
//                }
//            }
//
//        }
//        return max;
//    }
//}
public class Solution186 {
    /**
     * @param points an array of point
     * @return an integer
     */
    public int maxPoints(Point[] points) {
        // Write your code here
        if (points == null) {
            return 0;
        }
        int ans = 0;
        for (int i = 0; i < points.length; i++) {
            Map<String, Integer> slope = new HashMap<>();
            int maxPoints = 0, overlap = 0, vertical = 0;

            for (int j = i + 1; j < points.length; j++) {
                if (points[i].x == points[j].x) {
                    if (points[i].y == points[j].y) {
                        overlap++;
                    } else {
                        vertical++;
                    }
                    continue;
                }
                int dx = points[i].x - points[j].x;
                int dy = points[i].y - points[j].y;
                int tmp = gcd(dx, dy);
                dx /= tmp;
                dy /= tmp;
                String k = dy + "/" + dx;

                if (!slope.containsKey(k)) {
                    slope.put(k, 0);
                }
                slope.put(k, slope.get(k) + 1);
                maxPoints = Math.max(maxPoints, slope.get(k));
            }
            maxPoints = Math.max(maxPoints, vertical);
            ans = Math.max(ans, maxPoints + overlap + 1);
        }
        return ans;
    }

    int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }
}