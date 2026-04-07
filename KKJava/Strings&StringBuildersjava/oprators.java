import java.util.ArrayList;

public class oprators {
    public static void main(String[] args) {
     System.out.println('a'+'b'); // it will print the sum of their ascii values
     System.out.println('a'); // it will print the character itself
     System.out.println("a"+"b"); // it will concatenate the two strings
     System.out.println('a'+1); // it will print the ascii value of 'a' plus 1
    System.out.println(char('a'+1)); // it will print the next character of 'a' that is 'b'
    System.out.println("a"+1); // it will concatenate string with integer
    // thos is after a few steps : "a" + "1"
    //integer will be converted to intger that will call toString() method of integer class

    System.out.println("Ritesh"+new ArrayList<>()); // it will print the string concatenated with the string representation of the ArrayList object
    System.out.println("Ritesh"+new Integer(value:56)); // it will print the string concatenated with the string representation of the Integer object
}

}
