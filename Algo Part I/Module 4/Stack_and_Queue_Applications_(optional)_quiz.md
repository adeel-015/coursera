### Question  
What does the following code fragment print?
```java
int n = 50;

Stack<Integer> stack = new Stack<Integer>();
while (n > 0) {
    stack.push(n % 2);
    n = n / 2;
}

for (int digit : stack) {
    StdOut.print(digit);
}

StdOut.println();
```

#### Options:
- [ ] 010011  
- [ ] 010111  
- [ ] 111010  
- [x] 110010  

**✅ Correct Answer:**  
**110010**

**Explanation:**  
The code computes and prints the **binary representation of 50**. The stack stores bits in reverse order due to repeated `push(n % 2)`, and since the iterator of this stack returns items in **LIFO** order, it correctly prints the binary digits in the **correct order**.

Note: The `Stack` used here behaves in **LIFO** order; `java.util.Stack` would return items in **FIFO** if used with a basic iterator, leading to a different output.
