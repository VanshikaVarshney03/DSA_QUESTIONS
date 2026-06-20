// brute
class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        for(int i =0;i<prices.length;i++){
            for(int j=i+1;j<prices.length;j++){
                int p = prices[j]-prices[i];
                max = Math.max(max,p);
            }
        }
        return max;
    }
}

// optimal
// class Solution {
//     public int maxProfit(int[] prices) {
//         int min = prices[0];
//         int max=0;
//         for(int i=1;i<prices.length;i++){
//             if(prices[i]<min){
//                 min = prices[i];
//             }
//             else{
//                 int p = prices[i]-min;
//                 max = Math.max(max,p);
//             }
//         }
//         return max;
//     }
// }
