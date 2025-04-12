### ❓ Quiz Question

**What is the maximum number of `id[]` array entries that can change (from one value to a different value) during one call to `union` when using the quick-find data structure on *n* elements?**

- [ ] 1  
- [ ] log₂ *n*  
- [ ] *n*−1  
- [x] *n* ✅  

---

### ✅ Correct Answer: *n*

In the quick-find implementation, one call to `union(p, q)` might need to change all `n` entries in the `id[]` array if `p` and `q` belong to different components with completely different ids. This is why quick-find has poor performance for large `n`.
