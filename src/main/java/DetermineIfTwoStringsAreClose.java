import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;

public class DetermineIfTwoStringsAreClose {

    //Lvl: Medium

    //Runtime: 12ms
    //Beats 84.38% of users with Java

    //Memory: 44.34MB
    //Beats 85.65% of users with Java

    //TODO: Two strings are considered close if you can attain one from the other using the following operations:
    // Operation 1: Swap any two existing characters.
    // For example, abcde -> aecdb
    // Operation 2: Transform every occurrence of one existing character into another existing character, and do the same with the other character.
    // For example, aacabb -> bbcbaa (all a's turn into b's, and all b's turn into a's)
    // You can use the operations on either string as many times as necessary.
    // Given two strings, word1 and word2, return true if word1 and word2 are close, and false otherwise.

    public boolean closeStrings(String word1, String word2) {

        if(word1.length()!=word2.length()) return false;

        int a[]=new int[26];
        int b[]=new int[26];

        for(int i=0;i<word1.length();i++)
        {
            a[word1.charAt(i)-'a']++;
            b[word2.charAt(i)-'a']++;
        }

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

        for(int i=0;i<26;i++)
        {
            if((a[i]==0 && b[i]!=0 )||(a[i]!=0 && b[i]==0))
                return false;
        }
        Arrays.sort(a);
        Arrays.sort(b);

        return Arrays.equals(a,b);

    }
}
