# 169. Majority Element

## Difficulty

Easy

---

## Problem Statement

Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times.

You may assume that the majority element always exists in the array.

---

## Example 1

Input:

nums = [3,2,3]

Output:

3

---

## Example 2

Input:

nums = [2,2,1,1,1,2,2]

Output:

2

---

# Brute Force Approach

For every element, count its frequency by traversing the whole array.

If the frequency becomes greater than n/2, return that element.

### Time Complexity

O(n²)

### Space Complexity

O(1)

### Drawback

Repeatedly computes frequencies, making it inefficient.

---

# Better Approach (HashMap)

Store frequencies of all elements using a HashMap.

Return the element whose frequency exceeds n/2.

### Time Complexity

O(n)

### Space Complexity

O(n)

### Drawback

Uses extra space.

---

# Another Approach (Sorting)

Observation:

If an element appears more than n/2 times, then after sorting it must occupy the middle position.

Example:

2 2 1 1 1 2 2

Sorted:

1 1 1 2 2 2 2

Middle element = 2

Hence:

nums[n/2] is the majority element.

### Time Complexity

O(n log n)

### Space Complexity

Depends on sorting implementation.

---

# Observation

The majority element appears more than half of the time.

If different elements cancel each other, the majority element will always survive.

Example:

2 2 1 1 1 2 2

Cancel:

2 with 1

2 with 1

1 with 2

Remaining element:

2

---

# Optimal Approach

Use Boyer-Moore Voting Algorithm.

Maintain:

candidate → potential majority element

count → frequency balance

If count becomes zero:

Current element becomes the new candidate.

If current element equals candidate:

count++

Otherwise:

count--

At the end, candidate contains the majority element.

---

# Algorithm

1. Initialize candidate = 0 and count = 0.
2. Traverse the array.
3. If count becomes zero, assign current element as candidate.
4. If current element equals candidate, increment count.
5. Otherwise decrement count.
6. Return candidate.

---

# Complexity Analysis

### Time Complexity

O(n)

Single traversal of the array.

### Space Complexity

O(1)

No extra data structure is used.

---

# Pattern

Greedy

Boyer-Moore Voting Algorithm

---

# Key Insight

Different elements cancel each other out.

Since the majority element appears more than half the time, it survives all pairwise cancellations and remains as the final candidate.
