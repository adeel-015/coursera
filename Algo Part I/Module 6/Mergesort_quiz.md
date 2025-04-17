### Question

**How many compares does mergesort—the pure version without any optimizations—make to sort an input array that is already sorted?**

- [ ] constant  
- [ ] logarithmic  
- [ ] linear  
- [x] linearithmic  

**Explanation:**  
It makes approximately (1/2) * n * log₂n compares, which is the best case for standard mergesort.  
The optimized version that checks whether `a[mid] ≤ a[mid+1]` requires only n−1 compares.
