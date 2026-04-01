import java.util*;

public class permutationRec {
    public static void main(String[] args) {
        // permutation("", "abc");

        ArrayList<String> ans = permutation("", "abc");
        System.out.println(ans);
    }

    // static void permutation(string processed, string unprocessed) {
    // // base case
    // if (unprocessed.isEmpty()) {
    // System.out.println(processed);
    // return;
    // }
    // char ch = unprocessed.charAt(0);
    // for (int i = 0; i <= processed.length(); i++) {
    // String first = processed.substring(0, i);
    // String second = processed.substring(i, processed.length());
    // permutation(first + ch + second, unprocessed.substring(1));
    // }
    // }

    static ArrayList<String> permutation(String processed, String unprocessed) {
        // base case
        if (unprocessed.isEmpty()) {
            // local variable to store the answer and return it to the caller
            ArrayList<String> ans = new ArrayList<>();
            ans.add(processed);
            return ans;
        }
        char ch = unprocessed.charAt(0);
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i <= processed.length(); i++) {

            String first = processed.substring(0, i);
            String second = processed.substring(i, processed.length());
            list.addAll(permutation(first + ch + second, unprocessed.substring(1)));
        }
        return list;
    }
}