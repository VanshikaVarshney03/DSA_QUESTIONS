//BRUTE FORCE


// class Solution {
//     public int lengthOfLastWord(String s) {

//         String[] arr = s.trim().split("\\s+");

//         return arr[arr.length-1].length();
//     }
// }

// OPTIMAL
class Solution {
    public int lengthOfLastWord(String s) {

        int i = s.length() - 1;

      
        while(i >= 0 && s.charAt(i) == ' ')
            i--;

        int count = 0;

       
        while(i >= 0 && s.charAt(i) != ' ') {

            count++;
            i--;
        }

        return count;
    }
}