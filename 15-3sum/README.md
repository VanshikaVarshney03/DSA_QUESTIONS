# 15. 3Sum

## Difficulty

Medium

---

## Problem Statement

Given an integer array nums, return all the unique triplets [nums[i], nums[j], nums[k]] such that:

nums[i] + nums[j] + nums[k] = 0

The solution set must not contain duplicate triplets.

---

## Example

Input:

nums = [-1,0,1,2,-1,-4]

Output:

[[-1,-1,2],[-1,0,1]]

---

# Brute Force Approach

Generate every possible triplet using three nested loops.

For every triplet, check if its sum is zero.

Store only unique triplets.

---

## Complexity of Brute Force

Time Complexity: O(n³)

Space Complexity: O(1)

(Excluding output)

---

## Drawback

Checking every possible triplet is extremely slow.

Many duplicate triplets are generated.

---

# Observation

Fix one element.

The remaining problem becomes finding two numbers whose sum equals the negative of the fixed element.

This is exactly the Two Sum problem.

By sorting the array, Two Pointers can solve it efficiently.

---

# Dry Run

Sorted Array:

[-4,-1,-1,0,1,2]

Fix -4

No valid pair found.

Fix -1

Left = -1

Right = 2

Sum = 0

Store:

[-1,-1,2]

Move both pointers while skipping duplicates.

Next:

Left = 0

Right = 1

Sum = 0

Store:

[-1,0,1]

Answer:

[[-1,-1,2],[-1,0,1]]

---

# Optimal Approach

Sort the array.

Fix one element.

Use two pointers to search for the remaining two elements.

Skip duplicate values for the fixed element as well as the left and right pointers.

---

## Complexity Analysis

Time Complexity: O(n²)

Space Complexity: O(1)

(Excluding output)

---

# Pattern

Sorting

Two Pointers

Duplicate Handling

---

# Key Insight

Fix one number.

Convert the remaining problem into Two Sum.

Use sorting and two pointers to reduce the complexity from O(n³) to O(n²).
