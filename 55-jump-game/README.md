# 55. Jump Game

## Difficulty

Medium

---

## Problem Statement

You are given an integer array `nums`. Each element represents the maximum jump length at that position.

Determine whether you can reach the last index starting from the first index.

---

## Example 1

Input:

nums = [2,3,1,1,4]

Output:

true

Explanation:

0 → 1 → 4

Hence, the last index is reachable.

---

## Example 2

Input:

nums = [3,2,1,0,4]

Output:

false

Explanation:

The jump length becomes zero before reaching the last index.

---

# Brute Force Approach

From every index, try all possible jumps.

If any path reaches the last index, return true.

Otherwise, return false.

### Brute Force Code

```java
class Solution {

    public boolean canJump(int[] nums) {
        return solve(nums,0);
    }

    public boolean solve(int[] nums, int index){

        if(index >= nums.length - 1)
            return true;

        for(int jump = 1; jump <= nums[index]; jump++){

            if(solve(nums,index + jump))
                return true;
        }

        return false;
    }
}
```

### Time Complexity

O(2ⁿ)

### Space Complexity

O(n)

### Drawback

Explores all possible paths and leads to Time Limit Exceeded (TLE).

---

# Observation

Instead of asking:

"Where should I jump next?"

Ask:

"What is the farthest index I can reach so far?"

Maintain the maximum reachable index while traversing the array.

---

# Optimal Approach

Maintain:

farthest → maximum index reachable till now.

For every index:

If:

i > farthest

then the current index itself is unreachable.

Return false.

Otherwise update:

farthest = max(farthest, i + nums[i])

If traversal completes successfully, return true.

---

# Dry Run

nums = [2,3,1,1,4]

Initially:

farthest = 0

i = 0

Reach = 0 + 2 = 2

farthest = 2

i = 1

Reach = 1 + 3 = 4

farthest = 4

i = 2

Reach = 2 + 1 = 3

farthest remains 4

i = 3

Reach = 3 + 1 = 4

Traversal completes.

Answer = true

---

# Algorithm

1. Initialize farthest = 0.
2. Traverse the array.
3. If i > farthest, return false.
4. Update:

farthest = max(farthest, i + nums[i])

5. If traversal completes, return true.

---

# Complexity Analysis

### Time Complexity

O(n)

Single traversal.

### Space Complexity

O(1)

No extra space used.

---

# Pattern

Greedy

Farthest Reach

---

# Key Insight

At index i, the farthest position reachable is:

i + nums[i]

Maintain the maximum reachable index encountered so far.

If at any point the current index exceeds the maximum reachable index, reaching the end becomes impossible.
