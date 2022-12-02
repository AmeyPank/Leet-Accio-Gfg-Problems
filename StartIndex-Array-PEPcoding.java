/*Approach 1:

The simplest and efficient approach to solve this question is recursively.

Algorithm:

To solve this using recursion, make a recursion function with inputs, and a variable 
startIndex to traverse the input array.
Base Case: If startIndex == N of the input array, return -1, i.e. element not found.
If T == A[startIndex], then return startIndex.
else return the next call of recursive function with startIndex incremented.

Time Complexity : O(N)

Space Complexity : O(1)
*/
import java.util.Scanner;

class Solution{
    static int firstIndex(int A[],int T,int startIndex)
    {
        //Write your code here
        if(startIndex == A.length){
            return -1;
        }
        if(A[startIndex] == T){
            return startIndex;
        }else{
            int ans= firstIndex(A, T, startIndex +1);
            return ans;
        }
    }
}

class Main {
    static Scanner s = new Scanner(System.in);
    public static int[] takeInput(){
        int N = s.nextInt();
        int[] A = new int[N];
        for(int i = 0; i < N; i++){
            A[i] = s.nextInt();
        }
        return A;
    }

    public static void main(String[] args) {
        int[] A = takeInput();
        int T = s.nextInt();
        System.out.println(Solution.firstIndex(A, T, 0));
    }
}