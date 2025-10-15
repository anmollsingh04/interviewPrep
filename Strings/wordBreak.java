import java.util.*;

class GfG {
    static boolean wordBreakRec(int i, String s,
                                String[] dictionary)
    {
        if (i == s.length())
            return true;

        String prefix = "";

        for (int j = i; j < s.length(); j++) {
            prefix += s.charAt(j);

            // Check if the prefix exists in the dictionary
            if (Arrays.asList(dictionary).contains(prefix)
                && wordBreakRec(j + 1, s, dictionary)) {
                return true;
            }
        }
        return false;
    }

    static boolean wordBreak(String s, String[] dictionary)
    {
        return wordBreakRec(0, s, dictionary);
    }

    public static void main(String[] args)
    {
        String s = "ilike";
        String[] dictionary = { "i", "like", "gfg" };

        System.out.println(
            wordBreak(s, dictionary) ? "true" : "false");
    }
}
