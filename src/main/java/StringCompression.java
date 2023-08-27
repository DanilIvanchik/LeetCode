import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class StringCompression {

    //Lvl: Medium

    //Runtime: 10ms
    //Beats 12.87%of users with Java

    //Memory: 43.34MB
    //Beats 30%of users with Java

    //TODO: Given an array of characters chars, compress it using the following
    // algorithm: Begin with an empty string s. For each group of consecutive
    // repeating characters in chars: If the group's length is 1, append the
    // character to s. Otherwise, append the character followed by the group's
    // length. The compressed string s should not be returned separately, but
    // instead, be stored in the input character array chars. Note that group
    // lengths that are 10 or longer will be split into multiple characters in
    // chars. After you are done modifying the input array, return the new length
    // of the array. You must write an algorithm that uses only constant extra space.

    public int compress(char[] chars) {



        if (chars.length == 1){
            return 1;
        }

        List<String> characterList = new ArrayList<>();
        char current = chars[0];
        int count = 0;
        String s = "";

        for (int i = 0; i < chars.length; i ++){
            char c = chars[i];
            if ( c != current){
                characterList.add(String.valueOf(current));
                current = c;
                characterList.add(Integer.toString(count));
                count = 1;
            }else if (i == chars.length-1) {
                characterList.add(String.valueOf(current));
                characterList.add(Integer.toString(count+1));
            }else if (c == current) {
                count++;
            }
        }
//

        return characterList.size();
    }
}
