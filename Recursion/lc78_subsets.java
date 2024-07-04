import java.util.ArrayList;
import java.util.List; // Add this import statement
public class lc78_subsets {
    static List<List<Integer>> arr ;
    public static void helper(int i, int[] nums, ArrayList<Integer> ans) {
        if(i == nums.length) {            
            ArrayList<Integer> temp = new ArrayList<>();
            for(int j=0; j<ans.size(); j++) {
                temp.add(ans.get(j));
            }
            arr.add(temp);
            return;
        }
        helper(i+1, nums, ans); //if we include the character
        ans.add(nums[i]);
        helper(i+1, nums, ans); //if we exclude the character
        ans.remove(ans.size()-1);
    }
    public static List<List<Integer>> subsets(int[] nums) {
        arr = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        helper(0, nums, ans);
        return arr;
    }
}
