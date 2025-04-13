### Question 1  
**Queue with Two Stacks**  
Implement a queue with two stacks so that each queue operation takes constant amortized number of stack operations.

```

Initialize two stacks: `stack1` (for enqueue), `stack2` (for dequeue)

Enqueue(x):  
- Push x to `stack1`

Dequeue():  
- If `stack2` is empty:  
  - While `stack1` is not empty:  
    - Pop from `stack1`, push to `stack2`  
- Pop from `stack2`
```

> Amortized O(1) time per operation since each element is moved at most once between stacks.


---

### Question 2  
**Stack with Max**  
Create a stack that supports push, pop, and getMax operations efficiently.

```

Use two stacks:  
- `mainStack` to store elements  
- `maxStack` to track max at each level

Push(x):  
- Push x to `mainStack`  
- If `maxStack` is empty or x ≥ maxStack.peek(): push x to `maxStack`  
- Else push `maxStack.peek()` again (to retain current max)

Pop():  
- Pop from both `mainStack` and `maxStack`

GetMax():  
- Return `maxStack.peek()`
```

> All operations are O(1) time.

---

### Question 3  
**Java Generics: Why Generic Array Creation is Prohibited**

Java prohibits generic array creation due to **type erasure**. At runtime, the generic type information is removed, so the actual type is unknown. This causes issues with array covariance and type safety.

Example:
```java
List<String>[] stringLists = new List<String>[1]; // compile-time error
```
> Arrays are reifiable (know their type at runtime), but generics are not—this mismatch makes generic array creation unsafe.
