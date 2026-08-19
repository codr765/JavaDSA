public class MooreAlgo {

	static int majority(int[] nums) {
		int majority = nums[0];
		int count = 0;

		for(int i : nums) {

			if(count == 0) {
				majority = i;
			}

			if(i == majority) {
				count ++;
			}
			else {
				count --;
			}

		}

		return majority;
		
	}


    public static void main(String[] args) {
        int[] nums = { 1, 2, 1, 1, 2, 3, 4, 4, 5, 2, 1, 1, 4, 1, 1, 1, 6, 1 };
	
	System.out.println(majority(nums));
    }
}
