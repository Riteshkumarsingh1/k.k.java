// public class leetcode832flippingImage {
//     public static void main(String[] args) {
//         int[][] image = { { 1, 1, 0 }, { 1, 0, 1 }, { 0, 0, 0 } };
//         int[][] ans = flipAndInvertImage(image);
//         for (int i = 0; i < ans.length; i++) {
//             for (int j = 0; j < ans[0].length; j++) {
//                 System.out.print(ans[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }

//     private static int[][] flipAndInvertImage(int[][] image) {
//         int m = image.length;
//         int n = image[0].length;
//         int[][] ans = new int[m][n];
//         for (int i = 0; i < m; i++) {
//             for (int j = 0; j < n; j++) {
//                 ans[i][j] = image[i][n - 1 - j] ^ 1;
//             }
//         }
//         return ans;
//     }
// }

/// other solution using bit manipulation

class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for (int[] row : image) {
            // reverse the array
            for (int i = 0; i < (image[0].length + 1) / 2; i++) {
                // swap
                int temp = row[i] ^ 1;
                row[i] = row[image[0].length - i - 1] ^ 1;
                row[image[0].length - i - 1] = temp;

            }
        }
        return image;
    }
}