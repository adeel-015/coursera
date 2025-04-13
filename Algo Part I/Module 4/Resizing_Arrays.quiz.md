### Question  
Suppose that, starting from an empty data structure, we perform **n push operations** in our **resizing-array implementation of a stack**. How many times is the `resize()` method called?

#### Options:
- [ ] constant  
- [x] logarithmic  
- [ ] linear  
- [ ] quadratic  

**✅ Correct Answer:**  
**logarithmic**

**Explanation:**  
The `resize()` method is called only when the size of the stack reaches a **power of 2**.  
There are approximately **log₂(n)** powers of 2 between 1 and n, so the method is called **∼log₂(n)** times.
