public class SearchSortedMatrix {

    public static boolean searchMatrix(int[][] matrix, int target) {

        // m = number of rows
        // n = number of columns
        // mat.length → total rows
        // mat[0].length → columns in first row

        int m = matrix.length;
        int n = matrix[0].length;

        int i = 0; // row
        int j = n - 1; // column

        while (i < m && j >= 0) {
            if (matrix[i][j] == target) {
                return true;
            } else if (matrix[i][j] > target) {
                j--;
            } else {
                i++;
            }

        }
        return false;

    }

    public static void main(String[] args) {
        int[][] matrix = {
                { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 27, 29, 37, 48 },
                { 32, 33, 39, 50 }
        };
        int target = 23;

        if (searchMatrix(matrix, target)) {
            System.out.println("Element found");
        } else {
            System.out.println("Element not found");
        }
    }
}



// Each row is sorted left → right
// Each column is sorted top → bottom
// 🔍 Efficient Search Method (Top-Right Corner Approach)

// Start from the top-right corner of the matrix.

// ✅ Algorithm:
// Let position = (row = 0, col = n-1)
// While row < m and col ≥ 0:
// If element == target → ✅ Found
// If element > target → move left (col--)
// If element < target → move down (row++)

// 💡 Why this works:
// Moving left decreases value
// Moving down increases value
// So you eliminate one row or column at each step.

// ⏱️ Time Complexity:
// O(m + n)
// (m = rows, n = columns)


// 📌 Example:
// Matrix:

// 10 20 30 40
// 15 25 35 45
// 27 29 37 48
// 32 33 39 50

// Search for 29:

// Start at 40 (top-right) → too big → move left
// 30 → too big → move left
// 20 → too small → move down
// 25 → too small → move down
// 29 → ✅ Found