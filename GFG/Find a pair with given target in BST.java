class Solution{
    public int isPairPresent(Node root, int target){
        //write code here
		Set<Integer> set = new HashSet<>();

		boolean ans = util(root, target, set);

		return ans ? 1:0;
    }

	public boolean util(Node root, int sum, Set<Integer> set){
		if(root==null) return false;

		if(util(root.left, sum, set)== true){
			return true;
		}
		if(set.contains(sum-root.data)){
			return true;
		}
		set.add(root.data);
		return util(root.right, sum, set);
	}
	
}
