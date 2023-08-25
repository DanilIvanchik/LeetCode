import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class StringCompression {

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
