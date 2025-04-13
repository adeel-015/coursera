### Question  
Suppose that we copy the iterator code from our linked list and resizing array implementations of a stack to the corresponding implementations of a queue.

Which queue iterator(s) will correctly return the items in **FIFO** order?

#### Options:
- [ ] neither  
- [x] linked-list iterator only  
- [ ] array iterator only  
- [ ] both  

**✅ Correct Answer:**  
**linked-list iterator only**

**Explanation:**  
The **linked-list iterator** works correctly without modification because the nodes in the list are naturally ordered in **FIFO** order — we **enqueue at the end** and **dequeue from the front**.

The **array iterator**, copied directly from the stack, will
