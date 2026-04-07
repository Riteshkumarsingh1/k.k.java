public class AsciValCharRec {
    public static void main(String[] args) {
        AsciValChar("", "abc");
    }
}

static void AsciValChar(String p, String up) {
    if (up.isEmpty()) {
        System.out.println(p);
        return;
    }
    char ch = up.charAt(0);
    AsciValChar(p + ch, up.substring(1)); // include char in processed string and call recursion on remaining string
    AsciValChar(p + (ch + 0), up.substring(1)); // include ascii value of char in processed string and call recursion on
                                                // remaining string
    AsciValChar(p, up.substring(1)); // exclude char from processed string and

}
