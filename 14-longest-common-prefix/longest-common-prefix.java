import java.util.Arrays;

class Solution {
    public String longestCommonPrefix(String[] strs) {

        Arrays.sort(strs);

        String start = strs[0];
        String last = strs[strs.length - 1];

        int i = 0;

        while (i < start.length() &&
               i < last.length() &&
               start.charAt(i) == last.charAt(i)) {
            i++;
        }

        return start.substring(0, i);
    }
}