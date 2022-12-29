package controller;

import model.DataModel;
import view.ConsoleView;

import java.util.Scanner;

public class MainController {

    private final DataModel model;
    private final ConsoleView view;

    public MainController() {
        this.model = new DataModel();
        this.view = new ConsoleView();
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        view.show();
        String line;
        boolean run = true;
        while (run && scanner.hasNextLine()) {
            line = scanner.nextLine();
            switch (line) {
                case "1": {
                    view.show(model);
                    break;
                }
                case "2": {
                    model.setFirst(readArray(scanner));
                    break;
                }
                case "3": {
                    model.setSecond(readArray(scanner));
                    break;
                }
                case "4": {
                    if(!model.validate()) view.errorEmpty();
                    else view.show(model.calculate());
                    break;
                }
                case "5": {
                    run = false;
                    break;
                }
            }
            if(run) view.show();
        }
        scanner.close();
    }

    private int[] readArray(Scanner scanner) {
        int length = 0;
        String line;
        view.setLength();
        while (scanner.hasNextLine()) {
            line = scanner.nextLine();
            try{
                length = Integer.parseInt(line);
                if(length > 0) break;
                else view.errorLength();
            } catch (Exception ignored){
                view.errorNumber();
            }
            view.setLength();
        }
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            view.setValue(i+1);
            line = scanner.nextLine();
            try{
                arr[i] = Integer.parseInt(line);
            } catch (Exception ignored){
                view.errorNumber();
                i--;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        new MainController().run();
    }
}
