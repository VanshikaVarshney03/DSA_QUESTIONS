# 122. Best Time to Buy and Sell Stock II

## Difficulty

Medium

---

## Problem Statement

You are given an integer array prices where prices[i] is the price of a given stock on the ith day.

On each day, you may decide to buy and/or sell the stock.

You can complete as many transactions as you like, but you may not hold more than one stock at a time.

Return the maximum profit you can achieve.

---

## Example 1

Input:

prices = [7,1,5,3,6,4]

Output:

7

Explanation:

Buy on day 2 and sell on day 3:

Profit = 5 - 1 = 4

Buy on day 4 and sell on day 5:

Profit = 6 - 3 = 3

Total Profit = 7

---

## Example 2

Input:

prices = [1,2,3,4,5]

Output:

4

Explanation:

Buy on day 1 and sell on day 5.

Profit = 5 - 1 = 4

---

## Brute Force Approach

Try all possible combinations of buying and selling using recursion.

At each index:

* Buy or skip.
* Sell or hold.

Explore every possible sequence of transactions.

### Time Complexity

O(2^n)

### Space Complexity

O(n)

### Drawback

Explores too many possibilities and leads to TLE.

---

## Observation

Whenever the price increases from one day to the next, we can safely add that profit.

For example:

1 → 2 → 3 → 4 → 5

Profit:

(2-1)+(3-2)+(4-3)+(5-4)

= 5 - 1

Thus, every upward movement contributes to the maximum profit.

---

## Optimal Approach

Traverse the array.

Whenever:

prices[i] > prices[i-1]

add:

prices[i] - prices[i-1]

to the answer.

This captures all profitable transactions.

---

## Dry Run

prices = [7,1,5,3,6,4]

Initial profit = 0

1 > 7 ? No

5 > 1 ? Yes

profit = 4

3 > 5 ? No

6 > 3 ? Yes

profit = 4 + 3 = 7

4 > 6 ? No

Final Answer = 7

---

## Algorithm

1. Initialize profit = 0.
2. Traverse from index 1.
3. If prices[i] > prices[i-1]:

   * Add prices[i] - prices[i-1] to profit.
4. Return profit.

---

## Complexity Analysis

### Time Complexity

O(n)

Single traversal.

### Space Complexity

O(1)

No extra space is used.

---

## Pattern

Greedy

Peak-Valley Approach

---

## Key Insight

Every upward movement contributes to the final answer.

Instead of finding the overall maximum transaction, accumulate all positive differences between consecutive days.
