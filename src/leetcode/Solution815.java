package leetcode;

import java.util.*;

//
///**
// * @program: LintCode
// * @author: YangAidi
// * @create: 2018-04-08 10:14
// **/
//public class Solution815 {
//     class MatrixUDG {
//
//        private int mEdgNum;        // 边的数量
//        private char[] mVexs;       // 顶点集合
//        private int[][] mMatrix;    // 邻接矩阵
//        private static final int INF = Integer.MAX_VALUE;   // 最大值
//    }
//    public void dijkstra(int vs, int[] prev, int[] dist) {
//
//        // flag[i]=true表示"顶点vs"到"顶点i"的最短路径已成功获取
//        boolean[] flag = new boolean[mVexs.length];
//
//        // 初始化
//        for (int i = 0; i < mVexs.length; i++) {
//            flag[i] = false;          // 顶点i的最短路径还没获取到。
//            prev[i] = 0;              // 顶点i的前驱顶点为0。
//            dist[i] = mMatrix[vs][i];  // 顶点i的最短路径为"顶点vs"到"顶点i"的权。
//        }
//
//        // 对"顶点vs"自身进行初始化
//        flag[vs] = true;
//        dist[vs] = 0;
//
//        // 遍历mVexs.length-1次；每次找出一个顶点的最短路径。
//        int k=0;
//        for (int i = 1; i < mVexs.length; i++) {
//            // 寻找当前最小的路径；
//            // 即，在未获取最短路径的顶点中，找到离vs最近的顶点(k)。
//            int min = INF;
//            for (int j = 0; j < mVexs.length; j++) {
//                if (flag[j]==false && dist[j]<min) {
//                    min = dist[j];
//                    k = j;
//                }
//            }
//            // 标记"顶点k"为已经获取到最短路径
//            flag[k] = true;
//
//            // 修正当前最短路径和前驱顶点
//            // 即，当已经"顶点k的最短路径"之后，更新"未获取最短路径的顶点的最短路径和前驱顶点"。
//            for (int j = 0; j < mVexs.length; j++) {
//                int tmp = (mMatrix[k][j]==INF ? INF : (min + mMatrix[k][j]));
//                if (flag[j]==false && (tmp<dist[j]) ) {
//                    dist[j] = tmp;
//                    prev[j] = k;
//                }
//            }
//        }
//
//        // 打印dijkstra最短路径的结果
//        System.out.printf("dijkstra(%c): \n", mVexs[vs]);
//        for (int i=0; i < mVexs.length; i++)
//            System.out.printf("  shortest(%c, %c)=%d\n", mVexs[vs], mVexs[i], dist[i]);
//    }
//}
class Solution815 {
    public int numBusesToDestination(int[][] routes, int S, int T) {
        HashSet<Integer> visited = new HashSet<>();
        Queue<Integer> q = new LinkedList<>();
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        int ret = 0;

        if (S==T) return 0;

        for(int i = 0; i < routes.length; i++){
            for(int j = 0; j < routes[i].length; j++){
                ArrayList<Integer> buses = map.getOrDefault(routes[i][j], new ArrayList<>());
                buses.add(i);
                map.put(routes[i][j], buses);
            }
        }

        q.offer(S);
        while (!q.isEmpty()) {
            int len = q.size();
            ret++;
            for (int i = 0; i < len; i++) {
                int cur = q.poll();
                ArrayList<Integer> buses = map.get(cur);
                for (int bus: buses) {
                    if (visited.contains(bus)) continue;
                    visited.add(bus);
                    for (int j = 0; j < routes[bus].length; j++) {
                        if (routes[bus][j] == T) return ret;
                        q.offer(routes[bus][j]);
                    }
                }
            }
        }
        return -1;
    }
}
