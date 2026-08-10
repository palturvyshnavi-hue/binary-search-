# Binary Search in Java

## Description

Binary Search is a searching algorithm that works on a sorted array. It repeatedly divides the search range into two halves until the required element is found or the search range becomes empty.

## Files

* `BinarySearch.java` - Main Binary Search program
* `BinarySearchTest.java` - Binary Search testbench
* `output.txt` - Testbench output
* `README.md` - Project documentation

## How to Run in VS Code

Compile:

```bash
javac BinarySearch.java BinarySearchTest.java
```

Run the main program:

```bash
java BinarySearch
```

Run the testbench:

```bash
java BinarySearchTest
```

## Testbench Output

```text
Binary Search Testbench
-----------------------
Test 1: Search 10
Expected: 0
Actual: 0
PASS

Test 2: Search 30
Expected: 2
Actual: 2
PASS

Test 3: Search 50
Expected: 4
Actual: 4
PASS

Test 4: Search 25
Expected: -1
Actual: -1
PASS
```

## Time Complexity

* Best Case: O(1)
* Average Case: O(log n)
* Worst Case: O(log n)

## Space Complexity

* O(1)

## Conclusion

The Binary Search algorithm was successfully implemented in Java and verified using a testbench. All four test cases passed successfully.
