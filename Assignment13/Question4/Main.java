// Name: Priyanshi Sharma
// Roll No: BCS2025582
// Assignment 13, Question 4

class Main {
    public static void main(String[] args) {
        String word = "abc";
        for (int i = 0; i < word.length(); i++) {
            for (int j = i + 1; j <= word.length(); j++) {
                System.out.println(word.substring(i, j));
            }
        }
    }
}
