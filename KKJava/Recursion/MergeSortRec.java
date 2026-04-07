// class solution{
//     public static void main(String[] args) {
//         int arr[] = { 5, 4, 3, 2, 1 };
//         arr = mergeSort(arr, 0, arr.length-1);
//         System.out.println(Arrays.toString(arr));
//     }
//     static int[] mergeSort(int[]  arr, int s, int e){
//         //base case
//         if(arr.length ==1){
//             return arr;
//         }
//         //find the mid element of the array and divide the array into two halves
//         int mid = arr.length/2;
//         int[] left = mergeSort(Arrays.copyOfRange(arr, s, mid));
//         int[] right = mergeSort(Arrays.copyOfRange(arr, mid+1, e));
//         return merge(left, right);
//     }
//     private static int[] merge(int[] first, int[] second) {
//         //create a new array to store the merged elements of the two arrays
//         int[] ans = new int[first.length + second.length];
//         int i=0, j=0, k=0;
//         //traverse both the arrays and add the smaller element to the answer array
//         while(i<first.length && j<second.length){
//             if(first[i] < second[j]){
//                 ans[k] = first[i++];
//             }else{
//                 ans[k] = second[j++];
//                 j++;
//             }
//             i++;
//             //it may be possible that one of the two arrays is not completely traversed, so we need to add the remaining elements of that array to the answer array
//             //if we are here that means one of the two arrays is completely traversed, so we need to add the remaining elements of the other array to the answer array
//         }
//         while(i<first.length){
//             ans[k] = first[i];
//             i++;
//             k++;
//         }
//         while(j<second.length){
//             ans[k] = second[j];
//             j++;
//             k++;
//         }
//         return ans;
//     }
// }

class solution {
    public static void main(String[] args) {
        int arr[] = { 5, 4, 3, 2, 1 };
        mergeSortInPlace(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    static void mergeSortInPlace(int[] arr, int s, int e) {
        // base case
        if (e - s == 1) {
            return;
        }
        // find the mid element of the array and divide the array into two halves
        int mid = arr.length / 2;
        mergeSortinplace(arr, s, mid);
        mergeSortinplace(arr, mid + 1, e);
        mergeInPlace(arr, s, mid, e);
    }

    private static void mergeInPlace(int[] arr, int s, int mid, int e) {
        // create a new array to store the merged elements of the two arrays
        int[] ans = new int[first.length + second.length];
        int i = s, j = mid + 1, k = s;
        // traverse both the arrays and add the smaller element to the answer array
        while (i <= mid && j <= e) {
            if (arr[i] < arr[j]) {
                ans[k] = arr[i++];
            } else {
                ans[k] = arr[j++];
                j++;
            }
            i++;
            // it may be possible that one of the two arrays is not completely traversed, so
            // we need to add the remaining elements of that array to the answer array
            // if we are here that means one of the two arrays is completely traversed, so
            // we need to add the remaining elements of the other array to the answer array
        }
        while (i < first.length) {
            ans[k] = first[i];
            i++;
            k++;
        }
        while (j < second.length) {
            ans[k] = second[j];
            j++;
            k++;
        }
        for (int l = 0; l < ans.length; l++) {
            arr[s + l] = ans[l];
        }
    }
}