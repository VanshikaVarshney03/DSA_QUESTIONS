// BRUTE FORCE

// class Solution {
//     public boolean isSubsequence(String s, String t) {
//         int pos = 0;
//         for(int i =0;i<s.length();i++){
//             char c = s.charAt(i);
//             while(pos<t.length() && t.charAt(pos)!=c) pos++;
//             if(pos==t.length()) return false;
//             pos++;

//         }
//         return true;
//     }
// }

// OPTIMIZED


class Solution {

    public boolean isSubsequence(String s, String t) {

        int i = 0;
        int j = 0;

        while(i < s.length() && j < t.length()) {

            if(s.charAt(i) == t.charAt(j)) {
                i++;
            }

            j++;
        }

        return i == s.length();
    }
}