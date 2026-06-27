# 238. Product of Array Except Self

## Difficulty

Medium

---

## Problem Statement

Given an integer array nums, return an array answer such that answer[i] is equal to the product of all elements of nums except nums[i].

The solution must run in O(n) time and should not use the division operator.

---

## Example

Input:

nums = [1,2,3,4]

Output:

[24,12,8,6]

Explanation:

Index 0 → 2×3×4 = 24

Index 1 → 1×3×4 = 12

Index 2 → 1×2×4 = 8

Index 3 → 1×2×3 = 6

---

# Brute Force Approach

For every index, multiply every other element except itself.

Store the product in the answer array.

---

## Complexity of Brute Force

Time Complexity: O(n²)

Space Complexity: O(1)

---

## Drawback

The same multiplications are performed repeatedly, making the solution inefficient for large arrays.

---

# Observation

For every index,

Answer = Left Product × Right Product

Instead of calculating the product repeatedly, compute:

* Prefix (Left) Product
* Suffix (Right) Product

---

# Dry Run

Input:

[1,2,3,4]

Left Product:

[1,1,2,6]

Right Product:

[24,12,4,1]

Multiply:

1×24 = 24

1×12 = 12

2×4 = 8

6×1 = 6

Answer:

[24,12,8,6]

---

# Optimal Approach

Store prefix products directly in the answer array.

Traverse from right while maintaining a running suffix product.

Multiply the prefix product with the suffix product to get the final answer.

---

## Complexity Analysis

Time Complexity: O(n)

Space Complexity: O(1)

(Extra space excluding output array)

---

# Pattern

Prefix Product

Suffix Product

---

# Key Insight

Answer[i] = Product of elements before i × Product of elements after i.

The answer array stores the left products, while a single variable maintains the right product during reverse traversal.
