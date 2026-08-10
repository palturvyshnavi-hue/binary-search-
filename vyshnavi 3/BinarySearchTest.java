```java
public class BinarySearchTest {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        System.out.println("Binary Search Testbench");
        System.out.println("-----------------------");

        int result1 = BinarySearch.binarySearch(arr, 10);
        System.out.println("Test 1: Search 10");
        System.out.println("Expected: 0");
        System.out.println("Actual: " + result1);
        System.out.println(result1 == 0 ? "PASS" : "FAIL");
        System.out.println();

        int result2 = BinarySearch.binarySearch(arr, 30);
        System.out.println("Test 2: Search 30");
        System.out.println("Expected: 2");
        System.out.println("Actual: " + result2);
        System.out.println(result2 == 2 ? "PASS" : "FAIL");
        System.out.println();

        int result3 = BinarySearch.binarySearch(arr, 50);
        System.out.println("Test 3: Search 50");
        System.out.println("Expected: 4");
        System.out.println("Actual: " + result3);
        System.out.println(result3 == 4 ? "PASS" : "FAIL");
        System.out.println();

        int result4 = BinarySearch.binarySearch(arr, 25);
        System.out.println("Test 4: Search 25");
        System.out.println("Expected: -1");
        System.out.println("Actual: " + result4);
        System.out.println(result4 == -1 ? "PASS" : "FAIL");
    }
}
```
