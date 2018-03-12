
Lab 5
--------

**1.** I think that since java has a default constructor for any class
 without a specified constructor, `LinkedStack` does not need a constructor. 
 Also, since it is not like an array where it is a bit complicated to switch the size
 there really is no need for a constructor specifying a size for the `LinkedList` because
 if you need it larger, you can easily add to it. Also, since it is really made
 up of nodes, the nodes are just created and added without the need of a `LinkedList` constructor.

**2.** `push`, `peek`, and `pop` , and `isEmpty` are all O(1). `asList` is 
O(n), as it has to go through the entire stack.

In terms of space, `isEmpty` uses no extra space or memory; `push` uses the 
amount to add a new node to the `LinkedList`; `peek` and `pop` each 
create an instance variable; `asList` adds an entire list to the space 
of the method.  `ReverseLines.main` has a complexity of O(2n)

**3.** `LinkedStack` could have also been implemented using an `arrayList`.

**4.** It seems like it is best for it to return the object as
it was cause less "garbage" for java to clean up rather than if there 
is an entire stack. However, sometimes within a program it may be easier and more
clear if the stack was returned rather than the object. 