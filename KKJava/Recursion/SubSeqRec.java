public class SubSeqRec {
    public static void main(String[] args) {
        SubSeq(" ", "abc");
    }

    static void SubSeq(String p, String up) {
        if (up.isEmpty()) { // base case
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0); // first char of unprocessed string
        // two options for every char, either we can include it in the processed string
        // or we
        // can exclude it from the processed string, so we will call recursion twice for
        // every char
        SubSeq(p + ch, up.substring(1));
        SubSeq(p, up.substring(1));
    }

}
