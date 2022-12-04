import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        PrintReverseArray(arr, 0);
    }

	public static void PrintReverseArray(int[] arr, int n) {
        //Write your code
		
		  if(n == arr.length){
            return;
        }
        PrintReverseArray(arr, n+1);
        System.out.print(arr[n]+" ");
    }

  }