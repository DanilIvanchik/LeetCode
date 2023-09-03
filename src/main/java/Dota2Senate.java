import java.util.LinkedList;
import java.util.Queue;

public class Dota2Senate {

    //Lvl: Medium

    //Runtime: 10ms
    //Beats 82.62% of users with Java

    //Memory: 44.52MB
    //Beats 11.09% of users with Java

    //TODO: Given an array of integers nums, calculate the pivot
    // index of this array. The pivot index is the index where the
    // sum of all the numbers strictly to the left of the index is
    // equal to the sum of all the numbers strictly to the index's
    // right. If the index is on the left edge of the array, then the
    // left sum is 0 because there are no elements to the left. This
    // also applies to the right edge of the array. Return the leftmost
    // pivot index. If no such index exists, return -1.

    public String predictPartyVictory(String senate) {
        Queue<Integer> rad = new LinkedList<>();
        Queue<Integer> dir = new LinkedList<>();
        int n = senate.length();
        for (int i = 0; i < n; i++){
            if (senate.charAt(i) == 'R'){
                rad.add(i);
            }else{
                dir.add(i);
            }
        }

        while (!rad.isEmpty() && !dir.isEmpty()){
            int r_index = rad.poll(), d_index = dir.poll();
            if(r_index < d_index)rad.add(r_index + n);
            else dir.add(d_index + n);
        }
        return (rad.size() > dir.size())? "Radiant" : "Dire";
    }
}
