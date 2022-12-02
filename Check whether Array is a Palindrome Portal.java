/*
Approach: Recursive

Base case: If array has only one element i.e. begin == end then return 1, 
also if begin>end which means the array is palindrome then also return 1.

If the first and the last elements are equal then recursively call 
the function again but increment begin by 1 and decrement end by 1.

If the first and last element is not equal then return 0.

Time Complexity: O(n)

Space Complexity: O(n)

Below is the implementation of the above approach:*/


  public boolean isPalindrome(int[] arr, int n) {
        int res = isPalindromic(arr, 0, n - 1);
        if (res == 1)
            return true;
        return false;
    }

    public int isPalindromic(int[] arr, int begin, int end) {
        if (begin >= end) {
            return 1;
        }
        if (arr[begin] == arr[end]) {
            return isPalindromic(arr, begin + 1, end - 1);
        } else {
            return 0;
        }
    }