import java.util.List;

public class DailyTemperatures {

    //Lvl: Medium

    //Runtime: 8ms
    //Beats 96.42% of users with Java

    //Memory: 57.38MB
    //Beats 39.72% of users with Java

    //TODO: Given an array of integers temperatures represents
    // the daily temperatures, return an array answer such that
    // answer[i] is the number of days you have to wait after the
    // ith day to get a warmer temperature. If there is no future
    // day for which this is possible, keep answer[i] == 0 instead.

    public int[] dailyTemperatures(int[] T) {
        int[] result = new int[T.length];
        for (int day = T.length - 1; day >= 0; day--)
            for (int i = day - 1; i >= 0 && T[i] < T[day]; i--)
                result[i] = day - i;
        return result;
    }
}
