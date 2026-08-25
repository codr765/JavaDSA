class Missing {
    public int missingMultiple(int[] nums, int k) {
        boolean[] present = new boolean[nums.length + 1];

        for (int num : nums) {
            if (num % k == 0) {
                int multiple = num / k;

                if (multiple <= nums.length) {
                    present[multiple] = true;
                }
            }
        }

        for (int i = 1; i <= nums.length; i++) {
            if (!present[i]) {
                return i * k;
            }
        }

        return (nums.length + 1) * k;
    }
}