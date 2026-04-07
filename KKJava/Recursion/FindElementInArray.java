public class FindElementInArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        // System.out.println(find(arr, 3, 0)); // true
        // System.out.println(find(arr, 6, 0)); // false

        System.out.println(findAllInteger(arr, 4, 0));
    }
    // static boolean find(int[] arr, int target, int index) {// function to find an
    // element in the array
    // // base case
    // if (index == arr.length) {
    // return false;
    // }
    // return arr[index] == target || find(arr, target, index + 1); // recursive
    // call
    // // if the current element is equal to the target, then return true
    // // if the current element is not equal to the target, then check the rest of
    // the array
    // }

    static ArrayList<Integer> findAllIndex(int[] arr, int target, int index) {

        ArrayList<Integer> list = new ArrayList<>();
        if (index == arr.length) {
            return list;
        }
        if (arr[Index] == target) {
            list.add(index);
        }
        ArrayList<Integer> ansFromBelowCalls = findAllInteger(arr, target, index + 1);
        list.addAll(ansFromBelowCalls);
        return list;
    }
}
