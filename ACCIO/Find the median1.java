
class Solution {
    static int solve(int[] a){
        Arrays.sort(a); // sort the array in ascending order
        int n = a.length;
        int mid = n/2;
        if(n%2 == 0){ // even number of elements
            return (a[mid-1] + a[mid])/2; // average of middle two elements
        }
        else{ // odd number of elements
            return a[mid]; // middle element
        }
    }
}