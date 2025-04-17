### Question

**Given an array of points, which of the following approaches would be least useful for removing duplicate points?**  
_Assume the point data type has the following three orders:_

- A natural order that compares by x-coordinate and breaks ties by y-coordinate.  
- One comparator that compares by x-coordinate; another by y-coordinate.  
_Note: quicksort is an efficient, but unstable, sorting algorithm._

- [ ] quicksort by the natural order  
- [ ] quicksort by x-coordinate; mergesort by y-coordinate  
- [x] mergesort by x-coordinate; quicksort by y-coordinate  
- [ ] mergesort by x-coordinate; mergesort by y-coordinate  

**Correct**  
Since quicksort is not stable, if you mergesort by x-coordinate and then quicksort by y-coordinate, there is no guarantee that equal points will be adjacent in the sorted order.
