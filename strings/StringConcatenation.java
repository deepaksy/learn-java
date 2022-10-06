package strings;
// There is two way to concat strings.

/*
 * 1. using '+' operator.
 * 2. using concat() function
 */
public class StringConcatenation {
    public static void main(String[] args) {
        String name="Deepak";
        String surname="Suryawanshi";
        String fullName=name+" "+surname;
        String concatFullName = name.concat(surname);
        System.out.println("Fullname: "+fullName);
        System.out.println("Concat name: "+concatFullName);
    }
}

// Note: - String are immutable data type.