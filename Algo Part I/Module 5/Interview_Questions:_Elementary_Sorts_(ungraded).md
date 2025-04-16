### Question 1

**Intersection of two sets (2D points)**  
Design a subquadratic algorithm to count points that are in both arrays `a[]` and `b[]` (each of size `n` with distinct 2D points).

**Approach:**

- Sort `a[]` and `b[]` using lexicographic order (by x then y) → `O(n log n)`
- Use two pointers to scan through both sorted arrays → `O(n)`

```java
// Assume Point implements equals() and hashCode()
Set<Point> set = new HashSet<>();
for (Point p : a) {
    set.add(p);
}

int count = 0;
for (Point p : b) {
    if (set.contains(p)) {
        count++;
    }
}
```


**Total Time: O(n log n)**

---

### Question 2

**Permutation check**  
Design a subquadratic algorithm to check if two integer arrays are permutations of each other.

**Approach:**

- Sort both arrays → `O(n log n)`
- Compare element by element → `O(n)`
  
```java
Arrays.sort(a);
Arrays.sort(b);
return Arrays.equals(a, b);
```

**Total Time: O(n log n)**

---

### Question 3

**Dutch National Flag Problem**  
Sort an array of `n` red, white, or blue pebbles using only `color(i)` and `swap(i,j)` operations.

**Constraints:**
- At most `n` calls to `color()` and `swap()`
- Constant extra space

**Pseudocode:**

```java
low = 0
mid = 0
high = n - 1

while mid <= high:
    if color(mid) == RED:
        swap(low, mid)
        low += 1
        mid += 1
    else if color(mid) == WHITE:
        mid += 1
    else: // BLUE
        swap(mid, high)
        high -= 1
```
