### ❓ Quiz Question

**How much memory (in bytes) does a `WeightedQuickUnionUF` object use as a function of the number of elements _n_?**

```
public class WeightedQuickUnionUF {  
  private int[] id;  
  private int[] sz;  
  private int count;  
  
  public WeightedQuickUnionUF(int N){  
    id = new int[N];  
    sz = new int[N];  
    for (int i = 0; i < N; i++) id[i] = i;  
    for (int i = 0; i < N; i++) sz[i] = 1;  
  }  
}
```

- [ ] ∼n  
- [ ] ∼2n  
- [ ] ∼4n  
- [x] ∼8n ✅  

---

### ✅ Correct Answer: ∼8n

The class contains **two integer arrays** (`id[]` and `sz[]`), and each integer consumes **4 bytes**, so total memory is approximately:

**∼4n + 4n = ∼8n bytes**

The object overhead (such as the `count` variable and object header) is **negligible** as _n_ gets large.
