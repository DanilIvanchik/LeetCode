import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class FindTheHighestAltitude {
    public int largestAltitude(int[] gain) {
        int max = 0;
        int current = 0;

        for (int i = 0; i < gain.length; i++){
            current += gain[i];
            if (current > max){
                max = current;
            }
        }
        return max;
    }
}