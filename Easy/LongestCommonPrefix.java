package Easy;

public class LongestCommonPrefix {
    class Solution {
        public String longestCommonPrefix(String[] strs) {
            String oldPrefix = strs[0];
            String newPrefix = "";

            for (String word : strs) {
                newPrefix = "";

                int referenceLength = (oldPrefix.length() > word.length()) ? word.length() : oldPrefix.length();

                for (int i = 0; i < referenceLength; i++) {
                    if (oldPrefix.charAt(i) == word.charAt(i))
                        newPrefix = newPrefix.concat(Character.toString(word.charAt(i)));
                    else
                        break;
                }

                oldPrefix = newPrefix.toString();
            }

            return newPrefix;
        }
    }
}
