### Question  
Given a reference `first` to the first node of a null-terminated linked list with **at least two nodes**, what does the code fragment below do?

```
Node x = first;  
while (x.next.next != null) {  
    x = x.next;  
}  
x.next = null;
```


#### Options:
- [ ] deletes the first node in the list  
- [ ] deletes the second node in the list  
- [ ] deletes the next-to-last node in the list  
- [x] deletes the last node in the list

**✅ Correct Answer:**  
**deletes the last node in the list**

**Explanation:**  
Upon termination of the loop, `x` is a reference to the **second-to-last node**.  
The final statement `x.next = null` sets the `next` pointer of that node to null, effectively deleting the **last node** from the list.
