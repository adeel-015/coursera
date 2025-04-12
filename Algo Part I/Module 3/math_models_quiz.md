### ❓ Quiz Question

**How many array accesses does the following code fragment make as a function of _n_?**

(Assume the compiler does not optimize away any array accesses in the innermost loop.)
```
int sum = 0;
for (int i = 0; i < n; i++)
    for (int j = i+1; j < n; j++)
        for (int k = 1; k < n; k = k*2)
            if (a[i] + a[j] >= a[k]) sum++;
```


- [ ] ∼ 3n²  
- [x] ∼ 3/2 n² lg n ✅  
- [ ] ∼ 3/2 n³  
- [ ] ∼ 3n³  

### ✅ Correct Answer: ∼ 3/2 n² lg n

Not all triple loops have cubic running times. For a given value of _i_ and _j_, the _k_-loop requires only **3 lg n** array accesses. As in the 2-SUM and 3-SUM analysis, the number of times the _k_-loop is executed is **(n²)**, which gives **∼ 1/2 n² lg n**.
