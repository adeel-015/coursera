### Question 1: Merging with Smaller Auxiliary Array

**Problem**: Merge two sorted subarrays `a[0..n-1]` and `a[n..2n-1]` into a single sorted array `a[0..2n-1]` using only an auxiliary array of length `n`.

By using Bottom-up Merge Sort technique.

---

### Question 2: Counting Inversions

**Problem**: Count the number of inversions `(i, j)` such that `i < j` and `a[i] > a[j]` in `O(n log n)` time.

**Pseudocode**:
```
function countInversions(a):
    return sortAndCount(a, 0, length(a) - 1)

function sortAndCount(a, lo, hi):
    if lo >= hi:
        return 0
    mid = (lo + hi) / 2
    count = sortAndCount(a, lo, mid)
    count += sortAndCount(a, mid + 1, hi)
    count += mergeAndCount(a, lo, mid, hi)
    return count

function mergeAndCount(a, lo, mid, hi):
    aux = a[lo..hi]
    i = lo
    j = mid + 1
    count = 0

    for k from lo to hi:
        if i > mid:
            a[k] = aux[j - lo]
            j += 1
        else if j > hi:
            a[k] = aux[i - lo]
            i += 1
        else if aux[i - lo] <= aux[j - lo]:
            a[k] = aux[i - lo]
            i += 1
        else:
            a[k] = aux[j - lo]
            count += (mid - i + 1)  // Inversions
            j += 1
    return count
```

---

### Question 3: Shuffling a Linked List

**Problem**: Shuffle a singly-linked list uniformly at random in `O(n log n)` time and `O(log n)` space.

**Pseudocode**:
```
function shuffle(head):
    if head is null or head.next is null:
        return head

    (left, right) = split(head)
    left = shuffle(left)
    right = shuffle(right)
    return mergeRandomly(left, right)

function split(head):
    slow = head
    fast = head.next
    while fast != null and fast.next != null:
        slow = slow.next
        fast = fast.next.next
    mid = slow.next
    slow.next = null
    return (head, mid)

function mergeRandomly(a, b):
    dummy = new Node(0)
    current = dummy

    while a != null and b != null:
        if random() < 0.5:
            current.next = a
            a = a.next
        else:
            current.next = b
            b = b.next
        current = current.next

    current.next = (a != null) ? a : b
    return dummy.next
```
