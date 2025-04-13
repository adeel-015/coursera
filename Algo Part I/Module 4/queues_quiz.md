### Question  
Suppose that you implement a queue using a null-terminated singly-linked list, maintaining a reference to the item **least recently added** (the front of the list) but **not** maintaining a reference to the item **most recently added** (the end of the list).  
What are the **worst-case running times** for `enqueue` and `dequeue`?

#### Options:
- [ ] constant time for both enqueue and dequeue  
- [ ] constant time for enqueue and linear time for dequeue  
- [x] linear time for enqueue and constant time for dequeue  
- [ ] linear time for both enqueue and dequeue  

**✅ Correct Answer:**  
**linear time for enqueue and constant time for dequeue**

**Explanation:**  
Removing a node from the **front** of a linked list takes **constant time**.  
However, adding a node to the **end** (enqueue) takes **linear time** because you must **traverse the entire list** to find the last node (since there's no reference to it).
