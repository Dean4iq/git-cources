package ua.training.view;

public class View {
    public static final String STARTUP_INTRODUCTION =
                                                     "Follow the instructions";
    public static final String INPUT_FIRST_WORD = "Input your first word: ";
    public static final String INPUT_SECOND_WORD = "Input your second word: ";
    public static final String WRONG_INPUT_WORD =
                                        "Your input word was wrong. Try again";
    public static final String OUTPUT_WORDS = "Your words you inputted: ";
    public static final String SHUTDOWN_MESSAGE = "Flawless victory!";

    public void printMessage(String message) {
        System.out.println(message);
    }
}
