### ❓ Quiz Question

**Suppose that the `id[]` array during the weighted quick-union (by size) algorithm is given as below. Which `id[]` entry changes when we apply the `union` operation to 3 and 6?**

|         | 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 |
|---------|---|---|---|---|---|---|---|---|---|---|
| id[i]   | 0 | 0 | 0 | 0 | 0 | 0 | 7 | 8 | 8 | 8 |

- [ ] `id[0]`  
- [ ] `id[3]`  
- [ ] `id[6]`  
- [x] `id[8]` ✅  

### ✅ Correct Answer: `id[8]`

In **weighted quick-union (by size)**, we attach the root of the smaller tree to the root of the larger one. Here, the smaller tree rooted at `8` is connected to the larger one rooted at `0`, so: `id[8]`
