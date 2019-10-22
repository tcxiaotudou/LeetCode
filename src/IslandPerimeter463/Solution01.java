package IslandPerimeter463;

/**
 * @author fciasth
 * @desc https://leetcode-cn.com/problems/island-perimeter/
 * @date 2019/10/22
 */
public class Solution01 {

    public int islandPerimeter(int[][] grid) {
        int result = 0;
        for (int i = 0; i < grid.length; i++)
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    result = result + 4;
                    if (i+1 < grid.length && grid[i+1][j] == 1) {
                        result--;
                    }
                    if (i-1 >= 0 && grid[i-1][j] == 1) {
                        result--;
                    }
                    if (j+1 < grid[i].length && grid[i][j+1] == 1) {
                        result--;
                    }
                    if (j-1 >= 0 && grid[i][j-1] == 1) {
                        result--;
                    }
                }
            }
        return result;
    }
}
