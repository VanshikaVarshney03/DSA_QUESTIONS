# 104. Maximum Depth of Binary Tree

## Difficulty

Easy

---

## Problem Statement

Given the root of a binary tree, return its maximum depth.

The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

---

## Example

Input:

```
    3
   / \
  9  20
    /  \
   15   7
```

Output:

```
3
```

---

# Brute Force Thinking

Traverse every possible path from the root to every leaf node.

Calculate the depth of each path.

Return the maximum depth among all paths.

---

## Complexity of Brute Force

Time Complexity: O(n)

Space Complexity: O(h)

where h is the height of the tree.

---

## Why Brute Force is Bad?

A recursive DFS already visits every node exactly once.

There is no unnecessary computation.

This recursive solution is already optimal.

---

# Observation

The depth of a node depends on the deeper subtree.

For every node:

Depth = 1 + Maximum(Left Depth, Right Depth)

---

## Dry Run

Tree:

```
      3
     / \
    9   20
       /  \
      15   7
```

Depth(15) = 1

Depth(7) = 1

Depth(20) = 1 + max(1,1) = 2

Depth(9) = 1

Depth(3) = 1 + max(1,2) = 3

Answer = 3

---

# Optimal Approach

Use recursion.

If the node is null, return 0.

Recursively calculate:

* Left subtree depth
* Right subtree depth

Return:

1 + max(leftDepth, rightDepth)

---

## Complexity Analysis

Time Complexity: O(n)

Space Complexity: O(h)

---

# Pattern

Binary Tree

Recursion

Depth First Search (DFS)

---

# Key Insight

The depth of the current node is one plus the maximum depth of its left and right subtrees.
