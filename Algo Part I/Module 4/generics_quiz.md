### Question  
Which of the following statements is a **type-safe** way to declare and initialize a `Stack` of integers in Java?

#### Options:
- [ ] `Stack<int> stack = new Stack<int>();`  
- [ ] `Stack<Integer> stack = new Stack();`  
- [ ] `Stack stack = new Stack<Integer>();`  
- [x] `Stack<Integer> stack = new Stack<Integer>();`  

**✅ Correct Answer:**  
`Stack<Integer> stack = new Stack<Integer>();`

**Explanation:**  
In **Java 6**, you must specify the concrete type on both the **left-hand side** (variable declaration) and the **right-hand side** (constructor).  
From **Java 7** onwards, you can use the **diamond operator (`<>`)** like this:

```java
Stack<Integer> stack = new Stack<>();
```
