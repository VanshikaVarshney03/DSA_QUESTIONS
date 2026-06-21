// <!-- BRUTE -->


 class Solution {

    public int hIndex(int[] citations) {

        int n = citations.length;
        int ans = 0;

        for(int h=0; h<=n; h++){

            int count = 0;

            for(int citation : citations){

                if(citation >= h)
                    count++;
            }

            if(count >= h)
                ans = h;
        }

        return ans;
    }
}


// <!-- OPTIMAL -->


// class Solution {
//     public int hIndex(int[] citations) {

//         Arrays.sort(citations);

//         int n = citations.length;

//         for(int i = 0; i < n; i++) {

//             int h = n - i;

//             if(citations[i] >= h)
//                 return h;
//         }

//         return 0;
//     }
// } -->