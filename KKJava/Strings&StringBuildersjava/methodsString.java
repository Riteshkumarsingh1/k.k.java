public class methodsString {
    public static void main(String[] args) {
        String name = "Ritesh kumarn Singh";
        System.out.println(Arraysname.toCharArray());
        name.getBytes();// converts string to byte array
        System.out.println(name.toString()); // Output: Ritesh kumarn Singh
        name.length();// returns length of string
        System.out.println(name.toString()); // Output: Ritesh kumarn Singh
        name.equals("Ritesh kumarn Singh");// compares two strings
        System.out.println(name.toString()); // Output: Ritesh kumarn Singh
        name.equalsIgnoreCase("ritesh kumarn singh");// compares two strings ignoring case
        System.out.println(name.toString()); // Output: Ritesh kumarn Singh
        name.charAt(5);// returns char at specified index
        System.out.println(name.toString()); // Output: Ritesh kumarn Singh
        name.indexOf("k");// returns index of first occurrence of specified char
        System.out.println(name.toString()); // Output: Ritesh kumarn Singh
        name.substring(7);// returns substring from specified index
        System.out.println(name.toString()); // Output: Ritesh kumarn Singh
        name.toLowerCase();// converts string to lowercase
        System.out.println(name.toString()); // Output: Ritesh kumarn Singh
        name.toUpperCase();// converts string to uppercase
        System.out.println(name.toString()); // Output: Ritesh kumarn Singh
        name.trim();// removes leading and trailing spaces
        System.out.println(name.toString()); // Output: Ritesh kumarn Singh
        name.replace("Ritesh", "Ritesh Kumar");// replaces old char/substring with new char/substring
        System.out.println(name.toString()); // Output: Ritesh kumarn Singh
        name.split(" ");// splits string into array of substrings based on specified delimiter
        System.out.println(name.toString()); // Output: Ritesh kumarn Singh
        name.contains("kumarn");// checks if string contains specified substring
        System.out.println(name.toString()); // Output: Ritesh kumarn Singh
        name.startsWith("Ritesh");// checks if string starts with specified
        System.out.println(name.toString()); // Output: Ritesh kumarn Singh
        name.endsWith("Singh");// checks if string ends with specified
        System.out.println(name.toString()); // Output: Ritesh kumarn Singh
        name.concat(" is learning Java");// concatenates specified string to the end of the string
        System.out.println(name.toString()); // Output: Ritesh kumarn Singh
        name.compareTo("Another String");// compares two strings lexicographically
        System.out.println(name.toString()); // Output: Ritesh kumarn Singh
        name.intern();// returns canonical representation of the string
        System.out.println(name.toString()); // Output: Ritesh kumarn Singh
        name.getClass();// returns the runtime class of the string object
        System.out.println(name.toString()); // Output: Ritesh kumarn Singh
        name.hashCode();// returns the hash code of the string
        System.out.println(name.toString()); // Output: Ritesh kumarn Singh
        name.isEmpty();// checks if the string is empty
        System.out.println(name.toString()); // Output: Ritesh kumarn Singh

        // Note: Strings in Java are immutable, so methods that modify the string
        // actually return a new string.
        // The outputs shown are for demonstration purposes; actual usage may vary.
        // Also, some methods like getClass() and hashCode() are inherited from Object
        // class.
        // The original string remains unchanged after method calls.
        // For example, after calling name.toLowerCase(), the original 'name' variable
        // still holds "Ritesh kumarn Singh".
        // To see the effect of these methods, you would need to assign the result back
        // to a string variable.
        // For example:
        // name = name.toLowerCase();
        // System.out.println(name); // Output: ritesh kumarn singh
        // Similarly for other methods that return modified strings.
        // This demonstrates the immutability of strings in Java.
        // Always remember to assign the result to a new variable or the same variable
        // if you want to keep the changes.
        // Example:
        // String lowerCaseName = name.toLowerCase();
        // System.out.println(lowerCaseName); // Output: ritesh kumarn singh

        // and many more...
    }
}
