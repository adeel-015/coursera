
# Enrichment Interview-Style Questions – Algorithms

## Question 1: 3-SUM in Quadratic Time

**Problem:**  
Design an algorithm for the 3-SUM problem that takes time proportional to n² in the worst case. You may assume that you can sort the n integers in time proportional to n² or better.

**Pseudocode:**  
Sort the array a[]           // O(n²) or better assumed  
for i from 0 to n-2:  
  j = i + 1  
  k = n - 1  
  while j < k:  
    sum = a[i] + a[j] + a[k]  
    if sum == 0:  
      return true      // or store the triplet  
    else if sum < 0:  
      j = j + 1  
    else:  
      k = k - 1  
return false

**Time Complexity:**  
O(n²)

---

## Question 2: Search in a Bitonic Array

**Problem:**  
An array is *bitonic* if it is comprised of an increasing sequence followed by a decreasing sequence. Given a bitonic array of n distinct integers, determine whether a given integer exists in the array.

### Standard Version: ∼ 3 log n compares in the worst case

**Pseudocode:**  
Find peak index p using binary search       // O(log n)  
if binary_search(a[0..p], x) == true:  
  return true  
else if binary_search_desc(a[p+1..n-1], x) == true:  
  return true  
else:  
  return false

---

### Signing Bonus: ∼ 2 log n compares in the worst case

**Optimized Pseudocode (Modified Binary Search):**  
Perform binary search:  
- At each step, compare a[mid] with its neighbors  
- Decide if you are in increasing or decreasing part  
- Depending on x and slope, go left or right

**Worst-case Time Complexity:**  
O(log n)

---

## Question 3: Egg Drop

**Problem:**  
You have an n-story building (floors 1 through n) and plenty of eggs. An egg breaks if dropped from floor T or higher and does not break otherwise. Find a strategy to determine T under various constraints.

---

### Version 0: 1 egg, ≤ T tosses

**Pseudocode:**  
for i from 1 to n:  
  drop egg at floor i  
  if egg breaks:  
    return i

**Worst-case:**  
T tosses

---

### Version 1: ∼ log n eggs and ∼ log n tosses

**Idea:**  
Use binary search over floors.

---

### Version 2: ∼ log T eggs and ∼ 2 log T tosses

**Idea:**  
Use exponential search to find upper bound, then binary search in narrowed range.

---

### Version 3: 2 eggs and ∼ 2√n tosses

**Pseudocode:**  
step = ceil(sqrt(n))  
for i in range(step, n+1, step):  
  drop egg at i  
  if egg breaks:  
    break  
// linear search from previous step to i

---

### Version 4: 2 eggs and ≤ c√T tosses

**Idea:**  
Use decreasing step sizes to balance total number of drops — optimize jump intervals to minimize worst-case tosses.

---
