# 88. Merge Sorted Array

## Difficulty

Easy

## Problem Statement

You are given two integer arrays `nums1` and `nums2`, sorted in non-decreasing order, and two integers `m` and `n`, representing the number of valid elements in `nums1` and `nums2` respectively.

Merge `nums1` and `nums2` into a single sorted array in non-decreasing order.

The final sorted array should be stored inside `nums1`.

---

## Brute Force Approach

Create a temporary array and merge both sorted arrays using two pointers. After merging, copy all elements back into `nums1`.

### Time Complexity

O(m + n)

### Space Complexity

O(m + n)

### Drawback

Uses an extra array, which is not optimal.

---

## Observation

`nums1` already contains enough extra space at the end to store all elements of `nums2`.

Instead of creating a new array, we can utilize this space and fill `nums1` from the back.

---

## Optimal Approach

Use three pointers:

* `i` → Last valid element of `nums1`
* `j` → Last element of `nums2`
* `k` → Last index of `nums1`

Compare `nums1[i]` and `nums2[j]`.

Place the larger element at `nums1[k]` and move the corresponding pointer.

Continue until all elements are merged.

---

## Algorithm

1. Initialize three pointers:

   * `i = m - 1`
   * `j = n - 1`
   * `k = m + n - 1`
2. Compare elements from the end of both arrays.
3. Place the larger element at index `k`.
4. Move the corresponding pointer.
5. Copy any remaining elements of `nums2`.

---

## Complexity Analysis

### Time Complexity

O(m + n)

### Space Complexity

O(1)

---

## Pattern

Two Pointers

---

## Key Insight

Filling the array from right to left prevents overwriting unprocessed elements and allows the merge to be performed in-place.
