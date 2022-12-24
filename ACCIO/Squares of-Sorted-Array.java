//Algorithm: 1.Square all the elements in the array 1.Run a nested for loop to traverse the input array using two variables i and j, such that 0 ≤ i < n-1 and 0 ≤ j < n-i-1 2.If arr[j] is greater than arr[j+1] then swap these adjacent elements, else move on 3.Print the sorted array
//
//        Time Complexity: O(N2) Auxiliary Space: O(1)
//
//        Below is the implementation of the above idea:
//
//        Java
import java.util.*;
public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);

    int n;
    n=sc.nextInt();

    int[] arr = new int[n];
    for(int i=0; i<n; i++)
        arr[i]=sc.nextInt();

    for(int i=0; i<n; i++)
        arr[i]=arr[i]*arr[i];


    for (int i = 0; i < n - 1; i++)
        for (int j = 0; j < n - i - 1; j++)
            if (arr[j] > arr[j + 1]) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }

    for(int i=0; i<n; i++)
        System.out.print(arr[i] + " ");


}
}