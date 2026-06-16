//  WITH EXTRA SPACE
// class Solution {
//     public void merge(int[] nums1, int m, int[] nums2, int n) {

//         int[] temp = new int[m+n];

//         int i = 0;
//         int j = 0;
//         int k = 0;

//         while(i < m && j < n){

//             if(nums1[i] <= nums2[j]){
//                 temp[k++] = nums1[i++];
//             }else{
//                 temp[k++] = nums2[j++];
//             }
//         }

//         while(i < m){
//             temp[k++] = nums1[i++];
//         }

//         while(j < n){
//             temp[k++] = nums2[j++];
//         }

//         for(int x=0;x<m+n;x++){
//             nums1[x] = temp[x];
//         }
//     }
// }



// WITHOUT EXTRA SPACE

class Solution {

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while(i >= 0 && j >= 0){

            if(nums1[i] > nums2[j]){
                nums1[k] = nums1[i];
                i--;
            }else{
                nums1[k] = nums2[j];
                j--;
            }

            k--;
        }

        while(j >= 0){
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }
}
