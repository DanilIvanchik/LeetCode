public class IsSubsequence {

    //Lvl: Easy

    //Runtime: 0ms
    //Beats 100% of users with Java

    //Memory: 40MB
    //Beats 97.47% of users with Java

    //TODO:Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
    // A subsequence of a string is a new string that is formed from the original string by deleting
    // some (can be none) of the characters without disturbing the relative positions of the remaining
    // characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).

    public boolean isSubsequence(String s, String t) {
        int sPoint = 0;
        int tPoint = 0;
        int tLen = t.length();
        int sLen = s.length();

        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();

        if(s.length() < 1){
            return true;
        }


        while(tPoint < tLen){
            if (sPoint < sLen && sArr[sPoint] == tArr[tPoint]){
                sPoint++;
                tPoint++;
            }else{
                tPoint++;
            }
        }

        if (sPoint == sLen){
            return true;
        }
        return false;
    }
}
