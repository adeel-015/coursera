### ❓ Quiz Question

**Suppose that you make the following observations of the running time _T(n)_ (in seconds) of a program as a function of the input size _n_. Which of the following functions best models the running time _T(n)_?**

| n      | T(n)  |
|--------|--------|
| 1,000  | 0.0    |
| 2,000  | 0.0    |
| 4,000  | 0.1    |
| 8,000  | 0.3    |
| 16,000 | 1.3    |
| 32,000 | 5.1    |
| 64,000 | 20.5   |

- [ ] 3.3 × 10⁻⁴ × n  
- [ ] _n²_  
- [x] 5.0 × 10⁻⁹ × _n²_ ✅  
- [ ] 6.25 × 10⁻⁹ × _n²_

### ✅ Correct Answer: 5.0 × 10⁻⁹ × _n²_

We assume _T(n) = a × nᵇ_ for some constants _a_ and _b_.

As we double the input size _n_, the running time approximately quadruples, indicating a **quadratic algorithm** (_b = 2_).  
Using the data point _T(64,000) = 20.5_, we solve for _a_:

**a = 20.5 / (64,000)² ≈ 5.0 × 10⁻⁹**
