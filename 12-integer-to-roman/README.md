# 12. Integer to Roman

## Difficulty

Medium

---

## Problem Statement

Given an integer, convert it to a Roman numeral.

Roman numerals are represented by seven symbols:

* I = 1
* V = 5
* X = 10
* L = 50
* C = 100
* D = 500
* M = 1000

Special Roman numerals are:

* IV = 4
* IX = 9
* XL = 40
* XC = 90
* CD = 400
* CM = 900

---

## Example 1

Input:

58

Output:

LVIII

Explanation:

50 + 5 + 3

L + V + III

---

## Example 2

Input:

3749

Output:

MMMDCCXLIX

---

# Brute Force Approach

Separate the number into:

* Thousands digit
* Hundreds digit
* Tens digit
* Ones digit

Handle each digit individually.

For example:

3749

Thousands:

3 → MMM

Hundreds:

7 → DCC

Tens:

4 → XL

Ones:

9 → IX

Answer:

MMMDCCXLIX

---

## Complexity of Brute Force

Time Complexity: O(1)

Space Complexity: O(1)

---

## Drawback

Need separate handling for:

* Ones
* Tens
* Hundreds
* Thousands

Requires many cases and becomes lengthy.

---

# Observation

Always pick the largest Roman numeral value that is less than or equal to the current number.

Subtract that value and continue.

This greedy choice eventually produces the correct Roman numeral.

---

# Dry Run

Input:

58

Largest value ≤ 58:

50 → L

Remaining:

8

Largest value ≤ 8:

5 → V

Remaining:

3

Largest value ≤ 3:

1 → I

Three times:

III

Answer:

LVIII

---

# Optimal Approach

Maintain two arrays:

Values:

1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1

Symbols:

M, CM, D, CD, C, XC, L, XL, X, IX, V, IV, I

Traverse both arrays from left to right.

While the current value is less than or equal to the number:

* Append its Roman symbol.
* Subtract its value from the number.

Continue until the number becomes zero.

---

## Complexity Analysis

Time Complexity: O(1)

Space Complexity: O(1)

---

# Pattern

Greedy

---

# Key Insight

Always choose the largest Roman numeral possible.

Subtract it from the number and repeat.

This greedy approach naturally handles all special cases such as:

IV, IX, XL, XC, CD and CM.
