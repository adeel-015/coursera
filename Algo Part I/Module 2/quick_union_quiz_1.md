### ❓ Quiz Question

**Suppose that in a quick-union data structure on 10 elements, the `id[]` array is:**

| id[i] | 0 | 9 | 6 | 5 | 4 | 2 | 6 | 1 | 0 | 5 |
|-----|---|---|---|---|---|---|---|---|---|---|
| i   | 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 |


**Which are the roots of 3 and 7, respectively?**

- [ ] 3 and 7  
- [ ] 4 and 4  
- [ ] 6 and 4  
- [x] 6 and 6 ✅  

---

### ✅ Correct Answer: 6 and 6

- For **3**:  
  `3 → 5 → 2 → 6` → root is **6**

- For **7**:  
  `7 → 1 → 9 → 5 → 2 → 6` → root is also **6**
