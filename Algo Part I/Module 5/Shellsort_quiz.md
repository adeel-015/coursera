### Shellsort on Sorted Input

How many compares does shellsort (using the 3x+1 increment sequence) make on an input array that is already sorted?

- [ ] constant  
- [ ] logarithmic  
- [ ] linear  
- [x] linearithmic

**Correct**  
Since successive increment values of h differ by at least a factor of 3, there are ∼log₃n increment values. For each increment value h, the array is already h-sorted so it will make ∼n compares.
