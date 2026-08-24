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

    static void zeroOptimal(int[][] nums) {

        int m = nums.length;
        int n = nums[0].length;

        boolean firstRowZero = false;
        boolean firstColZero = false;

        for (int j = 0; j < n; j++) {
            if (nums[0][j] == 0) {
                firstRowZero = true;
                break;
            }
        }

        for (int i = 0; i < m; i++) {
            if (nums[i][0] == 0) {
                firstColZero = true;
                break;
            }
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {

                if (nums[i][j] == 0) {
                    nums[i][0] = 0;
                    nums[0][j] = 0;
                }
            }
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {

                if (nums[i][0] == 0 || nums[0][j] == 0) {
                    nums[i][j] = 0;
                }
            }
        }

        if (firstColZero) {
            for (int i = 0; i < m; i++) {
                nums[i][0] = 0;
            }
        }

        if (firstRowZero) {
            for (int j = 0; j < n; j++) {
                nums[0][j] = 0;
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
