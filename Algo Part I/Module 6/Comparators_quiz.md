### Question

**Which of the following is a compelling reason to implement the `Comparator` interface instead of the `Comparable` interface in Java?**

- [ ] easier to use Comparator with Arrays.sort()  
- [x] Comparator supports multiple orderings of a given data type  
- [ ] easier to implement a total order with Comparator than Comparable  
- [ ] All of the above  

**Correct**  
The `Comparator` interface allows defining multiple ways to order the same data type, which is not possible with `Comparable`, since it defines a natural (single) ordering.
