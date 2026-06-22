# 380. Insert Delete GetRandom O(1)

## Difficulty

Medium

---

## Problem Statement

Design a data structure that supports the following operations in average O(1) time:

* insert(val)
* remove(val)
* getRandom()

Each element should have equal probability of being returned by getRandom().

---

## Example

insert(1) → true

insert(2) → true

remove(1) → true

getRandom() → 2

---

# Brute Force Approach

Use an ArrayList.

### Insert

Append the value to the ArrayList.

### Remove

Search for the value and remove it.

Searching takes O(n), and deleting causes elements to shift, which also costs O(n).

### getRandom

Generate a random index and return the element at that index.

---

## Complexity of Brute Force

Insert : O(n)

Remove : O(n)

getRandom : O(1)

---

## Why Brute Force Is Bad?

The problem requires all operations to be O(1).

ArrayList supports insertion and random access efficiently, but removal is costly because elements need to be shifted.

Therefore, ArrayList alone is insufficient.

---

# Observation

HashMap provides:

* Search in O(1)
* Insert in O(1)
* Delete in O(1)

ArrayList provides:

* Random access in O(1)

Combining both gives O(1) operations.

---

# Data Structures Used

### ArrayList

Stores elements.

Example:

Index : 0 1 2

Value : 10 20 30

### HashMap

Stores value → index mapping.

10 → 0

20 → 1

30 → 2

---

# Problem During Deletion

Suppose:

10 20 30

We want to remove 20.

Removing directly from ArrayList causes shifting:

10 30

Shifting takes O(n).

---

# Key Trick

Always delete the last element.

Removing the last element from an ArrayList takes O(1).

If the element to delete is not the last element, first replace it with the last element and update the HashMap.

Then remove the last element.

Thus deletion becomes O(1).

---

# Dry Run

Initial:

List:

10 20 30

Map:

10 → 0

20 → 1

30 → 2

Remove 20:

Index of 20 = 1

Last element = 30

Replace index 1 with 30

Update map:

30 → 1

Remove last element

Delete 20 from map

Final:

List:

10 30

Map:

10 → 0

30 → 1

---

# Optimal Approach

Maintain:

### ArrayList

Stores values.

### HashMap

Stores value → index.

### Insert

Add value to the list and store its index in the map.

### Remove

Find the index using the HashMap.

Replace that element with the last element.

Update the HashMap.

Remove the last element.

Delete the removed value from the map.

### getRandom

Generate a random index and return the element at that index.

---

## Complexity Analysis

| Operation | Time Complexity |
| --------- | --------------- |
| Insert    | O(1)            |
| Remove    | O(1)            |
| getRandom | O(1)            |

Space Complexity: O(n)

---

# Pattern

HashMap + ArrayList

---

# Key Insight

To delete an element in O(1):

Swap it with the last element.

Update the HashMap.

Remove the last element.

This combination of HashMap and ArrayList allows all operations to be performed in O(1).
