# 125. Valid Palindrome

## Difficulty

Easy

---

## Problem Statement

A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward.

Return true if the given string is a palindrome, otherwise return false.

---

## Example 1

Input:

"A man, a plan, a canal: Panama"

Output:

true

Explanation:

After removing special characters and converting to lowercase:

amanaplanacanalpanama

which reads the same forward and backward.

---

## Example 2

Input:

"race a car"

Output:

false

---

# Brute Force Approach

Create a new string containing only alphanumeric characters.

Convert all characters to lowercase.

Reverse the cleaned string.

Compare the cleaned string with its reverse.

If both are equal, return true.

Otherwise return false.

---

## Complexity of Brute Force

Time Complexity: O(n)

Space Complexity: O(n)

---

## Drawback

Extra memory is required to create:

* Cleaned string
* Reversed string

This can be avoided.

---

# Observation

A palindrome can be checked directly from both ends.

Compare:

First character ↔ Last character

Second character ↔ Second last character

and so on.

Special characters can be skipped during traversal.

---

# Dry Run

Input:

"A man, a plan, a canal: Panama"

Left Pointer:

A

Right Pointer:

a

Match.

Continue skipping spaces and special characters.

All corresponding characters match.

Return true.

---

# Optimal Approach

Use two pointers.

Left pointer starts from the beginning.

Right pointer starts from the end.

Skip non-alphanumeric characters.

Compare lowercase versions of both characters.

If a mismatch occurs, return false.

Otherwise continue until pointers cross.

---

## Complexity Analysis

Time Complexity: O(n)

Space Complexity: O(1)

---

# Pattern

Two Pointers

---

# Key Insight

Instead of creating a cleaned string and reversing it, compare characters directly from both ends.

This reduces space complexity from O(n) to O(1).
