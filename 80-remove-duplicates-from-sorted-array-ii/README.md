# 80. Remove Duplicates from Sorted Array II

## Difficulty

Medium

---

## Problem Statement

Given an integer array nums sorted in non-decreasing order, remove some duplicates in-place such that each unique element appears at most twice.

The relative order of the elements should be preserved.

Return the number of elements after removing extra duplicates.

---

## Example

Input:

nums = [1,1,1,2,2,3]

Output:

5

nums = [1,1,2,2,3,_]

---

## Brute Force Approach

Create a temporary array and keep track of the frequency of each element.

Store an element only if its count is less than or equal to 2.

Finally copy all elements back to nums.

### Time Complexity

O(n)

### Space Complexity

O(n)

### Drawback

Uses extra memory and does not satisfy the in-place requirement.

---

## Observation

Since the array is sorted, duplicates occur consecutively.

We only need to ensure that no element appears more than twice.

---

## Optimal Approach

Maintain a pointer k representing the next position to fill.

Initialize:

k = 2

For every element from index 2 onwards:

If nums[i] != nums[k-2]

then place nums[i] at nums[k] and increment k.

---

## Algorithm

1. If array size <= 2 return n.
2. Initialize k = 2.
3. Traverse from i = 2.
4. If nums[i] != nums[k-2]:
    - nums[k] = nums[i]
    - k++
5. Return k.

---

## Complexity Analysis

### Time Complexity

O(n)

### Space Complexity

O(1)

---

## Pattern

Two Pointers

Array Compaction

---

## Key Insight

To allow at most two occurrences, compare the current element with the element two positions behind in the answer built so far.