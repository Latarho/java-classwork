# Sorting Algorithm Comparison

* Bubble Sort
  * Iterate through the array, checking each element against the next to see if they're in order, and switching them if they are not. If no errata are found, move on.
  * Very fast on sorted arrays, with half the reads of some other methods, but slows down very quickly the further any element is from its sorted position.
  * Near-zero memory cost.
  * This sorting algorithm is very naive, so there's not much to do to improve it without replacing it entirely.
* Insertion Sort
  * Iterate through the array. For each element you find, move it back until the next element is greater or it is the first element in the list.
  * Fast on sorted arrays, doesn't slow down as elements move from their sorted positions.
  * Potentially slow depending on your system's array implementation, adding elements in the middle could mean everything after it has to shift.
* Selection Sort
  * Iterate through the array. For each element, iterate through the following elements, find the lowest, and swap it with the current element.
  * Fast on sorted arrays, but in the worst-case scenario can have O(n^2) complexity.
  * Suffers from the same shifting issues as insertion sort.
* Merge sort
  * Split the array in half recursively and create small sorted arrays which are merged into the resultant array.
  * The highest memory complexity of all of these, and the lowest time complexity. Being a recursive function, it also pollutes the call stack, so it might cause an overflow if you're sorting something too big.
  