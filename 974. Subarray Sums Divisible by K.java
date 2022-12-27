class Solution {
    public int subarraysDivByK(int[] arr, int K) {
        int ans = 0;
		HashMap<Integer, Integer> map  = new HashMap<>();
		map.put(0, 1);
		int sum=0, rem=0;

		for(int i=0;i<arr.length;i++){
			sum += arr[i];
			rem = sum%K;
			if(rem<0){
				rem +=K;
				
			}
			if(map.containsKey(rem)){
				ans+=map.get(rem);
				map.put(rem, map.get(rem)+1);
				
			}else{
				map.put(rem, 1);
			}
			}
		return ans;
		}
}