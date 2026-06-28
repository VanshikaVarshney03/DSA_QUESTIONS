# 67. Add Binary

## Difficulty

Easy

---

## Problem Statement

Given two binary strings `a` and `b`, return their sum as a binary string.

The strings contain only `0` and `1`.

---

## Example 1

Input:

a = "11"

b = "1"

Output:

"100"

---

## Example 2

Input:

a = "1010"

b = "1011"

Output:

"10101"

---

# Brute Force Thinking

Perform binary addition exactly the same way as manual addition.

Start from the last digit of both strings.

Maintain a carry throughout the addition.

At every step:

* Add current digit of `a`
* Add current digit of `b`
* Add previous carry

Then,

* Store `sum % 2` as the current answer digit.
* Store `sum / 2` as the new carry.

Continue until both strings are completely traversed.

If a carry remains at the end, append it.

Finally, reverse the answer because it was built from right to left.

---

## Dry Run

Input:

a = "1010"

b = "1011"

Initial:

i = 3

j = 3

carry = 0

answer = ""

Iteration 1:

0 + 1 + 0 = 1

Answer = "1"

Carry = 0

Iteration 2:

1 + 1 + 0 = 2

Answer Digit = 0

Carry = 1

Answer = "10"

Iteration 3:

0 + 0 + 1 = 1

Answer = "101"

Carry = 0

Iteration 4:

1 + 1 + 0 = 2

Answer Digit = 0

Carry = 1

Answer = "1010"

Carry still exists.

Append carry.

Answer = "10101"

Reverse and return.

---

## Complexity of Brute Force

Time Complexity: **O(max(n, m))**

Space Complexity: **O(max(n, m))**

where

* n = length of a
* m = length of b

---

## Why Brute Force is Bad?

In this problem, the brute force approach itself is already the optimal solution.

There is no unnecessary computation.

Every digit is processed exactly once.

---

# Observation

Instead of converting binary strings into decimal numbers (which may overflow for large inputs), process one digit at a time from right to left.

This is exactly how binary addition is performed manually.

---

# Optimal Approach

Use two pointers:

* One starts from the end of string `a`.
* One starts from the end of string `b`.

Maintain a carry.

For every iteration:

* Compute total sum.
* Current answer digit = `sum % 2`
* New carry = `sum / 2`

Append the answer digit.

At the end, append any remaining carry.

Reverse the result and return it.

---

## Complexity Analysis

Time Complexity: **O(max(n, m))**

Space Complexity: **O(max(n, m))**

---

# Pattern

* Reverse Traversal
* Carry Handling
* StringBuilder

---

# Key Insight

The maximum possible sum at any position is:

1 + 1 + Carry = 3

Therefore:

* Answer Digit = `sum % 2`
* Carry = `sum / 2`

This simple observation makes the entire solution easy to implement.
