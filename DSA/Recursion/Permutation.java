/**
 * Permutation
 */
import java.util.*;
public class Permutation {

    public static void main(String[] args) {
        int[] nums = {1,2,3};

        System.out.println(permute(nums));

    }

    public static List<List<Integer>> permute(int[] nums) {
		// Your code goes here
        String num = new String();
//  
        for(int i=0;i<nums.length;i++){
            num += "" + nums[i];
        }
        ans = new ArrayList<>();    
        permuteHelper(num, new ArrayList<>());
		return ans;
	}

    static List<List<Integer>> ans;
	public static void permuteHelper(String nums, ArrayList<Integer> smallAns){
        if(nums.length()==0){
            ArrayList<Integer> base = new ArrayList<>();
            base.addAll(smallAns);
            ans.add(base);
            // smallAns = new ArrayList<>();
            // System.out.println("base case : " + nums +" "+base +" "+ smallAns + " " + ans);
            return;
        }

        for(int i = 0;i<nums.length();i++){
            char c = nums.charAt(i);
            String newStr = nums.substring(0,i) + nums.substring(i+1);
            smallAns.add(c - '0');
            System.out.println(newStr+" " + smallAns);
            permuteHelper(newStr, smallAns);
            smallAns.remove(smallAns.size()-1);
        }
	}
}