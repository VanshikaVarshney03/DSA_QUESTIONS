# 189. Rotate Array

## Difficulty

Medium

---

## Problem Statement

Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.

---

## Example 1

Input:

nums = [1,2,3,4,5,6,7]

k = 3

Output:

[5,6,7,1,2,3,4]

---

## Example 2

Input:

nums = [-1,-100,3,99]

k = 2

Output:

[3,99,-1,-100]

---

## Brute Force Approach

Rotate the array one step at a time.

For each rotation:

* Store the last element.
* Shift all elements to the right.
* Place the last element at the beginning.

Repeat this process k times.

### Time Complexity

O(n × k)

### Space Complexity

O(1)

### Drawback

Very inefficient when k is large.

---

## Better Approach

Use an extra array.

For every element at index i, place it at:

(i + k) % n

Copy the temporary array back to nums.

### Time Complexity

O(n)

### Space Complexity

O(n)

### Drawback

Uses extra memory.

---

## Observation

Suppose:

1 2 3 4 | 5 6 7

Need:

5 6 7 | 1 2 3 4

This can be achieved using reversal.

---

## Optimal Approach

Step 1:

Reverse the entire array.

1 2 3 4 5 6 7

↓

7 6 5 4 3 2 1

Step 2:

Reverse first k elements.

7 6 5 | 4 3 2 1

↓

5 6 7 | 4 3 2 1

Step 3:

Reverse remaining elements.

5 6 7 | 4 3 2 1

↓

5 6 7 | 1 2 3 4

Final Answer:

5 6 7 1 2 3 4

---

## Why k = k % n ?

Rotating an array by its length results in the same array.

Example:

n = 7

k = 10

10 rotations = 7 rotations + 3 rotations

Since 7 rotations bring the array back to its original position,

k = 10 % 7 = 3

Only the remaining rotations matter.

---

## Algorithm

1. Compute k = k % n.
2. Reverse the entire array.
3. Reverse the first k elements.
4. Reverse the remaining n-k elements.

---

## Complexity Analysis

### Time Complexity

O(n)

### Space Complexity

O(1)

---

## Pattern

Array Manipulation

Reverse Technique

---

## Key Insight

To rotate an array in-place, think of it as two blocks:

A | B

Required:

B | A

This can be achieved by:

Reverse(A+B)

↓

Reverse(B)

↓

Reverse(A)
