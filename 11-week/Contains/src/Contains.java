public class Contains {
    public static boolean contains(String haystack, String needle) {
        if (haystack.equals(needle)) {
            return true;
        } else if (haystack.length() < needle.length()) {
            return false;
        } else if (haystack.charAt(0) == needle.charAt(0)) {
            if (needle.length() == 1) {
                return true;
            }
            return contains(haystack.substring(1), needle.substring(1));
        } else {
            return contains(haystack.substring(1), needle);
        }
    }

    public static void main(String[] args) {
        System.out.println(contains("haystack", "needle"));
        System.out.println(contains("haystack", "hay"));
        System.out.println(contains("haystack", "stack"));
        System.out.println(contains("haystack", "Hay"));
        System.out.println(contains("supercalifragilisticexpialidocious", "list"));
        System.out.println(contains("testcase", "tca"));
        System.out.println(contains("Hooray, it works! Good job!", "works"));
    }
}

// TEST CASE OUTPUT
// false
// true
// true
// false
// true
// true
// true