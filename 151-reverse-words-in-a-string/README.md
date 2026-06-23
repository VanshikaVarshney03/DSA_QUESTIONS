# 151. Reverse Words in a String

## Difficulty

Medium

---

## Problem Statement

Given an input string `s`, reverse the order of the words.

A word is defined as a sequence of non-space characters.

The returned string should contain words separated by a single space and should not contain leading or trailing spaces.

---

## Example 1

Input:

"the sky is blue"

Output:

"blue is sky the"

---

## Example 2

Input:

"  hello world  "

Output:

"world hello"

---

## Example 3

Input:

"a good   example"

Output:

"example good a"

---

# Brute Force Approach

Remove leading and trailing spaces using `trim()`.

Split the string into words using `split("\\s+")`.

Store all words in an array.

Traverse the array from the last index to the first and append words into the answer string.

---

## Dry Run

Input:

"the sky is blue"

After split:

["the","sky","is","blue"]

Traverse from right to left:

blue

is

sky

the

Answer:

"blue is sky the"

---

## Complexity of Brute Force

Time Complexity: O(n)

Space Complexity: O(n)

---

## Drawback

The split() function creates an extra array containing all words.

Extra memory is used even though only reversing the order is required.

---

# Observation

Instead of creating an array, we can traverse the string from the end.

Extract each word and append it to the answer.

This avoids using split().

---

# Optimal Approach

Start from the last character.

Skip spaces.

Find a word.

Append it to the answer.

Repeat until the beginning of the string is reached.

---

## Complexity Analysis

Time Complexity: O(n)

Space Complexity: O(1)

(excluding output string)

---

# Pattern

Reverse Traversal

Two Pointers

---

# Key Insight

The brute force solution using split() is simple and acceptable.

The optimal approach avoids creating an extra array by traversing the string from the end and extracting words one by one.
