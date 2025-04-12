### ❓ Quiz Question

**Consider the maximum number of array accesses during a `find` operation when using the quick-union data structure on `n` elements. How does this quantity grow as a function of `n`?**

- [ ] constant  
- [ ] logarithmic  
- [x] linear ✅  
- [ ] quadratic  

---

### ✅ Correct Answer: linear
(See Slide 27)\
In the worst-case scenario, the `find` operation in quick-union can traverse up to `n` elements if the tree is completely unbalanced.
