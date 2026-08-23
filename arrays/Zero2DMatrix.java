public class Zero2DMatrix {
    static void zeroBrute(int[][] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                if (nums[i][j] == 0) {
                    for (int k = 0; k < nums[0].length; k++) {
                        if (nums[i][k] != 0) {
                            nums[i][k] = -1;
                        }
                    }

                    for (int k = 0; k < nums.length; k++) {
                        if (nums[k][j] != 0) {
                            nums[k][j] = -1;
                        }
                    }

                }
            }
        }

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                if (nums[i][j] == -1) {
                    nums[i][j] = 0;
                }
            }
        }
    }

    static void zeroBetter(int[][] nums) {
        int[] rows = new int[nums.length];
        int[] cols = new int[nums[0].length];

        for (int i = 0; i < rows.length; i++) {
            for (int j = 0; j < cols.length; j++) {
                if (nums[i][j] == 0) {
                    rows[i] = 1;
                    cols[j] = 1;
                }
            }
        }

        for (int i = 0; i < rows.length; i++) {
            if (rows[i] == 1) {
                for (int j = 0; j < cols.length; j++) {
                    nums[i][j] = 0;
                }
            }
        }

        for (int i = 0; i < cols.length; i++) {
            if (cols[i] == 1) {
                for (int j = 0; j < rows.length; j++) {
                    nums[j][i] = 0;
                }
            }
        }
        
    }

    public static void main(String[] args) {
        int[][] nums = {
                { 1, 2, 0, 4, 8, 1 },
                { 4, 2, 1, 7, 0, 9 },
                { 1, 0, 5, 3, 0, 1 },
                { 5, 3, 2, 1, 4, 6 }
        };

        zeroBetter(nums);

        for (int[] is : nums) {
            for (int is2 : is) {
                System.out.printf("%2d  ", is2);
            }
            System.out.println();
        }
    }
}
