public class IsSubsequence {

    //Lvl: Easy

    //Runtime: 0ms
    //Beats 100% of users with Java

    //Memory: 40MB
    //Beats 97.47% of users with Java

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
