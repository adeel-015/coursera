### Question

**Under which of the following scenarios does the N log N lower bound for sorting apply?**  
_Assume that the keys are accessed only through the `compareTo()` method unless otherwise specified._

- [ ] five distinct keys  
- [x] no two keys are equal  
- [ ] keys in descending order  
- [ ] keys are strings and accessed via `charAt()` instead of `compareTo()`  

**Correct**  
The N log N lower bound applies in the **comparison-based** model when **no two keys are equal**. The other scenarios may involve fewer possible outcomes (like five distinct keys), or use models outside `compareTo()`, where faster-than-N log N algorithms are possible.
