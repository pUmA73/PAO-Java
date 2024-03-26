public class Strings_RegEx {
    public static void main(String[] args) {
        System.out.println("c".matches("[cde]"));
        System.out.println("C".matches("[^xyz]"));
        System.out.println("b".matches("[a-z]"));
        System.out.println("A".matches("[a-zA-Z]"));
        System.out.println("abba".matches("[abc]+"));
        System.out.println("".matches("[abc]*"));
        System.out.println("abbac".matches("[abc]{5}"));
        System.out.println("aaabbbccc".matches("[abc]{5,}"));
        System.out.println("aaabbbccc".matches("[abc]{5,10}"));

        String str = "Odata creat un sir de caractere cu continutul sau nu mai poate fi modificat.";

        // lungimea sirului
        System.out.println(str.length());

        System.out.println(str.matches("[a-zA-Z .]*"));

        String[] words = str.split("\\s+");
        int mij = words.length / 2;
        System.out.println("Cuvintele din mijloc: " + words[mij - 1] + ", " + words[mij]);

        String inv = new StringBuilder(str).reverse().toString();
        System.out.println("Sirul inversat: " + inv);

    }
}
