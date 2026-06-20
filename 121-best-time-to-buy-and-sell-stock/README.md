
# 121. Best Time to Buy and Sell Stock

## Difficulty

Easy

---

## Problem Statement

You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve.

If no profit is possible, return 0.

---

## Example 1

Input:

prices = [7,1,5,3,6,4]

Output:

5

Explanation:

Buy on day 2 at price = 1

Sell on day 5 at price = 6

Profit = 6 - 1 = 5

---

## Example 2

Input:

prices = [7,6,4,3,1]

Output:

0

Explanation:

No profitable transaction is possible.

---

# Brute Force Approach

For every day, assume that we buy the stock on that day.

Then check every future day and calculate the profit obtained by selling on that day.

Keep track of the maximum profit.

### Brute Force Code

```java
class Solution {
    public int maxProfit(int[] prices) {

        int maxProfit = 0;

        for(int i = 0; i < prices.length; i++) {

            for(int j = i + 1; j < prices.length; j++) {

                int profit = prices[j] - prices[i];

                maxProfit = Math.max(maxProfit, profit);
            }
        }

        return maxProfit;
    }
}
```

### Time Complexity

O(n²)

### Space Complexity

O(1)

### Drawback

This approach checks all pairs and will give TLE for n = 10^5.

---

# Observation

To maximize profit on a particular day, we only need the minimum price seen before that day.

Instead of checking all previous prices, maintain the minimum price encountered so far.

---

# Optimal Approach

Maintain:

minPrice → Minimum stock price seen so far.

maxProfit → Maximum profit obtained so far.

For every price:

* Update minPrice if the current price is smaller.
* Otherwise calculate:

profit = currentPrice - minPrice

Update maxProfit accordingly.

---

# Dry Run

prices = [7,1,5,3,6,4]

Initially:

minPrice = 7

maxProfit = 0

Current = 1

minPrice = 1

Current = 5

Profit = 5 - 1 = 4

maxProfit = 4

Current = 3

Profit = 3 - 1 = 2

Current = 6

Profit = 6 - 1 = 5

maxProfit = 5

Current = 4

Profit = 4 - 1 = 3

Final Answer = 5

---

# Algorithm

1. Initialize:

minPrice = prices[0]

maxProfit = 0

2. Traverse the array.

3. If current price is smaller than minPrice:

Update minPrice.

4. Otherwise calculate:

profit = currentPrice - minPrice

Update maxProfit.

5. Return maxProfit.

---

# Complexity Analysis

### Time Complexity

O(n)

Single traversal.

### Space Complexity

O(1)

No extra space is used.

---

# Pattern

Greedy

Running Minimum

---

# Key Insight

To maximize profit on a given day, we only need the minimum price seen before that day.

Maintaining a running minimum eliminates the need for nested loops and reduces the complexity from O(n²) to O(n).
