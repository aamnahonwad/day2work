class Vowel {
    int countVowels(String s) {
        int c = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if ("aeiouAEIOU".indexOf(ch) != -1) c++;
        }
        return c;
    }
}

class Vowelcount {
    public static void main(String[] args) {
        Vowel v = new Vowel();
        System.out.println(v.countVowels("Aamna"));
    }
}