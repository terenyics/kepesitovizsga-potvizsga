package hu.nive.ujratervezes.lettermultiplier;

public class LetterMultiplier {

    public String multiply(String input, int number) {
        if (input == null || input.equals("") || number < 0) {
            throw new IllegalArgumentException("Unsupported argument provided.");
        }

        String output = "";

        for (char letter : input.toCharArray()) {
            for (int i=0; i<number; i++) {
                output+=letter;
            }
        }
        return output;
    }
}
