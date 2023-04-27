/*Good Strings
You are given a set 'S' of distinct characters. You are also given an array 'A' of 'N' strings.

A String in array 'A' is called good if all the characters of the string is present in the set 'S'.

You have to find how many strings in the array 'A' are good.

Input Format
The first line contains the number of test cases.

For each test case: The first line contains a string denoting the characters of the set 'S'.

The next line contains 'N', the number of strings in 'A'.

The next 'N' lines contains a string each, which are the elements of the array 'A'.

Output Format
For each test case print the count of good strings in a new line.

Example 1
Input:

1
abc
4
ab
abd
cacb
cabef
Output:

2
Explanation:

Only 'ab' and 'cacb' are good strings. Rest of the strings contain characters apart from 'abc'.

Example 2
Input:

1
pq
3
pqqqpp
abc
rst
Output:

1
Explanation:

Only 'pqqqpp' is a good string.*/

import java.util.*;

public class Main {

 public static int goodStrings(String s, String[] A, int n) {
    int count = 0;
    Set<Character> set = new HashSet<>();
    // convert string s to set of characters
    for (char c : s.toCharArray()) {
        set.add(c);
    }
    // check each string in array A
    for (int i = 0; i < n; i++) {
        String str = A[i];
        boolean good = true;
        // check if all characters in string str are present in set
        for (char c : str.toCharArray()) {
            if (!set.contains(c)) {
                good = false;
                break;
            }
        }
        if (good) {
            count++;
        }
    }
    return count;
}


  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      String s = sc.next();
      int n = sc.nextInt();
      String[] A = new String[n];
      for (int i = 0; i < n; i++) {
        A[i] = sc.next();
      }

      System.out.println(goodStrings(s, A, n));
    }
  }
}