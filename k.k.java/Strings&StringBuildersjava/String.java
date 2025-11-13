public class Strings {
    public static void main(String[] args) {
        // string name = "Ritesh Kumar Singh";
        // System.out.println(name);

        // string a="ram";
        // System.out.println(a);
        // a = "rajan"; // a new obj will be created due to immutability nature of
        // string.
        // System.out.println(a);

        string a = "ram";
        string b = "ram";
        // ==
        // system.out.println(a==b); // true, both a and b point to same object in
        // string pool.

        // string name1 =new string ("ram");
        // string name2 =new string ("ram");
        // System.out.println(name1==name2); // false, both name1 and name2 point to
        // different objects in heap memory.

        // string a = "ram";
        // string b= "ram";
        // string c = a;System.out.println(c==a); // true, both c and a point to same
        // object in string pool.

        String name1 = new String("Ritesh");
        String name2 = new String("Ritesh");
        System.out.println(name1.equals(name2)); // true, because equals() method compares the content or values of the
                                                 // strings object.
        System.out.println(name1.charAt(0)); // it gives the charater at the requested index.

    }
}
