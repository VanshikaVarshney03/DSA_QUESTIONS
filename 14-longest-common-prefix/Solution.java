// BRUTE FORCE


// class Solution {

//     public String longestCommonPrefix(String[] strs) {

//         String first = strs[0];

//         for(int len = first.length(); len >= 0; len--){

//             String prefix = first.substring(0, len);

//             boolean found = true;

//             for(String s : strs){

//                 if(!s.startsWith(prefix)){

//                     found = false;
//                     break;
//                 }
//             }

//             if(found)
//                 return prefix;
//         }

//         return "";
//     }
// }


class Solution {

    public String longestCommonPrefix(String[] strs) {

        String first = strs[0];

        for(int i = 0; i < first.length(); i++) {

            char ch = first.charAt(i);

            for(int j = 1; j < strs.length; j++) {

                if(i >= strs[j].length() || strs[j].charAt(i) != ch) {

                    return first.substring(0, i);
                }
            }
        }

        return first;
    }
}