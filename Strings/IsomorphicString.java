class GfG {
    public static boolean areIsomorphic(String s1, String s2) {

        int n = s1.length();

        // Check every character of s1
        for (int i = 0; i < n; i++) {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);

            // Check all occurrences of c1 in s1
            // and corresponding occurrences of c2 in s2
            for (int j = 0; j < n; j++) {

                // If we find another occurrence of c1 in s1,
                // it must match the corresponding character in s2
                if (s1.charAt(j) == c1 && s2.charAt(j) != c2) {
                    return false;
                }

                // If we find another occurrence of c2 in s2,
                // it must match the corresponding character in s1
                if (s2.charAt(j) == c2 && s1.charAt(j) != c1) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String s1 = "aab";
        String s2 = "xxy";

        if (areIsomorphic(s1, s2)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
