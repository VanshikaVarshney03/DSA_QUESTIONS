// brute force 
// class Solution {

//     public int removeDuplicates(int[] nums) {

//         int n = nums.length;

//         int[] temp = new int[n];

//         temp[0] = nums[0];

//         int k = 1;

//         for(int i = 1; i < n; i++) {

//             if(nums[i] != nums[i - 1]) {
//                 temp[k++] = nums[i];
//             }
//         }

//         for(int i = 0; i < k; i++) {
//             nums[i] = temp[i];
//         }

//         return k;
//     }
// }

// optimal


class Solution {

    public int removeDuplicates(int[] nums) {

        int k = 1;

        for(int i = 1; i < nums.length; i++) {

            if(nums[i] != nums[i - 1]) {

                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }
}