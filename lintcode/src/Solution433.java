import java.util.LinkedList;
import java.util.Queue;

/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2019-09-09 22:48
 **/

class Coordinate {
    int x, y;
    public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Solution433 {
    /**
     * @param grid a boolean 2D matrix
     * @return an integer
     */
    public int numIslands(boolean[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            return 0;
        }

        int n = grid.length;
        int m = grid[0].length;
        int islands = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j]) {
                    markByBFS(grid, i, j);
                    islands++;
                }
            }
        }

        return islands;
    }

    private void markByBFS(boolean[][] grid, int x, int y) {
        // magic numbers!
        int[] directionX = {0, 1, -1, 0};
        int[] directionY = {1, 0, 0, -1};

        Queue<Coordinate> queue = new LinkedList<>();

        queue.offer(new Coordinate(x, y));
        grid[x][y] = false;

        while (!queue.isEmpty()) {
            Coordinate coor = queue.poll();
            for (int i = 0; i < 4; i++) {
                Coordinate adj = new Coordinate(
                        coor.x + directionX[i],
                        coor.y + directionY[i]
                );
                if (!inBound(adj, grid)) {
                    continue;
                }
                if (grid[adj.x][adj.y]) {
                    grid[adj.x][adj.y] = false;
                    queue.offer(adj);
                }
            }
        }
    }

    private boolean inBound(Coordinate coor, boolean[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        return coor.x >= 0 && coor.x < n && coor.y >= 0 && coor.y < m;
    }
}


//public class Solution433 {
//    /**
//     * @param a: a boolean 2D matrix
//     * @return: an integer
//     */
//    public int numIslands(boolean[][] a) {
//        // write your code here
//        int col = a[0].length;
//        int row = a.length;
//        int count=0;
//        for(int i=0;i<row;++i){
//            for (int j=0;j<col;++j){
//                if(i==0){
//                    if(j==0&&a[i][j]){
//                        ++count;
//                    }else {
//                        if(!a[0][j - 1]&&a[i][j]){
//                            ++count;
//                        }
//                    }
//                }else if(j==0){
//                    if(!a[i-1][j]&&a[i][j]){
//                        ++count;
//                    }
//                }else {
//                    if(!a[i-1][j-1]&&a[i][j]){
//                        ++count;
//                    }
//                }
//            }
//        }
//        return count;
//    }
//
//}