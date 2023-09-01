import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class EqualRowAndColumnPairs {

    //Lvl: Medium

    //Runtime: 8ms
    //Beats 96.78% of users with Java

    //Memory: 52.4MB
    //Beats 21.73% of users with Java

    //TODO: Given a 0-indexed n x n integer matrix grid, return the
    // number of pairs (ri, cj) such that row ri and column cj are equal.
    // A row and column pair is considered equal if they contain the
    // same elements in the same order (i.e., an equal array).

    public int equalPairs(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[][] transpose = new int[m][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                transpose[j][i] = grid[i][j];
            }
        }
        int ans = 0;
        for(int[] row : grid){
            for(int[] col : transpose){
                if(Arrays.equals(row, col)) ans++;
            }
        }
        return ans;
    }
}
