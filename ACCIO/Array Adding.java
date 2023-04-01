// Java program to sum two numbers
// represented two arrays.
import java.util.*;

public class Main {
  static int[] calSum(int a[], int b[], int n, int m) {
    // your code here
	int[] result = new int[Math.max(n, m) + 1]; // result array
    int i = n - 1, j = m - 1, k = result.length - 1; // pointers to traverse arrays and result array

    int carry = 0; // variable to hold carry from one digit to the next

    while (i >= 0 || j >= 0) { // loop until both arrays are exhausted
        int sum = carry; // add carry from previous sum to current sum

        if (i >= 0) { // add digit from first array
            sum += a[i];
            i--;
        }

        if (j >= 0) { // add digit from second array
            sum += b[j];
            j--;
        }

        result[k] = sum % 10; // store least significant digit in result array
        carry = sum / 10; // update carry for next iteration
        k--; // move to next position in result array
    }

    if (carry != 0) { // if there's a final carry, store it in result array
        result[0] = carry;
    } else { // if there's no final carry, remove extra zero at beginning of result array
        result = Arrays.copyOfRange(result, 1, result.length);
    }

    return result; // return the result array
	}

  /* Driver program to test above function */
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n1 = sc.nextInt();
    int[] arr1 = new int[n1];
    for (int i = 0; i < n1; i++) arr1[i] = sc.nextInt();

    int n2 = sc.nextInt();
    int[] arr2 = new int[n2];
    for (int i = 0; i < n2; i++) arr2[i] = sc.nextInt();
    sc.close();

    int[] res = calSum(arr1, arr2, n1, n2);
    for (int i : res) System.out.println(i);
  }
}