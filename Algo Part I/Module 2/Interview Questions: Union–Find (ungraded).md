# Union-Find Based Algorithm Problems

This README documents the solutions for three classic algorithm problems involving the Union-Find (Disjoint Set Union) data structure. These problems are typically asked in algorithmic interviews and appear in courses like Coursera's **Algorithms Part I**.

---

## 📌 Question 1: Social Network Connectivity

**Problem:**  
Given a social network of `n` members and a sorted log file with `m` timestamps when pairs of members formed friendships, determine the earliest time when all members are connected.

**Constraints:**
- Friendship is an equivalence relation  
- Logs are sorted by timestamp  
- Time complexity: `O(m log n)` or better  
- Space complexity: `O(n)`

**Approach:**  
Use Union-Find to track connected components. Initially, there are `n` components. For each timestamped friendship, perform a union. If the union reduces the total number of components to 1, return that timestamp.

**Pseudocode:**
```plaintext
Initialize UnionFind with n members
components = n

for each (timestamp, a, b) in logs:
    if union(a, b) is successful:
        components -= 1
        if components == 1:
            return timestamp

return -1  // if all members never connect
```

---

## 📌 Question 2: Union-Find with Specific Canonical Element

**Problem:**  
Extend the Union-Find data type so that `find(i)` returns the **largest element** in the connected component containing `i`.

**Constraints:**
- All operations (`union`, `connected`, `find`) must be `O(log n)` or better  
- Space complexity: `O(n)`

**Approach:**  
In addition to the parent array, maintain a `max[i]` array to store the maximum element in each component. Update `max` during each union operation.

**Pseudocode:**
```plaintext
Initialize:
    parent[i] = i
    max[i] = i  // Track max element in each component

function find(i):
    if parent[i] != i:
        parent[i] = find(parent[i])  // Path compression
    return parent[i]

function findMax(i):
    return max[find(i)]

function union(a, b):
    rootA = find(a)
    rootB = find(b)
    if rootA == rootB: return
    // Union by rank or size
    parent[rootB] = rootA
    max[rootA] = max(max[rootA], max[rootB])
```

---

## 📌 Question 3: Successor with Delete

**Problem:**  
Given a set `S = {0, 1, ..., n - 1}` and two types of operations:
- Remove `x` from `S`  
- Find the successor of `x`: the smallest `y` in `S` such that `y ≥ x`

Design a data type where all operations (except construction) take `O(log n)` time or better.

**Constraints:**
- Time complexity: `O(log n)` per operation  
- Space complexity: `O(n)`

**Approach:**  
Use Union-Find to link each removed element `x` to `x + 1`. The `find(x)` will then return the next available element that is still in the set.

**Pseudocode:**
```plaintext
Initialize:
    parent[i] = i for all 0 ≤ i < n
    // Each element points to itself initially

function find(i):
    if parent[i] != i:
        parent[i] = find(parent[i])  // Path compression
    return parent[i]

function remove(x):
    union(x, x + 1)

function successor(x):
    if x >= n: return -1
    return find(x)
    
function union(a, b):
    parent[find(a)] = find(b)
```

---

## 📘 License

These problems are for educational and enrichment purposes. Inspired by algorithmic challenges from Coursera and classic textbook problems.
