import java.util.*;
class Main{
	public static void main(String[] args){
		try (Scanner sc = new Scanner(System.in)) {
			int t=sc.nextInt();
			while(t>0){
				int n=sc.nextInt();
				int []A=new int[n];
				for(int i=0;i<n;i++){
					A[i]=sc.nextInt();
				}
				Solution ob =new Solution();
				int ans = ob.CountingInversions(A,0,n-1);
                System.out.print(ans);
                System.out.println();
				t--;
			}
		}
	}

}
class Solution {
    public int CountingInversions(int[] arr,int l,int r) {
        int count = 0;
        if (l < r) {
            int mid = (l + r) / 2;
            count += CountingInversions(arr, l, mid);
            count += CountingInversions(arr, mid + 1, r);
            count += merge(arr, l, mid, r);
        }
        return count;
    }
    
    private int merge(int[] arr, int l, int m, int r) {
        int count = 0;
        int n1 = m - l + 1;
        int n2 = r - m;
        int[] L = new int[n1];
        int[] R = new int[n2];
        for (int i = 0; i < n1; i++)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; j++)
            R[j] = arr[m + 1 + j];
        int i = 0, j = 0, k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k++] = L[i++];
            } else {
                arr[k++] = R[j++];
                count += (n1 - i);
            }
        }
        while (i < n1)
            arr[k++] = L[i++];
        while (j < n2)
            arr[k++] = R[j++];
        return count;
    }
}
