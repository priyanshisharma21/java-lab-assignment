// Name: Priyanshi Sharma
// Roll No: BCS2025582
// Assignment 13, Question 2

class Main {
    public static void main(String[] args) {
        String word = "Java";
        String reversed = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }
        System.out.println("Reversed: " + reversed);
    }
}
