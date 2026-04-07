public class Performance {
    public static void main(String[] args) {
        String series = "";
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i); // it will generate characters from 'a' to 'z'
            // System.out.println(ch);
            // or // series += ch; // or
            series = series + ch; // concatenation of characters to form a string
        }
        System.out.println(series); // it will print the concatenated string of characters from 'a' to 'z'
    }

}
