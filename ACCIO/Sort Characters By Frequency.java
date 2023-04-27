import java.util.*;

class Solution {
    public String frequencySort(String s) {
        // Step 1: count the frequency of each character
        Map<Character, Integer> freqMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }
        List<Character> chars = new ArrayList<>(freqMap.keySet());
		Collections.sort(chars, (a,b) ->{
			int freqA = freqMap.get(a);
			int freqB = freqMap.get(b);
			if(freqA !=freqB){
				return Integer.compare(freqB, freqA);
			}else{
				return Character.compare(b, a);
			}
		});
		// construct sorted string
		StringBuilder sb = new StringBuilder();
		for(char c : chars){
			int count = freqMap.get(c);
			for(int i = 0; i< count; i++){
				sb.append(c);
			}
		}
        
        return sb.toString();
    
}
}


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Solution Obj = new Solution();
        String result = Obj.frequencySort(s);
        System.out.println(result);
        sc.close();
    }
}