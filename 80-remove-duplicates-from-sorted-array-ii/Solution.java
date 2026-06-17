// brute

// class Solution {
//     public int removeDuplicates(int[] nums) {

//         int n = nums.length;

//         int[] temp = new int[n];

//         temp[0] = nums[0];

//         int count = 1;
//         int k = 1;

//         for(int i = 1; i < n; i++) {

//             if(nums[i] == nums[i-1])
//                 count++;
//             else
//                 count = 1;

//             if(count <= 2)
//                 temp[k++] = nums[i];
//         }

//         for(int i = 0; i < k; i++)
//             nums[i] = temp[i];

//         return k;
//     }
// }


// optimal
class Solution {
    public int removeDuplicates(int[] nums) {

        int n = nums.length;

        if(n <= 2)
            return n;

        int k = 2;

        for(int i = 2; i < n; i++) {

            if(nums[i] != nums[k-2]) {

                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }
}