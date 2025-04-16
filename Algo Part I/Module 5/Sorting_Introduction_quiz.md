### Violation of Comparable Interface Properties

Consider the data type `Temperature` defined below. Which of the following required properties of the `Comparable` interface does the `compareTo()` method violate?

```java
public class Temperature implements Comparable<Temperature> {
  private final double degrees;

  public Temperature(double degrees) {
    if (Double.isNaN(degrees))
        throw new IllegalArgumentException();
    this.degrees = degrees;
  }

  public int compareTo(Temperature that) {
    double EPSILON = 0.1;
    if (this.degrees < that.degrees - EPSILON) return -1;
    if (this.degrees > that.degrees + EPSILON) return +1;
    return 0;
  }
...
}
```


- [ ] Antisymmetry  
- [x] Transitivity  
- [ ] Totality  
- [ ] None of the above

**Correct**  
Transitivity is violated. Suppose that `a`, `b`, and `c` refer to objects corresponding to temperatures of 10.16°, 10.08°, and 10.00°, respectively. Then:
- `a.compareTo(b) <= 0`
- `b.compareTo(c) <= 0`
- But `a.compareTo(c) > 0`

For this reason, you must **not** introduce a fudge factor when comparing two floating-point numbers if you want to implement the `Comparable` interface.
