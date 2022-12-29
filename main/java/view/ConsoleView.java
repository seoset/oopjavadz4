package view;

import model.DataModel;

import java.util.Arrays;

public class ConsoleView {
    public void show() {
        System.out.print("Выберите действие:\n1) Просмотр данных\n2) Установить 1 массив\n3) Установить 2 массив\n4) Результат\n5) Выход\nОтвет: ");
    }

    public void show(DataModel model) {
        System.out.printf(
                "Текущие значения:%n1 массив: %s%n2 массив: %s%n",
                model.getFirst() == null ? "Не установлено" : Arrays.toString(model.getFirst()),
                model.getSecond() == null ? "Не установлено" : Arrays.toString(model.getSecond())
        );
    }

    public void errorEmpty() {
        System.out.println("Заполните данные массивов");
    }

    public void errorNumber() {
        System.out.println("Введите число");
    }

    public void errorLength() {
        System.out.println("Длинна массива не может быть < 1");
    }

    public void setLength() {
        System.out.print("Введите длинну массива: ");
    }

    public void setValues() {
        System.out.println("Введите значения массива: ");
    }

    public void setValue(int i) {
        System.out.printf("Укажите %s значение массива: ", i);
    }

    public void show(int[][] res) {
        System.out.println("Результат: ");
        for (int[] re : res) {
            System.out.println(Arrays.toString(re));
        }
    }
}
