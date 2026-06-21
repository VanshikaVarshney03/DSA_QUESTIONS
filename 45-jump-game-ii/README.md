# 45. Jump Game II

## Difficulty

Medium

---

## Problem Statement

You are given a 0-indexed array of integers nums of length n.

Each element nums[i] represents the maximum jump length at index i.

Your goal is to reach the last index in the minimum number of jumps.

You can assume that you can always reach the last index.

---

## Example 1

Input:

nums = [2,3,1,1,4]

Output:

2

Explanation:

Jump from index 0 to 1, then from index 1 to 4.

---

## Example 2

Input:

nums = [2,3,0,1,4]

Output:

2

---

# Brute Force Approach

From every index, try all possible jumps recursively.

Take the minimum among all possible paths.

### Brute Force Code

```java
class Solution {

    public int solve(int[] nums, int index) {

        if(index >= nums.length - 1)
            return 0;

        int minJumps = Integer.MAX_VALUE;

        for(int jump = 1; jump <= nums[index]; jump++) {

            minJumps = Math.min(minJumps,
                    1 + solve(nums, index + jump));
        }

        return minJumps;
    }

    public int jump(int[] nums) {
        return solve(nums,0);
    }
}
```

### Time Complexity

O(2ⁿ)

### Space Complexity

O(n)

### Drawback

Explores all possible paths and results in Time Limit Exceeded.

---

# Observation

Instead of deciding where to jump next, think in terms of ranges.

Suppose:

nums = [2,3,1,1,4]

From index 0:

Reachable range after first jump:

[1,2]

From indices 1 and 2:

Maximum reachable index becomes:

4

Hence after second jump we can reach the end.

Answer = 2

---

# Optimal Approach

Maintain three variables:

jumps → Number of jumps taken.

currentEnd → End of the current jump range.

farthest → Farthest index reachable from the current range.

For every index:

Update:

farthest = max(farthest, i + nums[i])

Whenever:

i == currentEnd

we have exhausted the current jump.

Take another jump and update:

currentEnd = farthest

---

# Dry Run

nums = [2,3,1,1,4]

Initially:

jumps = 0

currentEnd = 0

farthest = 0

i = 0

farthest = max(0,0+2)=2

i == currentEnd

jumps = 1

currentEnd = 2

i = 1

farthest = max(2,1+3)=4

i = 2

farthest = max(4,2+1)=4

i == currentEnd

jumps = 2

currentEnd = 4

Reached the end.

Answer = 2

---

# Algorithm

1. Initialize:

jumps = 0

currentEnd = 0

farthest = 0

2. Traverse the array till n-2.

3. Update:

farthest = max(farthest, i + nums[i])

4. Whenever i reaches currentEnd:

* Increment jumps.
* Update currentEnd = farthest.

5. Return jumps.

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

Level Traversal

Farthest Reach

---

# Key Insight

Think of each jump as a level.

currentEnd marks the boundary of the current level.

farthest stores the farthest position reachable from that level.

Whenever we finish the current level, we increase the jump count and move to the next level.

This is equivalent to BFS without using a queue.
