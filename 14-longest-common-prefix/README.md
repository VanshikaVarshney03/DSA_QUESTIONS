# 14. Longest Common Prefix

## Difficulty

Easy

---

## Problem Statement

Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

---

## Example 1

Input:

["flower","flow","flight"]

Output:

"fl"

---

## Example 2

Input:

["dog","racecar","car"]

Output:

""

Explanation:

There is no common prefix among the input strings.

---

# Brute Force Approach

Take the first string and generate all possible prefixes.

For example:

flower

flowe

flow

flo

fl

f

""

For every prefix, check whether every string starts with that prefix.

Return the first valid prefix encountered.

---

## Complexity of Brute Force

Time Complexity: O(n × m²)

Space Complexity: O(1)

where:

* n = number of strings
* m = length of first string

---

## Drawback

Generating all prefixes repeatedly is unnecessary.

Many comparisons are performed multiple times.

---

# Observation

Instead of generating prefixes, compare strings vertically.

Example:

flower

flow

flight

↓

f ✓

l ✓

o ✗

As soon as a mismatch occurs, stop.

Everything before the mismatch is the longest common prefix.

---

# Dry Run

Input:

["flower","flow","flight"]

Index 0:

f

f

f

Same.

Index 1:

l

l

l

Same.

Index 2:

o

o

i

Mismatch.

Answer = "fl"

---

# Optimal Approach

Take the first string.

Traverse character by character.

For each character, compare it with the character at the same position in all other strings.

Stop when:

* A string becomes shorter.
* Characters do not match.

Return the substring from index 0 to the mismatch position.

---

## Complexity Analysis

Time Complexity: O(n × m)

Space Complexity: O(1)

where:

* n = number of strings
* m = length of shortest string

---

# Pattern

Vertical Scanning

---

# Key Insight

Compare strings column by column instead of generating prefixes.

As soon as one column differs, the common prefix ends.

This reduces the complexity from O(n × m²) to O(n × m).
