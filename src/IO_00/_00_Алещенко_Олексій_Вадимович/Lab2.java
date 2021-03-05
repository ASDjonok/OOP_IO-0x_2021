package IO_00._00_Алещенко_Олексій_Вадимович;

public class Lab2 {
    public static void main(String[] args) {
        int[] array /*= {2, 1, 4, 3}*/;
        array = new int[4];
//        array = {0, 0, 0, 0};
        array[0] = 2;
        array[1] = 1;
        array[2] = 4;
        array[3] = 3;

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("=======");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }
        System.out.println("=======");
        for (int value : array) {
            System.out.println(value);
        }
        System.out.println("=======");

//        int[][] matrix = new int[4][3];
        int[][] matrix = {
                {1, 30000, 3},
                {14, 4, 3},
                {14, 3, 5},
                {6, 3, 3},
        };
        System.out.println("====");
        int sum = 0;
        for (int j = 0; j < matrix[0].length; j++) {
            int max = matrix[0][j];
            for (int i = 1; i < matrix.length; i++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
            System.out.println(max);
            for (int i = 0; i < matrix.length; i++) {
                if (matrix[i][j] == max) {
                    sum += max;
                }
            }
        }
        System.out.println("sum=" + sum);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
//                System.out.print(matrix[i][j] + "\t");
                System.out.printf("%10d", matrix[i][j]);
            }
            System.out.println();
        }

        System.out.println("1^2=" + (1 ^ 2));
        System.out.println("5^6=" + (5 ^ 6));
        /*
         * 01
         * ^
         * 10
         * --
         * 11
         *
         * 101
         * ^
         * 110
         * ---
         * 011
         *
         * */


        System.out.println("Done!");
    }
}
