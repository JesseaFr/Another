public class Two {
    public static void main(String[] args) {
        int[][] matrix;
        matrix = new int[3][3];
        for(int i = 0; i < matrix.length; i++) {         
            for(int j = 0; j < matrix[i].length; j++) {   
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();  
        }

        int[][] nums = new int[2][2];
        System.out.println("First element = " + nums[0][0]);
    }
}

