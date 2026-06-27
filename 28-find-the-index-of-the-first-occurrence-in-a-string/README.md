# 28. Find the Index of the First Occurrence in a String

## Difficulty

Easy

---

## Problem Statement

Given two strings `haystack` and `needle`, return the index of the first occurrence of `needle` in `haystack`.

If `needle` is not part of `haystack`, return **-1**.

---

## Example 1

Input:

```
haystack = "sadbutsad"
needle = "sad"
```

Output:

```
0
```

Explanation:

The substring `"sad"` first appears at index `0`.

---

## Example 2

Input:

```
haystack = "leetcode"
needle = "leeto"
```

Output:

```
-1
```

Explanation:

The substring `"leeto"` does not exist in `"leetcode"`.

---

# Brute Force Approach

Start checking from every possible index of the `haystack`.

For every starting index:

* Compare each character of `needle`.
* If all characters match, return that starting index.
* If a mismatch occurs, move to the next starting position.

If no complete match is found, return `-1`.

---

## Dry Run

Input:

```
haystack = "hello"
needle = "ll"
```

Start at index **0**

```
hello
↑
ll
↑
```

Mismatch.

Start at index **1**

```
hello
 ↑
 ll
 ↑
```

Mismatch.

Start at index **2**

```
hello
  ↑
  ll
  ↑
```

```
l == l ✔
l == l ✔
```

Complete match.

Answer:

```
2
```

---

## Complexity of Brute Force

**Time Complexity:** `O(n × m)`

**Space Complexity:** `O(1)`

Where:

* `n` = length of `haystack`
* `m` = length of `needle`

---

## Drawback

The same characters may be compared multiple times.

For large strings, repeated comparisons make the algorithm inefficient.

---

# Observation

Instead of restarting comparisons after every mismatch, we can remember previously matched characters.

This idea leads to advanced string matching algorithms like **KMP**, which avoids unnecessary comparisons.

---

# Optimal Approach

Traverse the `haystack`.

For every valid starting position:

* Compare characters one by one with `needle`.
* If all characters match, return the current index.
* Otherwise continue searching.

For interview purposes, this straightforward implementation is usually acceptable unless a more optimized solution is explicitly requested.

---

## Complexity Analysis

**Time Complexity:** `O(n × m)`

**Space Complexity:** `O(1)`

---

# Pattern

String Matching

---

# Key Insight

Compare the pattern with every possible starting position in the text.

Return the first index where all characters match.

If no match exists, return `-1`.

For advanced optimization, the KMP algorithm reduces the time complexity to **O(n + m)**.
