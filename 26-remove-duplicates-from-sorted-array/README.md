# 26. Remove Duplicates from Sorted Array

## Difficulty

Easy

## Problem Statement

Given an integer array `nums` sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once.

The relative order of the elements should be maintained.

Return the number of unique elements in `nums`.

The first `k` elements of `nums` should contain the unique elements.

---

## Example 1

Input:

nums = [1,1,2]

Output:

2

nums = [1,2,_]

---

## Example 2

Input:

nums = [0,0,1,1,1,2,2,3,3,4]

Output:

5

nums = [0,1,2,3,4,*,*,*,*,_]

---

## Brute Force Approach

Create a temporary array and store only unique elements.

Since the array is sorted, a new element is unique if it is different from the previous element.

After collecting all unique elements, copy them back into the original array.

### Time Complexity

O(n)

### Space Complexity

O(n)

### Drawback

Uses an extra array, which violates the in-place requirement.

---

## Observation

The array is already sorted.

This means duplicate elements are always adjacent to each other.

If:

nums[i] != nums[i - 1]

then a new unique element has been found.

---

## Optimal Approach

Use a pointer `k` to track the position where the next unique element should be placed.

* The first element is always unique.
* Traverse the array from index 1.
* Whenever a new unique element is found:

  * Place it at nums[k]
  * Increment k

At the end, the first k elements contain all unique values.

---

## Algorithm

1. Initialize k = 1
2. Traverse the array from index 1
3. If nums[i] != nums[i - 1]

   * nums[k] = nums[i]
   * k++
4. Return k

---

## Complexity Analysis

### Time Complexity

O(n)

Single traversal of the array.

### Space Complexity

O(1)

No extra data structure is used.

---

## Pattern

Two Pointers

Array Compaction

---

## Key Insight

Since the array is sorted, duplicates appear together.

Whenever the current element differs from the previous element, it is a new unique value and should be placed at the next available position.
