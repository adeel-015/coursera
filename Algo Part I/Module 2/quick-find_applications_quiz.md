### ❓ Quiz Question

**When opening one new site in the percolation simulation, how many times is `union()` called?**

- [x] 0, 1, 2, 3, or 4 ✅  
- [ ] 1, 2, 3, or 4  
- [ ] 2, 3, or 4  
- [ ] 4  

### ✅ Correct Answer: 0, 1, 2, 3, or 4

`union()` is called for **each neighboring site** that is already open.  
There are 4 possible neighbors (top, bottom, left, right), but **some may be blocked**, so the number of `union()` calls can range from **0 to 4**.
