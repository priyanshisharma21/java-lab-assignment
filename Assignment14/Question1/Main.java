// Name: Priyanshi Sharma
// Roll No: BCS2025582
// Assignment 14, Question 1

class Main {
    public static void main(String[] args) {
        String s = "programming";
        int vowels = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowels++;
            }
        }
        System.out.println("Vowels: " + vowels);
    }
}
