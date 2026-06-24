// Brute force
// class Solution {

//     public boolean isPalindrome(String s) {

//         StringBuilder clean = new StringBuilder();

//         for(char ch : s.toCharArray()) {

//             if(Character.isLetterOrDigit(ch))
//                 clean.append(Character.toLowerCase(ch));
//         }

//         String original = clean.toString();

//         String reversed = clean.reverse().toString();

//         return original.equals(reversed);
//     }
// }

// Optimized
class Solution {

    public boolean isPalindrome(String s) {

        int left = 0;
        int right = s.length() - 1;

        while(left < right) {

            while(left < right &&
                  !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }

            while(left < right &&
                  !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

            if(Character.toLowerCase(s.charAt(left))
                != Character.toLowerCase(s.charAt(right))) {

                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}