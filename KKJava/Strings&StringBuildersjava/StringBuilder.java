public class StringBuilder {

    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        builder.append("Be Motivated");
        System.out.println(builder.toString()); // Output: Be Motivated

        // different methods in StringBuilders are:
        builder.insert(3, " Always "); // Insert " Always " at index 3
        System.out.println(builder.toString()); // Output: Be Always Motivated
        builder.replace(3, 10, " Stay "); // Replace characters from index 3 to 10 with " Stay "
        System.out.println(builder.toString()); // Output: Be Stay Motivated
        builder.delete(3, 8); // Delete characters from index 3 to 8
        System.out.println(builder.toString()); // Output: Be Motivated
        builder.reverse(); // Reverse the entire string
        System.out.println(builder.toString()); // Output: detavitoM eB
        builder.setLength(5); // Set the length of the string to 5
        System.out.println(builder.toString()); // Output: detav
        builder.clone(); // Clone the StringBuilder object
        System.out.println(builder.toString()); // Output: detav
        builder.capacity(); // Get the current capacity of the StringBuilder
        System.out.println(builder.toString()); // Output: detav
        builder.ensureCapacity(50); // Ensure the capacity is at least 50
        System.out.println(builder.toString()); // Output: detav
        builder.charAt(2); // Get the character at index 2
        System.out.println(builder.toString()); // Output: detav
        builder.indexOf("a"); // Get the index of the first occurrence of "a"
        System.out.println(builder.toString()); // Output: detav
        builder.lastIndexOf("t"); // Get the index of the last occurrence of "t"
        System.out.println(builder.toString()); // Output: detav
        builder.substring(1, 4); // Get the substring from index 1 to 4
        System.out.println(builder.toString()); // Output: detav
        builder.toString(); // Convert to String
        System.out.println(builder.toString()); // Output: detav
        builder.trimToSize(); // Trim the capacity to the current size
        System.out.println(builder.toString()); // Output: detav
        builder.getClass(); // Get the class of the StringBuilder object
        System.out.println(builder.toString()); // Output: detav
        builder.hashCode(); // Get the hash code of the StringBuilder object
        System.out.println(builder.toString()); // Output: detav
        builder.equals(builder); // Check if the StringBuilder is equal to itself
        System.out.println(builder.toString()); // Output: detav
        builder.notify(); // Notify a thread waiting on this object's monitor
        System.out.println(builder.toString()); // Output: detav
        builder.notifyAll(); // Notify all threads waiting on this object's monitor
        System.out.println(builder.toString()); // Output: detav
        builder.wait(1); // Wait for 1 millisecond
        System.out.println(builder.toString()); // Output: detav
        builder.wait(1, 1); // Wait for 1 millisecond and 1 nanosecond
        System.out.println(builder.toString()); // Output: detav
        builder.wait(); // Wait indefinitely
        System.out.println(builder.toString()); // Output: detav
        builder.finalize(); // Finalize the object
        System.out.println(builder.toString()); // Output: detav

        // Note: Some methods like notify(), wait(), and finalize() are inherited from
        // Object class and are not typically used with StringBuilder.
        // Also, methods like clone() return a new object, so their effects are not
        // visible in the original StringBuilder.
        // The outputs shown are for demonstration purposes; actual usage may vary.
        // and many more...

    }

}