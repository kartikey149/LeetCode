class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        int rows = matrix.length;
        int cols = matrix[0].length;
        int[] strore = new int[rows * cols];
        int h = 0;

        // Define boundaries
        int top = 0;
        int bottom = rows - 1;
        int left = 0;
        int right = cols - 1;

        while (h < rows * cols) {
            // 1. Move Right across the top row
            for (int j = left; j <= right && h < strore.length; j++) {
                strore[h++] = matrix[top][j];
            }
            top++; // Move the top boundary down

            // 2. Move Down the right column
            for (int i = top; i <= bottom && h < strore.length; i++) {
                strore[h++] = matrix[i][right];
            }
            right--; // Move the right boundary left

            // 3. Move Left across the bottom row
            for (int j = right; j >= left && h < strore.length; j--) {
                strore[h++] = matrix[bottom][j];
            }
            bottom--; // Move the bottom boundary up

            // 4. Move Up the left column
            for (int i = bottom; i >= top && h < strore.length; i--) {
                strore[h++] = matrix[i][left];
            }
            left++; // Move the left boundary right
        }

        // Print the result
        

        List<Integer> list = new ArrayList<>(strore.length);
for (int i : strore) {
    list.add(i);
}
        return list;
        
    }
}