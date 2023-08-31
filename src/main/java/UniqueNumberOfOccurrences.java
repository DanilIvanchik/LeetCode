import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;

public class UniqueNumberOfOccurrences {

    //Lvl: Easy

    //Runtime: 2ms
    //Beats 95.85% of users with Java

    //Memory: 40.2MB
    //Beats 95.47% of users with Java

    //TODO: Given an array of integers arr, return true if
    // the number of occurrences of each value in the array
    // is unique or false otherwise.

    public boolean uniqueOccurrences(int[] arr) {
        if (arr == null || arr.length == 0){
            return false;
        }
        Arrays.sort(arr);
        HashMap<Integer, Integer> arrMap = new HashMap<>();
        int count = 1;
        int unique = 1;
        for (int i = 1; i < arr.length; i++){
            if (arr[i-1] == arr[i]){
                count++;
            }else{
                arrMap.put(count, arr[i-1]);
                count = 1;
                unique++;
            }
        }
        arrMap.put(count, arr[arr.length-1]);
        if (unique == arrMap.size())
            return true;

        return false;
    }

}
