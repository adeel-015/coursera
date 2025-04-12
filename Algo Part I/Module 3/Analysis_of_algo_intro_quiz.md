### ❓ Quiz Question

**Suppose that _n_ equals 1 million. Approximately how much faster is an algorithm that performs _n_ lg _n_ operations versus one that performs _n²_ operations?**  
(Recall that lg is the base-2 logarithm function.)

- [ ] 20×  
- [ ] 1,000×  
- [x] 50,000× ✅  
- [ ] 1,000,000×

### ✅ Correct Answer: 50,000×

We compute the ratio:  
**=> n² / (n lg n)**\
**=> n / lg n**\
**=> 1,000,000 / lg(1,000,000)**
Since 2²⁰ ≈ 1,000,000,  
**lg(1,000,000) ≈ 20**,  
So the ratio is **1,000,000 / 20 = 50,000**.
