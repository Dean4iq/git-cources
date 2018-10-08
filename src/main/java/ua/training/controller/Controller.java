package ua.training.controller;

import ua.training.model.Model;
import ua.training.view.View;

import java.util.Scanner;

public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void operateUserRequests() {
        Scanner scanner = new Scanner(System.in);

        view.printMessage(View.STARTUP_INTRODUCTION);

        model.setFirstWord(inputFisrtWord(scanner));
        model.setSecondWord(inputSecondWord(scanner));
        view.printMessage(View.OUTPUT_WORDS + model.getFirstWord() + " "
                + model.getSecondWord());
        view.printMessage(View.SHUTDOWN_MESSAGE);
    }

    private String inputFisrtWord(Scanner scanner) {
        view.printMessage(View.INPUT_FIRST_WORD);
        String inputWord;

        while (!(inputWord = scanner.next()).equals("Hello")) {
            view.printMessage(View.WRONG_INPUT_WORD);
        }
        return inputWord;
    }

    private String inputSecondWord(Scanner scanner) {
        view.printMessage(View.INPUT_SECOND_WORD);
        String inputWord;

        while (!(inputWord = scanner.next()).equals("world!")) {
            view.printMessage(View.WRONG_INPUT_WORD);
        }
        return inputWord;
    }
}