# 13. Roman to Integer

## Difficulty

Easy

---

## Problem Statement

Roman numerals are represented by seven different symbols:

* I = 1
* V = 5
* X = 10
* L = 50
* C = 100
* D = 500
* M = 1000

Given a Roman numeral, convert it to an integer.

---

## Example 1

Input:

III

Output:

3

Explanation:

1 + 1 + 1 = 3

---

## Example 2

Input:

LVIII

Output:

58

Explanation:

L = 50

V = 5

III = 3

Total = 58

---

## Example 3

Input:

MCMIV

Output:

1904

---

# Brute Force Approach

Handle every special case separately.

Special cases:

* IV = 4
* IX = 9
* XL = 40
* XC = 90
* CD = 400
* CM = 900

Whenever a special pair appears, add its value and skip the next character.

Otherwise add the value of the current symbol.

---

## Complexity of Brute Force

Time Complexity: O(n)

Space Complexity: O(1)

---

## Drawback

Too many special cases need to be remembered and coded.

The solution becomes lengthy and difficult to maintain.

---

# Observation

Consider:

VI

Values:

5, 1

Since 5 > 1, answer is:

5 + 1 = 6

Now consider:

IV

Values:

1, 5

Since 1 < 5, answer is:

5 - 1 = 4

Similarly:

IX = 9

XL = 40

XC = 90

CD = 400

CM = 900

---

# Key Observation

If the current symbol has a smaller value than the next symbol, subtract it.

Otherwise add it.

This single observation automatically handles all special cases.

---

# Dry Run

Input:

MCMIV

Values:

1000 100 1000 1 5

Start:

ans = 0

M:

1000 > 100

Add

ans = 1000

C:

100 < 1000

Subtract

ans = 900

M:

1000 > 1

Add

ans = 1900

I:

1 < 5

Subtract

ans = 1899

V:

Add

ans = 1904

Answer = 1904

---

# Optimal Approach

Traverse the string from left to right.

For every character:

If current value < next value

Subtract current value.

Else

Add current value.

---

## Complexity Analysis

Time Complexity: O(n)

Space Complexity: O(1)

---

# Pattern

Simulation

Observation-Based Traversal

---

# Key Insight

Instead of remembering:

IV, IX, XL, XC, CD, CM

remember only one rule:

Current Value < Next Value

↓

Subtract

Otherwise

↓

Add

This single rule solves all special cases elegantly.
