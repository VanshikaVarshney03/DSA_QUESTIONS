# 27. Remove Element

## Difficulty

Easy

## Problem Statement

Given an integer array nums and an integer val, remove all occurrences of val in-place.

The order of the elements may be changed. Return the number of elements in nums which are not equal to val.

The first k elements of nums should contain the elements that are not equal to val.

---

## Example

Input:

nums = [3,2,2,3]

val = 3

Output:

2

nums = [2,2,*,*]

---

## Brute Force Approach

Create a temporary array and store all elements that are not equal to val.

After traversing the array, copy the elements back into nums.

### Time Complexity

O(n)

### Space Complexity

O(n)

### Drawback

Uses extra space which violates the in-place requirement.

---

## Observation

We only need to keep elements that are not equal to val.

Instead of creating a new array, we can overwrite unwanted elements and place valid elements at the beginning of the array.

---

## Optimal Approach

Use a pointer k that represents the next position where a valid element should be placed.

Traverse the array:

* If nums[i] != val

  * Place it at nums[k]
  * Increment k

At the end, k represents the number of valid elements.

---

## Algorithm

1. Initialize k = 0
2. Traverse the array
3. If nums[i] != val

   * nums[k] = nums[i]
   * k++
4. Return k

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

Keep only the required elements and overwrite unwanted elements in-place without using extra memory.
