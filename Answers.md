
Lab 7
--------

**1.** `populateList` fills the list from the deque while treating it like a stack - LIFO; `populateFifoList` fills the list
from the deque while treating it like a queue - FIFO, and `ReverseLines.printReverse` recursively reprints the input as it is
put in and then prints it out backwards. These methods work to remove a lot of unneccessary code from one's program by
delegating it to these short methods.

**2.** `populateList` and `populateFifoList` each require arguments so the method will know from where to begin populating
the list, and it needs to know which list to populate. As the method executes the recursion, the argument changes in that
what is passed to it to populate the list moves to the next nodes after the beginning of the deque.

`ReverseLines.printReverse` needs the argument of the Scanner so the user can input the lines that are needed to be reversed.
As it does the recursion the argument remains the same Scanner but it enables adding to the text needed to be reversed.

**3.** Both `populateList` `populateFifoList` have a time of O(1) and no added space(?).  `ReverseLines.printReverse` has a time of O(1) and the
added space from instantiating the variable "line".

**4.** All the methods could have been written using a while loop, though it would have added to the time and space complexity.