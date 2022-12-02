import java.util.*;

public class Main 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        sc.close();
        System.out.println(getMaxArea(arr, n));
    }
  static int[] nextSmaller(int arr[], int n){
          int ans[] = new int[n];
	    Stack<Integer> st = new Stack<>();
	    for(int i = n - 1; i >= 0; i--){
	        while(!st.empty() && arr[i] <= arr[st.peek()]){
	            st.pop();
	        }
	        if(!st.empty()){
	            ans[i] = st.peek(); // index of next Smaller element
	        }
	        else { // arr[i] doesn't have Next smaller element
	            ans[i] = n; // MOST IMPORTANT
	        }
	        st.push(i);
	    }
	    return ans;
  }
         static int[] prevSmaller(int arr[], int n){
          int ans[] = new int[n];
	    Stack<Integer> st = new Stack<>();
	    for(int i = 0; i < n; i++){
	        while(!st.empty() && arr[i] <= arr[st.peek()]){
	            st.pop();
	        }
	        if(!st.empty()){
	            ans[i] = st.peek(); // index of next Smaller element
	        }
	        else { // arr[i] doesn't have previous smaller element
	            ans[i] = -1; // MOST IMPORTANT
	        }
	        st.push(i);
	    }
	    return ans;
  }
    public static int getMaxArea(int hist[], int n) {
        int nexts[] = nextSmaller(hist, n);
            int prevs[] = prevSmaller(hist, n);
            int ans = Integer.MIN_VALUE;
            for(int i = 0; i < n; i++){
                    ans = Math.max(ans, (nexts[i] - prevs[i] - 1) * hist[i]);
            }
            return ans;
    }
}