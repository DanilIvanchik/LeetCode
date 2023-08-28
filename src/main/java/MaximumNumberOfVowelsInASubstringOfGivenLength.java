public class MaximumNumberOfVowelsInASubstringOfGivenLength {

    //Lvl: Medium

    //Runtime: 14ms
    //Beats 71.86% of users with Java

    //Memory: 55.09MB
    //Beats 43.52% of users with Java

    //TODO: Given a string s and an integer k, return the maximum number
    // of vowel letters in any substring of s with length k. Vowel letters
    // in English are 'a', 'e', 'i', 'o', and 'u'.

    public int maxVowels(String s, int k) {
        int vowel = 0;
        for(int i =0; i< k; i++)
            if(isVowel(s.charAt(i))) vowel++;
        int max = vowel;
        for(int i = k; i < s.length(); i++){
            if(isVowel(s.charAt(i))) vowel++;
            if(isVowel(s.charAt(i-k))) vowel--;
            max = Math.max(max, vowel);
        }
        return max;
    }
    private boolean isVowel(char c){
        if((c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')) return true;
        return false;
    }
}
