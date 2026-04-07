public class streamStringRec {
    public static void main(String[] args) {
        // skip("", "abcdefghij"); // skip all a's

        System.out.println(skipAppNotApple("", "abcdefghij"));
    }

    // static void skip(String p, String up){ // p is processed, up is unprocessed
    // if(up.isEmpty() ){ // base case
    // System.out.println(p);
    // return;
    // }

    // char ch = up.charAt(0); // first char of unprocessed string
    // if(ch=='a'){ // if char is a, skip it and call recursion on remaining string
    // skip(p, up.substring(1)); // skip the char and call recursion on remaining
    // string
    // } else {// if char is not a, add it to processed string and call recursion on
    // remaining string
    // skip(p + ch, up.substring(1));
    // }

    // static String skip(String p, String up){ // p is processed, up is unprocessed
    // if(up.isEmpty() ){ // base case
    // return "";
    // }

    // char ch = up.charAt(0); // first char of unprocessed string
    // if(ch=='a'){ // if char is a, skip it and call recursion on remaining string
    // return skip( up.substring(1)); // skip the char and call recursion on
    // remaining string
    // } else {// if char is not a, add it to processed string and call recursion on
    // remaining string
    // return ch+ skip( up.substring(1));
    // }

    // }

    // static String skipApple(String p, String up){ // p is processed, up is
    // unprocessed
    // if(up.isEmpty() ){ // base case
    // return "";
    // }
    // if(up.startsWith("apple")){ // if string starts with "apple", skip it and
    // call recursion on remaining string
    // return skipApple( up.substring(5)); // skip the char and call recursion on
    // remaining string
    // } else{
    // return up.charAt(0)+ skipApple( up.substring(1));
    // }

  static String skipAppNotApple(String p, String up){ // p is processed, up is unprocessed
    if(up.isEmpty() ){ // base case
        return "";
    }
        if(up.startsWith("app" && up.startsWith(apple))){ // if string starts with "apple", skip it and call recursion on remaining string
             return skipAppNotApple( up.substring(3)); // skip the char and call recursion on remaining string
 } else{
           return up.charAt(0)+ skipApple( up.substring(1));
    }


}